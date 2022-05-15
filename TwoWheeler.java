package week1.day1.assignments;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 987654321;
	boolean isPunctured = false;
	String bikeName = "Apache";
	double runningKM = 250.00;
	
	public static void main(String[] args) {
		
		TwoWheeler Bike = new TwoWheeler();
		
		System.out.println("No. of Wheels: " +Bike.noOfWheels);
		System.out.println("No. of Mirrors: " +Bike.noOfMirrors);
		System.out.println("Display Number: " +Bike.chassisNumber);
		System.out.println("Bike Punctured: " +Bike.isPunctured);
		System.out.println("Name of the Bike: " +Bike.bikeName);
		System.out.println("Running KM: " +Bike.runningKM);
		
	}

}