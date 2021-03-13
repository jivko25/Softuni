package Softuni.JavaOOP.Polymorphism.Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle{

	private double fuel;
	private double littersPerKilometre;
	DecimalFormat df = new DecimalFormat("#.##");
	public Truck(double fuel, double littersPerKilometre) {
		this.fuel = fuel;
		this.littersPerKilometre = littersPerKilometre + 1.6;
	}
	@Override
	public void refuel(double fuel) {
		// TODO Auto-generated method stub
		this.fuel += fuel*0.95;
	}

	@Override
	public void drive(double distance) {
		// TODO Auto-generated method stub
		double cost = distance*this.littersPerKilometre;
		if(this.fuel - cost >0) {
			this.fuel -= cost;
			System.out.printf("Truck travelled %s km\n", df.format(distance));
		}
		else {
			System.out.println("Truck needs refueling");
		}
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("Truck: %.2f\n", this.fuel);
	}

}
