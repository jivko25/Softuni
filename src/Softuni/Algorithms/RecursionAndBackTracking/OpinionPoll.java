package Softuni.Algorithms.RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OpinionPoll {
	static class Person{
		String name;
		int age;
			public Person(String name,int age) {
				this.name = name;
				this.age = age;
			}
			
		public int getAge(){
			return age;
		}
		
		public String getName() {
			return name;
		}
		
		public String toString() {
			return String.format("%s - %d", getName(),getAge());
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<Person> Persons = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			String input = sc.nextLine();
			String[] arr = input.split(" ");
			String name = arr[0];
			int age = Integer.parseInt(arr[1]);
			Person person = new Person(name,age);
			Persons.add(person);
		}
		Persons.stream()
					.filter(person -> person.getAge() > 30)
					.sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
					.forEach(person -> System.out.println(person.toString()));
	}
}
