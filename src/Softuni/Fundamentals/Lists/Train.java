package Softuni.Fundamentals.Lists;
import java.util.ArrayList;
import java.util.Scanner;

public class Train {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> wagons = new ArrayList<Integer>();
		String input = sc.nextLine();
		String [] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			wagons.add(Integer.parseInt(arr[i]));
		}
		int maxCapacity = Integer.parseInt(sc.nextLine());
		boolean exit = true;
		while(exit == true) {
			String action = sc.nextLine();
			String [] test = action.split(" ");
			if("end".equals(action)) {
				exit = false;
				break;
			}
			else if("Add".equals(test[0])) {
				if(Integer.parseInt(test[1])<=maxCapacity) {
					wagons.add(Integer.parseInt(test[1]));
				}
			}
			else {
				int num = Integer.parseInt(action);
				for(int k = 0;k<wagons.size();k++) {
					if((wagons.get(k) + num)<=maxCapacity) {
						wagons.set(k, wagons.get(k) + num);
						break;
					}
				}
			}
		}
		for(int i = 0;i<wagons.size();i++) {
			System.out.print(wagons.get(i) + " ");
		}
	}
}
