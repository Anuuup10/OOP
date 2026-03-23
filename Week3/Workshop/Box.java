package Workshop;

public class Box {
	double width;
	double height;
	double depth;
	
	// Cube
	Box(double length){
		width = length;
		height = length;
		depth = length;
	}
	
	// Cuboid
	Box(double length, double breadth, double height){
		width = length;
		depth = breadth;
		this.height = height;
	}
	
	// No parameter
	Box(){
		width = 10;
		height = 12;
		depth = 8;
	}
	
	void getVolume() {
		double volume = width * height * depth;
		System.out.println("Volume: " + volume);
	}
	
	// Main method to test constructors
	public static void main(String[] args) {
		Box cube = new Box(5);
		Box cuboid = new Box(4, 5, 6);
		Box defaultBox = new Box();
		
		cube.getVolume();
		cuboid.getVolume();
		defaultBox.getVolume();
	}

}
