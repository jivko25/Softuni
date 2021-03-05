package Softuni.JavaAdvanced.ExamPreparation;

import java.util.*;

public class Cooking {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayDeque<Integer> liquids = new ArrayDeque<>();
		ArrayDeque<Integer> ingridients = new ArrayDeque<>();
		
		String [] liquidsInput = sc.nextLine().split("\\s+");
		String [] ingridientsInput = sc.nextLine().split("\\s+");
		
		boolean everythingCooked = true;
		
		for(int i = 0;i<liquidsInput.length;i++) {
			liquids.offer(Integer.parseInt(liquidsInput[i]));
		}
		for(int i = 0;i<ingridientsInput.length;i++) {
			ingridients.push(Integer.parseInt(ingridientsInput[i]));
		}
		Map<String, Integer> recepies = new LinkedHashMap<>();
		Map<String, Integer> cookedItems = new LinkedHashMap<>();
		recepies.put("Bread", 25);
		recepies.put("Cake", 50);
		recepies.put("Pastry", 75);
		recepies.put("Fruit Pie", 100);
		
		cookedItems.put("Bread", 0);
		cookedItems.put("Cake", 0);
		cookedItems.put("Fruit Pie", 0);
		cookedItems.put("Pastry", 0);
		while(liquids.size() != 0) {
			int liq = liquids.poll();
			int ing = ingridients.pop();
			boolean coocked = false;
			for(String e : recepies.keySet()) {
				if((liq + ing) == recepies.get(e)) {
					cookedItems.put(e, cookedItems.get(e) + 1);
					coocked = true;
				}
			};
			if(!coocked) {
				ingridients.push(ing+3);
			}
		}
		for(String e : cookedItems.keySet()) {
			if(cookedItems.get(e) == 0) {
				everythingCooked = false;
			}
		};
		if(everythingCooked) {
			System.out.println("Wohoo! You succeeded in cooking all the food!");
		}
		else {
			System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");
		}
		if(liquids.size() == 0) {
			System.out.println("Liquids left: none");
		}
		if(ingridients.size() == 0) {
			System.out.println("Ingredients left: none");
		}
		else {
			System.out.print("Ingredients left: ");
		while(ingridients.size() != 0) {
			System.out.print(ingridients.pop() + ", ");
			if(ingridients.size() == 1) {
				System.out.print(ingridients.pop());
			}
		}
		System.out.println();
		}
		for(String e : cookedItems.keySet()) {
			System.out.printf("%s: %d\n", e, cookedItems.get(e));
		};
	}
}
