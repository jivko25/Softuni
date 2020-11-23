package Softuni.Fundamentals.AssociativeArrays;

import java.util.*;

public class Judge {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> counter = new HashMap<>();
		Map<String, Integer> points = new HashMap<>();
		Map<String, HashMap<String, String>> contests = new HashMap<>();
		boolean isEnd = false;
		while(isEnd == false) {
			String input = sc.nextLine();
			if("no more time".equals(input)) {
				isEnd = true;
				break;
			}
			String [] arr = input.split(" -> ");
			if(counter.get(arr[1]) == null) {
				HashMap<String, String> res = new HashMap<String, String>();
				counter.put(arr[1],1);
				res.put(arr[0], arr[2]);
				if(points.get(arr[0]) == null) {
					points.put(arr[0], Integer.parseInt(arr[2]));
				}
				else {
					points.put(arr[0], points.get(arr[0]) + Integer.parseInt(arr[2]));
				}
				contests.put(arr[1], res);
			}
			else {
				HashMap<String, String> res = contests.get(arr[1]);
				counter.put(arr[1], counter.get(arr[1]) + 1);
				res.put(arr[0], arr[2]);
				if(points.get(arr[0]) == null) {
					points.put(arr[0], Integer.parseInt(arr[2]));
				}
				else {
					points.put(arr[0], points.get(arr[0]) + Integer.parseInt(arr[2]));
				}
			}
		}
		contests.entrySet().stream()
		.sorted((a,b) -> Integer.compare(counter.get(b.getKey()), counter.get(a.getKey())))
		.forEach(e -> {
			final int[] n = {1};
			System.out.printf("%s: %d participants\n",e.getKey(),counter.get(e.getKey()));
			e.getValue().entrySet().stream()
			.sorted((a,b) -> Integer.compare(Integer.parseInt(b.getValue()),Integer.parseInt(a.getValue())))
			.forEach(r -> {
				System.out.printf("%d. %s <::> %s\n",n[0],r.getKey(),r.getValue());
				n[0]++;
			});;
		});;
		final int[] n = {1};
		System.out.println("Individual standings:");
		points.entrySet().stream()
		.sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()))
		.forEach(c -> {
			System.out.printf("%d. %s -> %s\n",n[0],c.getKey(),c.getValue());
			n[0]++;
		});;
	}
}
