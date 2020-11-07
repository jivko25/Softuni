package Softuni.Fundamentals.MidExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Craft {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split("\\|");
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0;arr.length>i;i++) {
			list.add(arr[i]);
		}
		boolean isDone = false;
		while(isDone == false) {
			String action = sc.nextLine();
			if("Done".equals(action)) {
				isDone = true;
				break;
			}
			String [] acArr = action.split(" ");
			if(acArr.length == 3) {
				if("Right".equals(acArr[1])) {
					if(Integer.parseInt(acArr[2]) >= list.size()-1 || Integer.parseInt(acArr[2])<0) {
						
					}
					else {
					String temp = list.get(Integer.parseInt(acArr[2]));
					list.remove(Integer.parseInt(acArr[2]));
					list.add(Integer.parseInt(acArr[2])+1,temp);
					}
				}
				else if("Left".equals(acArr[1])){
					if(Integer.parseInt(acArr[2]) > list.size()-1 || Integer.parseInt(acArr[2])<0) {
						
					}
					else {
					String temp = list.get(Integer.parseInt(acArr[2]));
					list.remove(Integer.parseInt(acArr[2]));
					if((Integer.parseInt(acArr[2])) == 0) {
						list.add(0,temp);
					}
					else {
					list.add(Integer.parseInt(acArr[2])-1,temp);
					}
					}
				}
			}
			else if(acArr.length == 2) {
				if("Even".equals(acArr[1])) {
					for(int i = 0;i<list.size();i++) {
						if(i%2 == 0) {
							System.out.print(list.get(i));
							if(i + 2 > list.size()) {
								
							}
							else {
								System.out.print(" ");
							}
						}
					}
				}
				else if("Odd".equals(acArr[1])) {
					for(int i = 0;i<list.size();i++) {
						if(i%2 == 1) {
							System.out.print(list.get(i));
							if(i + 2 > list.size()) {
								
							}
							else {
								System.out.print(" ");
							}
						}
					}
				}
				System.out.println();
			}
		}
		System.out.print("You crafted ");
		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.print("!");
	}
}