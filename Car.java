package week1.day1.assignments;

public class Car {

	public void applyBreak()
	{
		System.out.println("Please apply Break");
	}
	
	public void applyGear()
	{
		System.out.println("Please apply Gear");
	}

	public void switchonAC()
	{
		System.out.println("Please switch on the AC");
	}
	
	public void applyAccelerate()
	{
		System.out.println("Please apply Accelerate");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Tata Sumo");
		
		Car Sumo = new Car();
		Sumo.applyBreak();
		Sumo.applyGear();
		Sumo.switchonAC();
		Sumo.applyAccelerate();
		
	}

}