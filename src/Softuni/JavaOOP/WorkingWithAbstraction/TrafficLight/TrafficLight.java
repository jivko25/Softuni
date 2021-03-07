package Softuni.JavaOOP.WorkingWithAbstraction.TrafficLight;

public class TrafficLight {
	private TrafficLightsEnum color;
	
	public TrafficLight(TrafficLightsEnum color) {
		this.color = color;
	}
	
	public void update() {
		switch (this.color) {
		case GREEN:
			this.color = TrafficLightsEnum.YELLOW;
			break;
		case RED:
			this.color = TrafficLightsEnum.GREEN;
			break;
		case YELLOW:
			this.color = TrafficLightsEnum.RED;
			break;
		default:
			break;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color.toString();
	}
}
