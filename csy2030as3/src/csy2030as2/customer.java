package csy2030as2;

import java.io.Serializable;

public class customer implements Serializable {
	private int customerId;
	private String name;
	private String address;
	private int phoneNumber;
	private String emailAddress;
	private String cuserName;
	private String cpassword;
	private String vehicleHiredOut;
	
	public customer(int customerId, String name, String address, int phoneNumber, String emailAddres, String cuserName, String cpassword, String vehicleHiredOut) {
		// constructor
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddres;
		this.cuserName = cuserName;
		this.cpassword = cpassword;
		this.vehicleHiredOut = vehicleHiredOut;
		
		
	
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getUserName() {
		return cuserName;
	}
	public void setcUserName(String cuserName) {
		this.cuserName = cuserName;
	}
	public String getcPassword() {
		return cpassword;
	}
	public void setcPassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getHiredOut() {
		return vehicleHiredOut;
	}
	public void setHiredOut(String vehicleHiredOut) {
		this.vehicleHiredOut = vehicleHiredOut;
	}

}

