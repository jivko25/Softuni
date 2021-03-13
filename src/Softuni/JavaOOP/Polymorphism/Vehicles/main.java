package Softuni.JavaOOP.Polymorphism.Vehicles;

import java.util.Scanner;

public class main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] carInput = sc.nextLine().split("\\s+");
		String [] truckInput = sc.nextLine().split("\\s+");
		Vehicle car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]));
		Vehicle truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]));
		int commands = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<commands;i++) {
			String [] command = sc.nextLine().split("\\s+");
			switch (command[0]) {
			case "Drive":
				switch (command[1]) {
				case "Car":
					car.drive(Double.parseDouble(command[2]));
					break;
				case "Truck":
					truck.drive(Double.parseDouble(command[2]));
					break;

				default:
					break;
				}
				break;
			case "Refuel":
				switch (command[1]) {
				case "Car":
					car.refuel(Double.parseDouble(command[2]));
					break;
				case "Truck":
					truck.refuel(Double.parseDouble(command[2]));
					break;

				default:
					break;
				}
				break;	
			default:
				break;
			}
		}
		car.print();
		truck.print();
	}
}
