package Softuni.Fundamentals.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class PokemonDontGo {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> delNumbers = new LinkedList<Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		while(list.size() > 0) {
			int n = Integer.parseInt(sc.nextLine());
			if(n>=list.size()) {
				list.set(list.size()-1, list.get(0));
				int target = list.get(list.size()-1);
				for(int i = 0;i<list.size();i++) {
					if(list.get(i) <= target) {
						list.set(i, list.get(i) + target);
					}
					else {
						list.set(i, list.get(i) - target);
					}
				}
				delNumbers.addFirst(target);
				continue;
			}
			else if(n<0) {
				list.set(0, list.size()-1);
				continue;
			}
			else {
			int target = list.get(n);
			for(int i = 0;i<list.size();i++) {
				if(list.get(i) <= target) {
					list.set(i, list.get(i) + target);
				}
				else {
					list.set(i, list.get(i) - target);
				}
			}
			delNumbers.addFirst(target);
			list.remove(n);
			}
		}
		for(int i = 0;delNumbers.size()>0;i++) {
			sum += delNumbers.getFirst();
			delNumbers.removeFirst();
		}
		System.out.println();
		System.out.println(sum);
	}
}
