package Softuni.Fundamentals.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
	static class Student{
		String name;
		double mark;
		Student(String name,double mark){
			this.name = name;
			this.mark = mark;
		}
		
		public String getName(){
			return name;
		}
		
		public double getMark() {
			return mark;
		}
		
		public String toString(){
			return String.format("%s: %.2f", getName(),getMark());
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> allStudents = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<n;i++) {
			String input = sc.nextLine();
			String [] arr = input.split(" ");
			allStudents.add(new Student(String.format("%s %s", arr[0],arr[1]), Double.parseDouble(arr[2])));
		}
		allStudents.stream()
					.sorted((p1, p2)->Double.compare(p2.getMark(), p1.getMark()))
					.forEach(person -> System.out.println(person.toString()));
	}
}
