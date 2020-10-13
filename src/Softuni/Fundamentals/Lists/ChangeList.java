package Softuni.Fundamentals.Lists;
import java.util.ArrayList;
import java.util.Scanner;

public class ChangeList {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
 		for (int i = 0; i < arr.length; i++) {
			list.add(i, Integer.parseInt(arr[i]));
		}
		boolean exit = true;
		while(exit == true) {
			String action = sc.nextLine();
			String [] actionArray = action.split(" ");
			if("end".equals(action)) {
				exit = false;
				break;
			}
			else if("Delete".equals(actionArray[0])){
				for(int i = 0;i<list.size();i++) {
					if(list.get(i) == Integer.parseInt(actionArray[1])) {
						list.remove(i);
					}
				}
			}
			else if("Insert".equals(actionArray[0])) {
				list.add(Integer.parseInt(actionArray[2]), Integer.parseInt(actionArray[1]));
			}
			
		}
		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
