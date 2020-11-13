package Softuni.Fundamentals.AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		Map<String, Integer> craft = new HashMap<>();
		while(isStop == false) {
			String item = sc.nextLine();
			if("stop".equals(item)) {
				isStop = true;
				break;
			}
			int quality = Integer.parseInt(sc.nextLine());
			if(craft.get(item) == null) {
				craft.put(item, quality);
			}
			else {
				craft.put(item, craft.get(item) + quality);
			}
		}
		for(String n : craft.keySet()) {
			System.out.printf("%s -> %d\n",n,craft.get(n));
		}
	}
}
