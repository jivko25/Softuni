package Softuni.JavaOOP.Polymorphism.Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle{
	private double fuel;
	private double littersPerKilometre;
	DecimalFormat df = new DecimalFormat("#.##");
	public Car(double fuel, double littersPerKilometre) {
		this.fuel = fuel;
		this.littersPerKilometre = littersPerKilometre + 0.9;
	}
	@Override
	public void refuel(double fuel) {
		// TODO Auto-generated method stub
		this.fuel += fuel;
	}

	@Override
	public void drive(double distance) {
		// TODO Auto-generated method stub
		double cost = distance*this.littersPerKilometre;
		if(this.fuel - cost >0) {
			this.fuel -= cost;
			System.out.printf("Car travelled %s km\n", df.format(distance));
		}
		else {
			System.out.println("Car needs refueling");
		}
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("Car: %.2f\n", this.fuel);
	}


}
