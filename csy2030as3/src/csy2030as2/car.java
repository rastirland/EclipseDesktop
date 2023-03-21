package csy2030as2;

public class car extends vehicle {

	private int numberOfDoors;
	private String fuelType;
	
	public car(String make, String model, int topSpeed, String regNum, double dailyHireRate, int numberOfDoors, String fuelType, String hiredToo) {
		super(make, model, topSpeed, regNum, dailyHireRate, hiredToo);
		this.numberOfDoors = numberOfDoors;
		this.fuelType = fuelType;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	

}
