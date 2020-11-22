package Softuni.Fundamentals.AssociativeArrays;

import java.util.*;

public class CompanyUsers {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> employees = new HashMap<>();
		boolean isEnd = false;
		while(isEnd == false) {
			String input = sc.nextLine();
			if("End".equals(input)) {
				isEnd = true;
				break;
			}
			String [] arr = input.split(" -> ");
				employees.put(arr[1], arr[0]);
		}
//		employees.entrySet().stream()
//		.sorted((a,b) -> a.getValue().compareTo(b.getValue()))
//		.forEach(e -> {
//			System.out.println(e.getValue());
//			employees.entrySet().stream()
//			.filter(k -> e.getValue().equals(k.getKey()))
//			.sorted((m,n) -> m.getKey().compareTo(n.getKey()) )
//			.forEach(c -> System.out.printf("-- %s\n",c.getKey()));;
//		});;
		for(String s : employees.values()) {
			System.out.printf("%s\n",s);
			for(String k : employees.keySet()) {
				if(s.equals(k)) {
					System.out.printf("-- %s\n",k);
				}
			}
		}
	}
}
