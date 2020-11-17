package Softuni.Fundamentals.AssociativeArrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Orders {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> OrdersQuantity = new LinkedHashMap<>();
		Map<String, Double> OrdersPrice = new LinkedHashMap<>();
		boolean isReady = false;
		while(isReady == false) {
			String input = sc.nextLine();
			if("buy".equals(input)) {
				isReady = true;
				break;
			}
			String [] arr = input.split(" ");
			if(OrdersQuantity.get(arr[0]) == null) {
				OrdersQuantity.put(arr[0], Integer.parseInt(arr[2]));
				OrdersPrice.put(arr[0], Double.parseDouble(arr[1]));
			}
			else {
				OrdersQuantity.put(arr[0], OrdersQuantity.get(arr[0]) + Integer.parseInt(arr[2]));
				OrdersPrice.put(arr[0], Double.parseDouble(arr[1]));
			}
		}
		for(String n : OrdersQuantity.keySet()) {
			System.out.printf("%s -> %.2f\n",n,OrdersQuantity.get(n) * OrdersPrice.get(n));
		}
	}
}
