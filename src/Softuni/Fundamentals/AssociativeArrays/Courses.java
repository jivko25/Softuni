package Softuni.Fundamentals.AssociativeArrays;

import java.util.*;


public class Courses {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> CoursesPeople = new TreeMap<>();
		Map<String, Integer> CoursesQuantity = new TreeMap<>();
		boolean isEnd = false;
		while(isEnd == false) {
				String input = sc.nextLine();
				if("end".equals(input)) 
				{
					isEnd = true;
					break;
				}
				String [] arr = input.split(" : ");
				if(CoursesQuantity.get(arr[0]) == null) 
				{
					CoursesQuantity.put(arr[0], 1);
					CoursesPeople.put(arr[1], arr[0]);
				}
				else
				{
					CoursesQuantity.put(arr[0], CoursesQuantity.get(arr[0]) + 1);
					CoursesPeople.put(arr[1], arr[0]);
				}
		}
		
		CoursesQuantity.entrySet().stream().
		sorted(( o1,o2) -> Integer.compare(o2.getValue(),o1.getValue())).forEach(
				p -> 
				{
					System.out.printf("%s: %d\n",p.getKey(),p.getValue());
					CoursesPeople.entrySet().stream().filter(a -> a.getValue().equalsIgnoreCase(p.getKey()))
					.sorted((o1,o2) -> o2.getValue().compareTo(o1.getValue()))
					.forEach(g -> System.out.printf("-- %s\n",g.getKey()));;
				}
				);
	}
}
