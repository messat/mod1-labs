package lab3BCars;

public class Vehicle {
	private int speed;
	private int lane;
	private int distanceTravelled;
	
	//static counter to get total count across all instances of Vehicles
	private static int counter = 0;
	
	//Holds an instance of Object of Registration plate
	private RegistrationPlate registrationPlate;
	
	public Vehicle(int speed, int lane, int distanceTravelled) {
		this.speed = speed;
		this.lane = lane;
		this.registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();
		//Counter variable accessed in static way
		Vehicle.counter++;
	}
	
	void accelerate(int amount) {
		if(this.speed + amount > 200) {
			this.speed = 200;
			this.distanceTravelled += this.speed;
		} else {
			this.speed += amount;
			this.distanceTravelled += amount;
		}
	}
	
	void brake(int amount) {
		if(this.speed - amount < 0) {
			this.speed = 0;
		} else {
			this.speed -=amount;			
		}
	}
	
	public int getDistanceTravelled() {
		return distanceTravelled;
	}
	
	public String getDetails() {
		return String.format("Plate: %s,  Speed: %d, lane: %d, distanceTravelled: %d", registrationPlate.getNumber(),  speed, lane, distanceTravelled);
	}
	
	public static int getCount() {
		return counter;
	}
	
}
