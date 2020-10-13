package Softuni.Fundamentals.Lists;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split(" ");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			numbers.add(Integer.parseInt(arr[i]));
		}
		boolean exit = true;
		while(exit==true) {
			String action = sc.nextLine();
			String [] actionArray = action.split(" ");
			switch (actionArray[0]) {
			case "Add":
				numbers.add(Integer.parseInt(actionArray[1]));
				break;
			case "Insert":
				if(Integer.parseInt(actionArray[2])>=numbers.size()) {
					System.out.println("Invalid index");
				}
				else {
				numbers.add(Integer.parseInt(actionArray[2]), Integer.parseInt(actionArray[1]));
				}
				break;
			case "Remove":
				if(Integer.parseInt(actionArray[1])>=numbers.size()) {
					System.out.println("Invalid index");
				}
				else {
				numbers.remove(Integer.parseInt(actionArray[1]));
				}
				break;
			case "Shift":
				if("left".equals(actionArray[1])) {
					int times = Integer.parseInt(actionArray[2]);
					for(int i = 1;i<=times;i++) {
						int temp = numbers.get(0);
						numbers.remove(0);
						numbers.add(temp);
					}
				}
				if("right".equals(actionArray[1])) {
					int times = Integer.parseInt(actionArray[2]);
					for(int i = 1;i<=times;i++) {
						int temp = numbers.get(numbers.size()-1);
						numbers.remove(numbers.size()-1);
						numbers.add(0, temp);
					}
				}
				break;
			case "End":
				exit = false;
				break;
			default:
				break;
			}
		}
		for(int i = 0;i<numbers.size();i++) {
			System.out.print(numbers.get(i) + " ");
		}
	}
}
