package csy2030as2;

public class minibus extends vehicle {

	private int seatCapacity;

	public minibus(String make, String model, int topSpeed, String regNum, double dailyHireRate, int seatCapacity, String hiredToo) {
		super(make, model, topSpeed, regNum, dailyHireRate, hiredToo);
		this.setSeatCapacity(seatCapacity);
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

}
