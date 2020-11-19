package Softuni.Fundamentals.AssociativeArrays;

import java.util.*;

public class StudentAcademy {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> input = new ArrayList<>();
		Map<String, Double> grades = new HashMap<>();
		Map<String, Integer> counter = new HashMap<>();
		for(int i = 0;i<n*2;i++) {
			String in = sc.nextLine();
			input.add(in);
		}
		for(int i = 0;i<n*2;i+=2) {
			if(grades.get(input.get(i)) == null) {
				grades.put(input.get(i), Double.parseDouble(input.get(i+1)));
				counter.put(input.get(i), 1);
			}
			else {
				grades.put(input.get(i), grades.get(input.get(i)) + Double.parseDouble(input.get(i+1)));
				counter.put(input.get(i), counter.get(input.get(i)) + 1);
			}
		}
		grades.entrySet().stream()
		.filter(e -> e.getValue()/counter.get(e.getKey()) >= 4.5 )
		.sorted((a,b) -> Double.compare(a.getValue()/counter.get(a.getKey()),b.getValue()/counter.get(b.getKey())))
		.forEach(d -> System.out.printf("%s -> %.2f",d.getKey(),d.getValue()/counter.get(d.getKey())));;
	}
}
