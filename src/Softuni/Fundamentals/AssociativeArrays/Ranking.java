package Softuni.Fundamentals.AssociativeArrays;

import java.util.*;

public class Ranking {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> contests = new HashMap<>();
		HashMap<String, HashMap<String, Integer>> participants = new HashMap<>();
		boolean contestsAreEnd = false;
		while(contestsAreEnd == false) {
			String input = sc.nextLine();
			if("end of contests".equals(input)) {
				contestsAreEnd = true;
				break;
			} 
			String [] arr = input.split(":");
			contests.put(arr[0], arr[1]);
		}
		
		boolean participantsAreEnd = false;
		while(participantsAreEnd == false) {
			String input = sc.nextLine();
			if("end of submissions".equals(input)) {
				participantsAreEnd = true;
				break;
			}
			String [] arr = input.split("=>");
			if(arr[1].equals(contests.get(arr[0]))) {
				if(participants.get(arr[2]) == null) {
					HashMap<String, Integer> res = new HashMap<>();
					res.put(arr[0],Integer.parseInt(arr[3]));
//					res.entrySet().stream().sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()));
					participants.put(arr[2], res);
				}
				else {
					HashMap<String, Integer> res = participants.get(arr[2]);
					if(res.get(arr[0]) == null) {
					res.put(arr[0], Integer.parseInt(arr[3]));
//					res.entrySet().stream().sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()));
					participants.put(arr[2], res);
					}
				}
			}
		}
		int max = 0;
		String maxC = null;
		for(String n : participants.keySet()) {
			int sum = 0;
			HashMap<String, Integer> v = participants.get(n);
			for(String m : v.keySet()) {
				sum += v.get(m);
			}
			if(sum>max) {
				max = sum;
				maxC = n;
			}
		}
		System.out.printf("Best candidate is %s with total %d points.\r\n"
				+ "Ranking:\n ",maxC,max);
		participants.entrySet().stream()
		.sorted((a,b) -> a.getKey().compareTo(b.getKey()))
		.forEach(e -> {
			System.out.println(e.getKey());
			e.getValue().entrySet().stream().sorted((a,b) -> Integer.compare(b.getValue(), a.getValue())).forEach(k -> System.out.println("#  " + k.getKey() + " -> " + k.getValue()));
		});;
	}
}
