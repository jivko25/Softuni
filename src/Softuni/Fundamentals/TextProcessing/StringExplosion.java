package Softuni.Fundamentals.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringExplosion {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		List <Integer> list = new ArrayList<>();
		for(int i = 0;i<sb.length();i++) {
			int explosionPower = 0;
			if(sb.charAt(i) == '>') {
				int val = sb.charAt(i+1);
				explosionPower = sb.charAt(i+1);
				for(int k = i+1;k<sb.length();k++) {
					if(sb.charAt(k) == '>') {
						val = sb.charAt(k+1);
						explosionPower += val;
					}
					else {
						list.add(k);
						sb.delete(k-1, k);
					}
				}
			}
		}
//		for(int i = 0;i<sb.length();i++) {
//			for(int k = 0;k<list.size();k++) {
//				if(sb.charAt(i) == list.get(k)) {
//					sb.deleteCharAt(list.get(k));
//				}
//			}
//		}
		System.out.println(sb);
	}
}
