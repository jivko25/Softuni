package Softuni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean isEnd = false;
		boolean isFail = false;
		String input = sc.nextLine();
		String [] bigarr = input.split(", ");
		while(isEnd == false) {
			isFail = false;
			for(int k = 0;k<bigarr.length;k++) {
			char [] arr = bigarr[k].toCharArray();
			for(int i = 0;i<arr.length;i++) {
				int val = arr[i];
				if(((val>=48 && val<=57) || (val>=65 && val<=90) || (val>=97 && val<=122) || '_' == arr[i] ) && (arr.length>=3 && arr.length<=16)) {
				}
				else {
					isFail = true;
				}
				if(isFail == true) {
					break;
				}
			}
			if(isFail == true) {
				continue;
			}
			else if(isFail == false){
			System.out.println(input);
			}
			}
		}
	}
}
