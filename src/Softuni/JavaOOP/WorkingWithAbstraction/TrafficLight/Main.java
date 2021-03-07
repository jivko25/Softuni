package Softuni.JavaOOP.WorkingWithAbstraction.TrafficLight;

import java.util.*;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List<TrafficLight> trafficLists = new ArrayList();
		String [] initialTrafficLigts = sc.nextLine().split("\\s+");
		int numberOfUpdates = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < initialTrafficLigts.length; i++) {
			TrafficLight tr = new TrafficLight(TrafficLightsEnum.valueOf(initialTrafficLigts[i]));
			trafficLists.add(tr);
		}
		for(int i = 0;i < numberOfUpdates;i++) {
			for(TrafficLight tr : trafficLists) {
				tr.update();
				System.out.print(tr.toString() + " ");
			}
			System.out.println();
		}
	}
}
