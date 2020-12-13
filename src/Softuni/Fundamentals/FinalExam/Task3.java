package Softuni.Fundamentals.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Task3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count = 0;
		Map<String, Integer> health = new LinkedHashMap<>();
		Map<String, Integer> energy = new LinkedHashMap<>();
		while(!"Results".equals(input)) {
			String [] arr = input.split(":");
			switch (arr[0]) {
			case "Add":
				if(health.get(arr[1]) == null) {
					health.put(arr[1], Integer.parseInt(arr[2]));
					energy.put(arr[1], Integer.parseInt(arr[3]));
				}
				else {
					health.put(arr[1], health.get(arr[1]) + Integer.parseInt(arr[2]));
//					energy.put(arr[1], energy.get(arr[1]) + Integer.parseInt(arr[3]));
				}
				break;
			case "Attack":
				if(health.get(arr[1]) != null && health.get(arr[2]) != null) {
					if((health.get(arr[2]) - Integer.parseInt(arr[3])) > 0) {
						health.put(arr[2], health.get(arr[2]) - Integer.parseInt(arr[3]));
					}
					else {
						health.remove(arr[2]);
						energy.remove(arr[2]);
						System.out.printf("%s was disqualified!\n",arr[2]);
					}
					if((energy.get(arr[1]) - 1) <= 0) {
						health.remove(arr[1]);
						energy.remove(arr[1]);
						System.out.printf("%s was disqualified!\n",arr[1]);
					}
					else {
						energy.put(arr[1], energy.get(arr[1]) - 1);
					}
				}
				break;
			case "Delete":
				if("All".equals(arr[1])) {
					health.clear();
					energy.clear();
				}
				else {
					health.remove(arr[1]);
					energy.remove(arr[1]);
				}
				break;

			default:
				break;
			}
			input = sc.nextLine();
		}
		for(String s : health.keySet()) {
			count++;
		}
		System.out.printf("People count: %d\n", count);
		health.entrySet().stream()
		.sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()))
		.forEach(e -> {
			System.out.printf("%s - %d - %d\n", e.getKey(),e.getValue(),energy.get(e.getKey()));
		});;
	}
}
