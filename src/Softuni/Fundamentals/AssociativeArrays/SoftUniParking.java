package Softuni.Fundamentals.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> ParkingPlaces = new LinkedHashMap<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<n;i++) {
			String input = sc.nextLine();
			String [] arr = input.split(" ");
			if("register".equals(arr[0])) {
				if(ParkingPlaces.get(arr[1]) == null) {
					ParkingPlaces.put(arr[1], arr[2]);
					System.out.printf("%s registered %s successfully\n",arr[1],arr[2]);
				}
				else {
					System.out.printf("ERROR: already registered with plate number %s\n",arr[2]);
				}
			}
			else if("unregister".equals(arr[0])) {
				if(ParkingPlaces.get(arr[1]) == null) {
					ParkingPlaces.remove(arr[1]);
				}
				else {
					System.out.printf("ERROR: user %s not found\n",arr[1]);
				}
			}
		}
		for(String k : ParkingPlaces.keySet()) {
			System.out.printf("%s -> %s\n",k, ParkingPlaces.get(k));
		}
	}
}
