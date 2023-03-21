package csy2030as2;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.DefaultTableModel;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import csy2030as2.vehicle;

public class NorthamptonVehicleHireController implements ActionListener
{
	NorthamptonVehicleHireModel model;
	NorthamptonVehicleHireView view;

		public NorthamptonVehicleHireController(NorthamptonVehicleHireModel model)
		{
			this.model = model;
			
			
			
		}
		
		
		public void addView(NorthamptonVehicleHireView view){
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "login") {
			  if(model.validLogin(view.getuserName() , view.getpassword()))
			  {
					view.hiddenlogin();
					view.initComponents();

					System.out.println("in log int");

					
		
			  } else if(model.validLoginCustomer(view.getuserName() , view.getpassword())>0)
			  
				 
			  {
				  
// this code populates the information and gui for the customer section on login
				  view.customerSection(model.validLoginCustomer(view.getuserName() , view.getpassword()));
				   
				   view.membertable(model.customer_list);
		           view.miniBusviewTable(model.vehicle_list);
		           view.lorryviewTable(model.vehicle_list);
		           view.carviewTable(model.vehicle_list);
// a test to show in the console that the customer login works
				  System.out.println("in customer login");  
	
			  }
			
				try {
					FileInputStream fis = new FileInputStream("C:\\Users\\rasti\\eclipse-workspace\\csy2030as2\\src\\csy2030as2\\vehicles.dat");
					ObjectInputStream ois = new ObjectInputStream(fis);

					vehicle obj = null;
		        	
					while ((obj=(vehicle)ois.readObject())!=null) {
						model.vehicle_list.add(obj);

						
					
				}
				            ois.close();
					
				        	model.create_list(model.vehicle_list);
						
					 } catch (EOFException ex) {  //This exception will be caught when EOF is reached
					            System.out.println("*vehicle* End of file reached.");
					        }  catch (FileNotFoundException ex) {
					            ex.printStackTrace();
					        } catch (IOException ex) {
					            ex.printStackTrace();
					        } catch (ClassNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
				
			try {
				FileInputStream fis = new FileInputStream("C:\\Users\\rasti\\eclipse-workspace\\csy2030as2\\src\\csy2030as2\\customers.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);

				customer obj = null;
	        	
				while ((obj=(customer)ois.readObject())!=null) {
					model.customer_list.add(obj);
				
			}
			            ois.close();
				
			        	model.create_customerlist(model.customer_list);
									          

				 } catch (EOFException ex) {  //This exception will be caught when EOF is reached
				            System.out.println("*customer* End of file reached.");
				        }  catch (FileNotFoundException ex) {
				            ex.printStackTrace();
				        } catch (IOException ex) {
				            ex.printStackTrace();
				        } catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} 
				}
			

			if (e.getActionCommand() == "quitProgram") {
		    
				System.exit(0);
		    }
			
			if (e.getActionCommand() == "addcustomerSytem") {
			    
//			    view.addcar();
			    System.out.println("****New customer Saved****");
			    model.addnewcustomer( view.getCustomerId(), view.getName(), view.getAddress(), view.getPhoneNumber(), view.getEmailAddress(), view.getcUserName(), view.getcpassword(), view.gethiredOut());
			    
			    }
			if (e.getActionCommand() == "addminibusSytem") {
			    
//			    view.addlorry();
			    System.out.println("****in add a new minibus****");
			
			    model.addnewminibus(view.getMake3(), view.getModel3(), Integer.parseInt(view.getTopSpeed3()), view.getReg3(), view.getHire3(), view.getSeatCapacity(), view.gethiredToo());
			
				}
			if (e.getActionCommand() == "addlorrySytem") {
		    
//		    view.addlorry();
		    System.out.println("****in add a new Lorry****");
		
		    model.addnewlorry(view.getMake2(), view.getModel2(), Integer.parseInt(view.getTopSpeed2()), view.getReg2(), view.getHire2(), view.getHoldCapacity(), view.gethiredToo());
		
			}
			if (e.getActionCommand() == "addcarSytem") {
		    

		    System.out.println("****in add a new car****");
		
		    model.addnewcar(view.getMake(), view.getModel(), Integer.parseInt(view.getTopSpeed()), view.getReg(), view.getHire(), view.getNumberOfDoors(), view.getFuelType(), view.gethiredToo());
		
		    }
			if (e.getActionCommand() == "VehicleSelect") {	
				view.te.removeAll();
				view.te.add(view.vehicleSelect);
				view.setTitle("vehicle select");
				view.te.repaint();
				view.te.revalidate();
			}
			if (e.getActionCommand() == "HireButton") {	
		           view.te.removeAll();
		           view.te.add(view.hireVehicle);
		           view.jComboBoxVehicleId.removeAllItems(); // this stops the fields being added multiple times when returning a vehicle    BUG FIX
		           view.jComboBoxCustomeriD.removeAllItems();
		           view.hireTable(model.customer_list);
		           
		           view.miniBusHireTable(model.vehicle_list);
		           view.lorryHireTable(model.vehicle_list);
		           view.carHireTable(model.vehicle_list);
		           view.te.repaint();
		           view.te.revalidate();         
			}
			if (e.getActionCommand() == "addCustomerButton") {	
			   view.te.removeAll();
			   view.te.add(view.newCustomer);
			   view.te.repaint();
			   view.te.revalidate();
			}
			if (e.getActionCommand() == "addcarButton") {	
				   view.te.removeAll();
				   view.te.add(view.addCar);
				   view.setTitle("Add a Car");
				   view.te.repaint();
				   view.te.revalidate();
			}
			
			if (e.getActionCommand() == "addLorryButton") {	
				   view.te.removeAll();
				   view.te.add(view.addLorry);// TODO add your handling code here:
				   view.setTitle("Add a Lorry");
				   view.te.repaint();
				   view.te.revalidate();
			}
			if (e.getActionCommand() == "addminiBusButton") {	
				   view.te.removeAll();
				   view.te.add(view.addMinibus);// TODO add your handling code here:
				   view.setTitle("Add a MiniBus");
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			if (e.getActionCommand() == "customerBack") {	
				   view.te.removeAll();
				   view.te.add(view.Firstpanel);// TODO add your handling code here:
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			if (e.getActionCommand() == "lorryBack") {	
				   view.te.removeAll();
				   view.te.add(view.vehicleSelect);// TODO add your handling code here:
				   view.setTitle("Select vehicle");
				   view.te.repaint();
				   view.te.revalidate();
				   
				
			}
			if (e.getActionCommand() == "carBack") {	
				   view.te.removeAll();
				   view.te.add(view.vehicleSelect);// TODO add your handling code here:
				   view.setTitle("Select vehicle");
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			if (e.getActionCommand() == "minibusBack") {	
				   view.te.removeAll();
				   view.te.add(view.vehicleSelect);// TODO add your handling code here:
				   view.setTitle("Select vehicle");
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			if (e.getActionCommand() == "removevehicletableButton") {	
				   view.te.removeAll();
				
				   view.te.add(view.vehicleTableGui);// TODO add your handling code here:
				   view.setTitle("vehicle Deletion");
//				      view.initTable(vehicle_list);
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			if (e.getActionCommand() == "removevehicletableBackButton") {	
				   view.te.removeAll();
				   view.te.add(view.vehicleTableGui);// TODO add your handling code here:
				   view.fmodel.setRowCount(0);
				   view.te.repaint();
				   view.te.revalidate();
				   
				  
				
			}
			
			if (e.getActionCommand() == "resetHireVehicleTable") {	

				   view.fmodel.setRowCount(0);
				   view.fmodel2.setRowCount(0);

				   
				  
				
			}
			if (e.getActionCommand() == "viewminibusData") {	
				   view.te.removeAll();
				
				   view.te.add(view.vehicleTableGui);// TODO add your handling code here:
				      view.miniBusTable(model.vehicle_list);
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			
			if (e.getActionCommand() == "viewLorryData") {	
				   view.te.removeAll();
				
				   view.te.add(view.vehicleTableGui);// TODO add your handling code here:
				      view.lorryTable(model.vehicle_list);
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			if (e.getActionCommand() == "viewcarData") {	
				   view.te.removeAll();
				
				   view.te.add(view.vehicleTableGui);// TODO add your handling code here:
				      view.carTable(model.vehicle_list);
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			
			if (e.getActionCommand() == "viewcustomerData") {	
				   view.te.removeAll();
				
				   view.te.add(view.customerTableGui);// TODO add your handling code here:
				      view.initTable2(model.customer_list);
				      System.out.println(view.gethiredOut());
				   view.te.repaint();
				   view.te.revalidate();
				
			}
			if (e.getActionCommand() == "removecustomertableBackButton") {	
				   view.te.removeAll();
				
				   view.te.add(view.customerTableGui);// TODO add your handling code here:
				   view.fmodel2.setRowCount(0);
				   view.te.repaint();
				   view.te.revalidate();
		

				    }     
			if (e.getActionCommand() == "removecustomertableDeleteButton") {	
				   view.te.removeAll();
				
				   view.te.add(view.customerTableGui);// TODO add your handling code here:
				   view.te.repaint();
				   view.te.revalidate();
		
				   DefaultTableModel modelCustomer =
						   (DefaultTableModel)view.jTable2.getModel();

				       int SelectedRowIndex = view.jTable2.getSelectedRow();
				       view.fmodel2.removeRow(SelectedRowIndex);
				       model.customer_list.remove(SelectedRowIndex);
				        
				  
				    }     
			
			if (e.getActionCommand() == "removevehicletableDeleteButton") {	
				   view.te.removeAll();
				
				   view.te.add(view.vehicleTableGui);// TODO add your handling code here:
				   view.te.repaint();
				   view.te.revalidate();
		
				   DefaultTableModel modelCar =
						   (DefaultTableModel)view.jTable1.getModel();
				       int SelectedRowIndex = view.jTable1.getSelectedRow();
				       view.fmodel.removeRow(SelectedRowIndex);
				       

//  			      vehicle_list.remove(i);
				       model.vehicle_list.remove(SelectedRowIndex);
				     


				    }   
			// this exits from the customer GUI
			if (e.getActionCommand() == "exitCustomer") {	
					System.exit(0);
				    } 
			
			
			if (e.getActionCommand() == "HireOutFunction") {	
				 

				for(vehicle v : model.vehicle_list)
				{
				  if(v.getRegNum() == view.jComboBoxVehicleId.getSelectedItem())
				  {
				    customer c = model.customer_list.get(view.jComboBoxCustomeriD.getSelectedIndex());
				    view.jComboBoxVehicleId.removeAllItems(); 		// this stops the fields being added multiple times when returning a vehicle    BUG FIX
			           view.jComboBoxCustomeriD.removeAllItems();
				    c.setHiredOut(v.getRegNum());
				    v.sethiredToo(c.getName());
				    view.fmodel.setRowCount(0);
				    view.fmodel2.setRowCount(0);
			           view.miniBusHireTable(model.vehicle_list);
			           view.lorryHireTable(model.vehicle_list);
			           view.carHireTable(model.vehicle_list);
			           view.hireTable(model.customer_list);
				   // add refresh for table 
				    break;
				  }
				}

				
				
				System.out.println("hire button works");
				

		
				  
				    }  
			// this deletes and refreshes the hire list, to unhire the vehicle to the customer
			if (e.getActionCommand() == "deleteHireVehicleTable") {	
				 

				for(vehicle v : model.vehicle_list)
				{
				  if(v.getRegNum() == view.jComboBoxVehicleId.getSelectedItem())
				  {
				    customer c = model.customer_list.get(view.jComboBoxCustomeriD.getSelectedIndex());
				    view.jComboBoxVehicleId.removeAllItems();
			           view.jComboBoxCustomeriD.removeAllItems(); // this stops the fields being added multiple times when returning a vehicle    BUG FIX
				    c.setHiredOut("0");
				    v.sethiredToo("0");
				    view.fmodel.setRowCount(0);
				    view.fmodel2.setRowCount(0);
		   // this part of the code is what refreshes the jtables
			           view.miniBusHireTable(model.vehicle_list);
			           view.lorryHireTable(model.vehicle_list);
			           view.carHireTable(model.vehicle_list);
			           view.hireTable(model.customer_list);
				    break;
				  }
				}

				
				
				System.out.println("hire button works");
				

		
				  
				    }
	
			

          

		
if (e.getActionCommand() == "logout") {
	System.out.println("in log out");
	ArrayList<vehicle> vehicle_list = model.get_list();
	ArrayList<customer> customer_list = model.get_customerlist();
	try {
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\rasti\\\\eclipse-workspace\\\\csy2030as2\\\\src\\\\csy2030as2\\\\vehicles.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		int i;
		for (i=0; i<vehicle_list.size(); i++)
			oos.writeObject(vehicle_list.get(i));
		System.out.println("i = " + i);
		
		oos.close();

							          

		 } catch (EOFException ex) {  //This exception will be caught when EOF is reached
		            System.out.println("End of file reached.");
		        }  catch (FileNotFoundException ex) {
		            ex.printStackTrace();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
	try {
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\rasti\\\\eclipse-workspace\\\\csy2030as2\\\\src\\\\csy2030as2\\\\customers.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		int i;
		for (i=0; i<customer_list.size(); i++)
			oos.writeObject(customer_list.get(i));
		System.out.println("i = " + i);
		oos.close();

							          

		 } catch (EOFException ex) {  //This exception will be caught when EOF is reached
		            System.out.println("End of file reached.");
		        }  catch (FileNotFoundException ex) {
		            ex.printStackTrace();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        } 


	
	   
//	System.exit(0);
		}
	


		}


		private Object memberTable() {
			// TODO Auto-generated method stub
			return null;
		}
}

