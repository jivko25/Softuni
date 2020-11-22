package Softuni.Fundamentals.AssociativeArrays;

import java.util.*;

public class CompanyUsers2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean isEnd = false;
		Map<String, ArrayList<String>> users = new HashMap<>();
		while(isEnd == false) {
			String input = sc.nextLine();
			if("End".equals(input)) {
				isEnd = true;
				break;
			}
			String [] arr = input.split(" -> ");
			if(users.get(arr[0]) == null) {
				ArrayList<String> inputList = new ArrayList<String>();
				inputList.add(arr[1]);
				users.put(arr[0], inputList);
			}
			else {
				ArrayList<String> inputList = new ArrayList<String>();
				inputList = users.get(arr[0]);
				inputList.add(arr[1]);
				users.put(arr[0], inputList);
			}
		}
		users.entrySet().stream()
		.sorted((a,b) -> a.getKey().compareTo(b.getKey()))
		.forEach(e -> {
			System.out.println(e.getKey());
//			users.entrySet().stream().forEach(k -> {
				for(int i = 0;i<e.getValue().size();i++) {
					System.out.printf("--%s\n",e.getValue().get(i));
				}
//			});
		});
	}
}
