package Softuni.Fundamentals.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
	public static class Vehicles{
		String type;
		String model;
		String color;
		int horsepower;
		
		public Vehicles(String type,String model,String color,int horsepower){
			this.type = type;
			this.model = model;
			this.color = color;
			this.horsepower = horsepower;
		}
		
		public String getType() {
			return type;
		}
		
		public String getModel() {
			return model;
		}
		
		public String getColor() {
			return color;
		}
		
		public int getHorsepower() {
			return horsepower;
		}
		
		public String toString() {
			return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d", getType(),getModel(),getColor(),getHorsepower());
		}
		}
	
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			List<Vehicles> allVehicles = new ArrayList<>();
			int n = Integer.parseInt(sc.nextLine());
			for(int i = 0;i<n;i++) {
				String input = sc.nextLine();
				String [] arr = input.split(" ");
				allVehicles.add(new Vehicles(arr[0],arr[1],arr[2],Integer.parseInt(arr[3])));
			}
		}
}
