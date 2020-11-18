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
		
//		for(String n : CoursesQuantity.keySet())
//		{
//			System.out.printf("%s: %d\n",n, CoursesQuantity.get(n));
//				for(String k : CoursesPeople.keySet()) 
//				{
//					if(n.equals(CoursesPeople.get(k))) {
//						System.out.printf("-- %s\n",k);
//					}
//				}
//		}
		CoursesQuantity.entrySet().stream().sorted((f,s) -> f.getValue().compareTo(s.getValue())).forEach(System.out.printf("%s: %d\n",CoursesQuantity.keySet(), CoursesQuantity.get(CoursesQuantity.keySet())));;
	}
}
