package Workshop;

public class Lamp {
	boolean isOn;
	
	// Method to turn on the lamp
	public void turnOn() {
		isOn = true;
		System.out.println("Lamp is ON: " + isOn);
	}
	
	// // Method to turn off the lamp
	public void turnOff() {
		isOn = false;
		System.out.println("Lamp is OFF: " + isOn);
	}
	
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		
		lamp.turnOn();
		lamp.turnOff();
	}

}
