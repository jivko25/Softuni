package Softuni.Exam;

import java.util.Scanner;

public class Barcod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		String number;
		String startnumber = String.valueOf(start);
		String endnumber = String.valueOf(end);
		char start1 = startnumber.charAt(0);
		char start2 = startnumber.charAt(1);
		char start3 = startnumber.charAt(2);
		char start4 = startnumber.charAt(3);
		char end1 = endnumber.charAt(0);
		char end2 = endnumber.charAt(1);
		char end3 = endnumber.charAt(2);
		char end4 = endnumber.charAt(3);
		char char1;
		char char2;
		char char3;
		char char4;
		int number1;
		int number2;
		int number3;
		int number4;
		while(start<=end) {
			number = String.valueOf(start);
			char1 = number.charAt(0);
			char2 = number.charAt(1);
			char3 = number.charAt(2);
			char4 = number.charAt(3);
			number1 = Integer.valueOf(char1);
			number2 = Integer.valueOf(char2);
			number3 = Integer.valueOf(char3);
			number4 = Integer.valueOf(char4);
			if((number1%2 == 1 && (char1 == start1 || char1 == start2|| char1 == start3|| char1 == start4 || char1 == end1 || char1 == end2 || char1 == end3 || char1 == end4)) && (number2%2 == 1 && (char2 == start1 || char2 == start2|| char2 == start3|| char2 == start4 || char2 == end1 || char2 == end2 || char2 == end3 || char2 == end4)) && (number3%2 == 1 && (char3 == start1 || char3 == start2|| char3 == start3|| char3 == start4 || char3 == end1 || char3 == end2 || char3 == end3 || char3 == end4)) && (number4%2 == 1 && (char4 == start1 || char4 == start2|| char4 == start3|| char4 == start4 || char4 == end1 || char4 == end2 || char4 == end3 || char4 == end4))) {
				System.out.print(start + " ");
			}
			start++;
		}
	}

}
