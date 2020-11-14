package Softuni.Fundamentals.AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> materials = new HashMap<>();
		boolean isReady = false;
		while(isReady == false) {
			String input = sc.nextLine();
			String [] arr = input.split(" ");
			for(int i = 0;i<arr.length;i=i+2) {
				if(materials.get(arr[i].toLowerCase()) == null) {
					materials.put(arr[i].toLowerCase(), Integer.parseInt(arr[i+1]));
				}
				else {
					materials.put(arr[i].toLowerCase(), materials.get(arr[i].toLowerCase()) + Integer.parseInt(arr[i+1]));
				}
			}
			if(materials.get("shards") != null) {
				if(materials.get("shards") >= 250) {
				System.out.println("Shadowmourne obtained!");
				materials.put("shards", materials.get("shards") - 250);
				if(materials.get("shards") == 0) {
					materials.remove("shards");
				}
				isReady = true;
				break;
				}
			}
			else if(materials.get("fragments") != null) {
				if(materials.get("fragments") >= 250) {
				System.out.println("Valanyr obtained!");
				materials.put("fragments", materials.get("fragments") - 250);
				if(materials.get("fragments") == 0) {
					materials.remove("fragments");
				}
				isReady = true;
				break;
				}
			}
			else if(materials.get("motes") != null) {
				if(materials.get("motes") >= 250) {
				System.out.println("Dragonwrath obtained!");
				materials.put("motes", materials.get("motes") - 250);
				if(materials.get("motes") == 0) {
					materials.remove("motes");
				}
				isReady = true;
				break;
				}
			}
		}
		for(String n : materials.keySet()) {
			System.out.printf("%s: %d\n",n,materials.get(n));
		}
	}
}
