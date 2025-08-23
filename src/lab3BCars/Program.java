package lab3BCars;

import java.util.ArrayList;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//Adds all vehicles to the bmw factory
		ArrayList<Vehicle> bmwFactory = new ArrayList<Vehicle>();
		Vehicle m3 = new Vehicle(0, 1, 0);
		Vehicle m4 = new Vehicle(0, 2, 0);
		Vehicle m5 = new Vehicle(0, 3, 0);
		bmwFactory.add(m3);
		bmwFactory.add(m4);
		bmwFactory.add(m5);
		
		for(Vehicle eachBmw: bmwFactory) {
			System.out.println(eachBmw.getDetails());
		}
		System.out.println(Vehicle.getCount());
		
		//race the cars using random class to generate acceleration
		boolean race = true;
		while(race) {
			Random rand = new Random();
			for(Vehicle bespokeBmw: bmwFactory) {
				int randNum = rand.nextInt(5, 25);
				int breakRandomNum = rand.nextInt(10);
				bespokeBmw.accelerate(randNum);
				bespokeBmw.brake(breakRandomNum);
				System.out.println(bespokeBmw.getDetails());
				if(bespokeBmw.getDistanceTravelled() >= 1000) {
					System.out.println("Winner: " + bespokeBmw.getDetails());
					race = false;
					break;
				}
			}
		}
	}

}
