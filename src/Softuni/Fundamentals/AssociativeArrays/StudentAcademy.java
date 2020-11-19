package Softuni.Fundamentals.AssociativeArrays;

import java.util.*;

public class StudentAcademy {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> names = new ArrayList<>();
		List<Double> grades = new ArrayList<>();
		Map<String, Double> avr = new HashMap<>();
		Map<String, Integer> count = new HashMap<>();
		Map<String, Double> sum = new HashMap<>();
		for(int i = 0; i < n*2; i++) 
		{
			if(i%2 ==0) 
			{
				String name = sc.nextLine();
				names.add(name);
			}
			else 
			{
				Double grade = Double.parseDouble(sc.nextLine());
				grades.add(grade);
			}
		}
		for(int i = 0;i<n;i++) 
		{
			if(avr.get(names.get(i)) == null) {
				count.put(names.get(i), 1);
			}
			else {
				count.put(names.get(i), count.get(names.get(i)+1));
			}
		}
	}
}
