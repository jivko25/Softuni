package Softuni.Fundamentals.Lists;
import java.util.ArrayList;
import java.util.Scanner;

public class HouseParty {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int commands = Integer.parseInt(sc.nextLine());
		ArrayList<String> personsInTheParty = new ArrayList<String>();
		for(int i = 0;i<commands;i++) {
			String input = sc.nextLine();
			String [] arr = input.split(" ");
			//add
			if(arr.length == 3) {
				boolean added = false;
				for(int k = 0;k<personsInTheParty.size();k++) {
					if(personsInTheParty.get(k).equals(arr[0])) {
						System.out.println(personsInTheParty.get(k) + " is already in the list!");
						added = true;
						break;
					}
				}
				if(added == false) {
				personsInTheParty.add(arr[0]);
				}
			}
			//remove
			else {
				boolean added = true;
				for(int k = 0;k<personsInTheParty.size();k++) {
					if(personsInTheParty.get(k).equals(arr[0])) {
						personsInTheParty.remove(k);
						added = false;
						break;
					}
				}
				if(added == true) {
					System.out.println(arr[0] + " is not in the list!");
				}
			}
		}
		for(int i = 0;i<personsInTheParty.size();i++) {
			System.out.println(personsInTheParty.get(i));
		}
	}
}
