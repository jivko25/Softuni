package Softuni.Fundamentals.Lists;
import java.util.LinkedList;
import java.util.Scanner;

public class AppendArrys {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split("\\|");
		LinkedList<String> list = new LinkedList<String>();
		for(int i = 0;i<arr.length;i++) {
			list.addFirst(arr[i]);
		}
		for (int i = 0; 0 <= list.size(); i++) {
			String [] newArr = (list.getFirst()).split("");
			for(int k = 0;k<newArr.length;k++) {
				if(" ".equals(newArr[k])) {
					continue;
				}
				else if(newArr[k] != " "){
					System.out.print(newArr[k] + " ");
				}
			}
			list.removeFirst();
		}
	}
}
