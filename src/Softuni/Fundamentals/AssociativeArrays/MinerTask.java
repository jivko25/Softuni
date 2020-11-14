package Softuni.Fundamentals.AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		Map<String, Integer> craft = new LinkedHashMap<>();
//		HashMap<String, Integer> craft = new HashMap<String, Integer>();
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
		for(Map.Entry<String, Integer> entry : craft.entrySet()) {
			System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
		}
	}
}
