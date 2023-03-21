package csy2030as2;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import csy2030as2.car;
import csy2030as2.vehicle;

public class NorthamptonVehicleHireModel {
	private car cars;
	private customer newcust;
	ArrayList<vehicle> vehicle_list = new ArrayList<vehicle>();
	ArrayList<customer> customer_list = new ArrayList<customer>();
	private String userName = "staff";
	private String password = "password";
	public car street;
	String sessionId = "";

	public NorthamptonVehicleHireModel()
	{
		
		
	}

	
	public  ArrayList<vehicle> get_list()
	{
		return vehicle_list;
	}

	public void create_list(ArrayList<vehicle> vehicle_list_input)  
	{
		for (int i=0; i<vehicle_list_input.size(); i++)
			vehicle_list.add(vehicle_list_input.get(i));
		
	}
	////////////////////////////////////////////////////////////////
	public  ArrayList<customer> get_customerlist()
	{
		return customer_list;
	}

	public void create_customerlist(ArrayList<customer> customer_list_input)
	{
		for (int i=0; i<customer_list_input.size(); i++)
			customer_list.add(customer_list_input.get(i));
		
	}
	
public boolean validLogin(String user, String pass)
{
	if (user.equals(userName) && pass.equals(password)) 
	{
	System.out.println("works");
	return true;		
}
	else {
		System.out.println("doesnt work");
	return false;
	}
}
public int validLoginCustomer(String user, String pass) 
{
for(customer c : customer_list)
{ System.out.println("****loop working****");
    if(user.equals(c.getUserName()) && pass.equals(c.getcPassword()))
    {
    	sessionId = String.valueOf(c.getCustomerId());
  //
      //loginCustomer();
    	 System.out.println("****in customer file****");
      return c.getCustomerId();
    }
}
return -1;
}

public void addnewminibus(String make, String model, int topSpeed, String regNum, double dailyHireRate, int seatCapacity, String hiredToo) {
	
	System.out.println("*** in addnewminibus ****");

	minibus new_minibus = new minibus(make, model, topSpeed, regNum,  dailyHireRate,  seatCapacity, hiredToo);
	vehicle_list.add(new_minibus);
}

public void addnewlorry(String make, String model, int topSpeed, String regNum, double dailyHireRate, int holdCapacity, String hiredToo) {
	
	System.out.println("*** in addnewlorry ****");

	lorry new_Lorry = new lorry(make, model, topSpeed, regNum,  dailyHireRate,  holdCapacity, hiredToo);
	vehicle_list.add(new_Lorry);
}


public void addnewcar(String make, String model, int topSpeed, String regNum, double dailyHireRate, int numberOfDoors, String fuelType, String hiredToo) {


	
	System.out.println("*** in addnewcar ****");
	vehicle new_car = new car(make, model, topSpeed, regNum,  dailyHireRate,  numberOfDoors, fuelType, hiredToo);
	vehicle_list.add(new_car);
	
}


public void addnewcustomer(int customerId, String name, String address, int phoneNumber, String emailAddress,String cUserName, String cpassword, String vehicleHiredOut) {
	
	customer newcust = new customer (customerId, name, address, phoneNumber, emailAddress, cUserName, cpassword, vehicleHiredOut);
	customer new_customer = new customer (customerId, name, address, phoneNumber, emailAddress, cUserName, cpassword,  vehicleHiredOut);
	System.out.println(newcust.getName() + " " + newcust.getUserName());
	customer_list.add(new_customer);
}
public void deletevehicle(int selRowIndex) {

}
 
}