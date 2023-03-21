package csy2030as2;

public class lorry extends vehicle {
	private int holdCapacity;
	public lorry(String make, String model, int topSpeed, String regNum, double dailyHireRate, int holdCapacity, String hiredToo) {
		super(make, model, topSpeed, regNum, dailyHireRate, hiredToo);
	
		this.holdCapacity = holdCapacity;
	}

	public int getHoldCapacity() {
		return holdCapacity;
	}

	public void setHoldCapacity(int holdCapacity) {
		this.holdCapacity = holdCapacity;
	}
}
