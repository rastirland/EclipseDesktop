package csy2030as2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class NorthamptonVehicleHireView extends javax.swing.JFrame {
//variables
NorthamptonVehicleHireModel model;
NorthamptonVehicleHireController controller;
JPanel panel;
JLabel user_label, password_label, message, user_label1 ;
JTextField userName_text;
JTextField password_text;
JButton submit, cancel;
JFrame l = new JFrame();
JFrame m = new JFrame();
JFrame avc = new JFrame();
JFrame vmb = new JFrame();
JFrame av = new JFrame();
JFrame ac = new JFrame();
JFrame avl = new JFrame();
JFrame editvehiclegui = new JFrame();


//private JPanel av;

private JTextField vtoptex = new JTextField();
private JTextField vhiretex = new JTextField();
private JTextField cdoorstex = new JTextField();
private JTextField vregtex = new JTextField();
private JTextField vnametex = new JTextField();
private JTextField vmodeltex = new JTextField();
private JButton vcarsavebutton;
private JButton vlorrysavebutton;
private JButton vresetbutton;

// car
private String[] fueldtypes = {"Petrol", "Deisel"};
private JComboBox vfuelselect = new JComboBox(fueldtypes);

private JButton buttoncheck;
//minibus
private String[] vmbseatcap = {"8","16"};
private JComboBox vmbseatcap1 = new JComboBox(vmbseatcap);
private JTextField vmbametex;
private JTextField vmbmodeltex;
private JTextField vmbregtex;
private JTextField vmbtoptex;
private JTextField vmbhiretex;
private JButton vmbsavebutton;
private JButton vmbresetbutton;
private JLabel vmbcapacity;

//lorry
private String[] vlweight = {"7","12","40"};
private JComboBox vlweight1 = new JComboBox(vlweight);
private JTextField vlnametex;
private JTextField vlmodeltex;
private JTextField vlregtex;
private JTextField vltoptex;
private JTextField vlhiretex;
private JButton vlsavebutton;
private JButton vlresetbutton;
private JLabel cdoors;
private JLabel lmaxweight;
//private JComboBox vlweight;

// global ac
private JTextField clnametex;
private JTextField claddresstex;
private JTextField clphonenumtex;
private JTextField clemailaddresstex;
private JTextField clusernametex;
private JTextField clpasswordtex;
private JTextField clidtex;
private JPanel clontentPane;
private JTextField textField;





JLabel cFuelType;


JList list;

// global ac
private JTextField cnametex;
private JTextField caddresstex;
private JTextField cphonenumtex;
private JTextField cemailaddresstex;
private JTextField cusernametex;
private JTextField cpasswordtex;
private JTextField cidtex;

//main window buttons and labels
JButton staffwel = new JButton("Log Out");
JButton buttonaddvehicle = new JButton("Add vehicle");
JButton buttondelvehicle = new JButton("Delete vehicle");
JButton buttonviewloaned = new JButton("view Loaned vehicles");
JButton buttonhire = new JButton("hire vehicles");
JButton buttonsreturn = new JButton("return vehicles");
JButton buttonaddcustomer = new JButton("Add a new customer");
JButton buttondelcustomer = new JButton("Delete customer");
public NorthamptonVehicleHireView(NorthamptonVehicleHireModel model, NorthamptonVehicleHireController controller)
{
// constructor
this.model = model;
this.controller = controller;
login();
//mainwindow();
controller.addView(this);
}

private javax.swing.JLabel usernameLabel;
public void login() {
     // Username Label
    user_label1 = new JLabel();
    user_label1.setText("   hello my name is    ");
     
     user_label = new JLabel();
     user_label.setText("User Name :");
     userName_text = new JTextField();
     // Password Label
     password_label = new JLabel();
     password_label.setText("Password :");
     password_text = new JPasswordField();
     //password_text = new JTextField(); // this field is if you would like to see the password,  but password hidden for security purposes otherwise
     // Submit
     submit = new JButton("SUBMIT");
     panel = new JPanel(new GridLayout(6, 3));
     panel.add(user_label);
     panel.add(userName_text);
     panel.add(password_label);
     panel.add(password_text);
     message = new JLabel();
     panel.add(message);
     panel.add(submit);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Adding the listeners to components..
     submit.setActionCommand("login"); 
     submit.addActionListener(controller);
     add(panel, BorderLayout.CENTER);
     setTitle("Northampton Vehcile Hire - Login");
     l.setSize(250,350);
     l.setVisible(true);
     l.add(panel);
     l.setResizable(false);
  }
private JButton btnNewButton;
private JLabel lblNewLabel;

private JTable j = new JTable();


	private JTable table;
	private JTable table2;



	private Object[][] data;
	private String[] columnNames;
	private String[] columnNames2;
	private String[] columnNames3;
	private String[] columnNames4;
	
	private JButton button;
	private JButton button2;
	DefaultTableModel fmodel;
	DefaultTableModel fmodel2;
	 
	 

	
	 public void hireTable(ArrayList<customer> customer_list) {
	 
	     for(customer Ccustomer : customer_list){
    	 
	          fmodel2.addRow(new Object[]{Ccustomer.getCustomerId(), Ccustomer.getName(), Ccustomer.getAddress(), Ccustomer.getPhoneNumber(), Ccustomer.getEmailAddress(), Ccustomer.getUserName(), Ccustomer.getcPassword(), Ccustomer.getHiredOut()});
	           System.out.println(Ccustomer.getName() + "test");// this is generating the array for viewing the customer information in a jcombobox for the hire section
	          
	           jComboBoxCustomeriD.addItem(Ccustomer.getName());
	     }
	     jTable3.setModel(fmodel2);     
	}

	
	 public void miniBusTable(ArrayList<vehicle> vehicle_list) {

		 
	     for(vehicle vbus : vehicle_list){
	    	 if (vbus instanceof minibus ){// this is generating the array for viewing the vehicles information car, minibus and lorry
	          fmodel.addRow(new Object[]{vbus.getMake(), vbus.getModel(), vbus.getTopSpeed(), vbus.getRegNum(), vbus.getDailyHireRate(), "N/A" ,"N/A", "N/A",((minibus)vbus).getSeatCapacity(), ((minibus)vbus).gethiredToo() });
	        
	     }
	     
	     jTable1.setModel(fmodel);
	}
}
		
	 public void lorryTable(ArrayList<vehicle> vehicle_list ) {

		 
	     for(vehicle vlorry : vehicle_list){
	    	 if (vlorry instanceof lorry ){// this is generating the array for viewing the vehicles information car, minibus and lorry
	          fmodel.addRow(new Object[]{vlorry.getMake(), vlorry.getModel(), vlorry.getTopSpeed(), vlorry.getRegNum(), vlorry.getDailyHireRate(),"N/A","N/A",((lorry)vlorry).getHoldCapacity(), "N/A", ((lorry)vlorry).gethiredToo()});
	        

	     }
	     
	     jTable1.setModel(fmodel);
	}
	 }
		
	 public void carTable(ArrayList<vehicle> vehicle_list) {

	 
	     for(vehicle vcar : vehicle_list){
	    	 if (vcar instanceof car ){// this is generating the array for viewing the vehicles information car, minibus and lorry
	          fmodel.addRow(new Object[]{vcar.getMake(), vcar.getModel(), vcar.getTopSpeed(), vcar.getRegNum(), vcar.getDailyHireRate(), ((car)vcar).getNumberOfDoors(),((car)vcar).getFuelType(), "N/A", "N/A", ((car)vcar).gethiredToo()});
	         

	     }
	     
	     jTable1.setModel(fmodel);
	}
}

//////////////////////// Vehicle Hire tables

public void miniBusHireTable(ArrayList<vehicle> vehicle_list) {

    for(vehicle vbus : vehicle_list){
   	 if (vbus instanceof minibus ){
         fmodel.addRow(new Object[]{vbus.getMake(), vbus.getModel(), vbus.getTopSpeed(), vbus.getRegNum(), vbus.getDailyHireRate(), "N/A" ,"N/A", "N/A",((minibus)vbus).getSeatCapacity(),((minibus)vbus).gethiredToo()});
         jComboBoxVehicleId.addItem(vbus.getRegNum());// this is generating the array for the vehicle list , mini buses, lorry and car this is used with a combo box and a jtable

   	 }
    
    jTable4.setModel(fmodel);
}
}
public void lorryHireTable(ArrayList<vehicle> vehicle_list ) {


	 
    for(vehicle vlorry : vehicle_list){
   	 if (vlorry instanceof lorry ){//this is generating the array for the vehicle list , mini buses, lorry and car this is used with a combo box and a jtable
         fmodel.addRow(new Object[]{vlorry.getMake(), vlorry.getModel(), vlorry.getTopSpeed(), vlorry.getRegNum(), vlorry.getDailyHireRate(),"N/A","N/A",((lorry)vlorry).getHoldCapacity(), "N/A",((lorry)vlorry).gethiredToo()});
       
         jComboBoxVehicleId.addItem(vlorry.getRegNum());

    }
    
    jTable4.setModel(fmodel);
}
}
//this is generating the array for the vehicle list , mini buses, lorry and car this is used with a combo box and a jtable
public void carHireTable(ArrayList<vehicle> vehicle_list) {


    for(vehicle vcar : vehicle_list){
   	 if (vcar instanceof car ){
         fmodel.addRow(new Object[]{vcar.getMake(), vcar.getModel(), vcar.getTopSpeed(), vcar.getRegNum(), vcar.getDailyHireRate(), ((car)vcar).getNumberOfDoors(),((car)vcar).getFuelType(), "N/A", "N/A",((car)vcar).gethiredToo()});
         jComboBoxVehicleId.addItem(vcar.getRegNum());
       
    }
    
    jTable4.setModel(fmodel);
}
}

////////////////////// customer view, this code is the array list being used for the customer combobox 
public void miniBusviewTable(ArrayList<vehicle> vehicle_list) {

	 
    for(vehicle vbus : vehicle_list){
   	 if (vbus instanceof minibus ){
   		 // the if statment filters out the vehicles that have been filtered for the customer
   		if (vbus.gethiredToo().equals("0")) {
         jComboBoxCustomerView.addItem(vbus.getRegNum());
   	 }
   	 }

}
}
//////////////////////customer view, this code is the array list being used for the customer combobox 
public void lorryviewTable(ArrayList<vehicle> vehicle_list ) {
 
    for(vehicle vlorry : vehicle_list){
   	 if (vlorry instanceof lorry ){
   		 // the if statment filters out the vehicles that have been filtered for the customer
   		if (vlorry.gethiredToo().equals("0")) {
           jComboBoxCustomerView.addItem(vlorry.getRegNum());
   		}
    }
}
}
//////////////////////customer view, this code is the array list being used for the customer combobox 
public void carviewTable(ArrayList<vehicle> vehicle_list) {
	
    for(vehicle vcar : vehicle_list){
   	 if (vcar instanceof car ){
   	// the if statment filters out the vehicles that have been filtered for the customer
   		 if (vcar.gethiredToo().equals("0")) {
         jComboBoxCustomerView.addItem(vcar.getRegNum());
   		 }
    }
}
}






// this is being used to generate the array for the customer information, within the staff section
public void initTable2(ArrayList<customer> customer_list) {

 
     for(customer Ccustomer : customer_list){
    	 
          fmodel2.addRow(new Object[]{Ccustomer.getCustomerId(), Ccustomer.getName(), Ccustomer.getAddress(), Ccustomer.getPhoneNumber(), Ccustomer.getEmailAddress(), Ccustomer.getUserName(), Ccustomer.getcPassword(),Ccustomer.getHiredOut()});
           System.out.println(Ccustomer.getName() + "customer list test");
     }
     jTable2.setModel(fmodel2);
}
//this is being used to generate the array for the customer information, within the customer section section
public void membertable(ArrayList<customer> customer_list) {
    for(customer Ccustomer : customer_list){
    	 if (String.valueOf(Ccustomer.getCustomerId()).equalsIgnoreCase(model.sessionId)) {
        fmodel2.addRow(new Object[]{Ccustomer.getCustomerId(), Ccustomer.getName(), Ccustomer.getAddress(), Ccustomer.getPhoneNumber(), Ccustomer.getEmailAddress(), Ccustomer.getUserName(), Ccustomer.getcPassword(),Ccustomer.getHiredOut()});
         System.out.println("test");
   }
    jTable5.setModel(fmodel2);
    }
}


// this is the customer section GUI
public void customerSection(int getCustomerId) {
// customer constructor	
    customerExit = new javax.swing.JButton();
    jScrollPane5 = new javax.swing.JScrollPane();
    jTable5 = new javax.swing.JTable();
    jComboBoxCustomerView = new javax.swing.JComboBox<>();
    
 // GUI setup   
    JFrame customerFrame = new JFrame();
    customerFrame.setVisible(true);
    customerFrame.setSize(1200, 300);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    customerFrame.getContentPane().setLayout(new java.awt.GridLayout());
 // GUI attributes
    customerExit.setFont(new java.awt.Font("Tahoma", 1, 24));   
    customerExit.setText("Exit");
    customerExit.setActionCommand("exitCustomer"); 
    customerExit.addActionListener(controller);
    customerFrame.getContentPane().add(customerExit);
// this is the customer jTable setup   
    columnNames2 = new String[] {"Id", "Name", "Address", "PhoneNum", "Email","Username" , "Password", "Loaned Vehicles"};
    fmodel2 = new DefaultTableModel(data, columnNames2);
    jScrollPane5.setViewportView(jTable5);
    
    customerFrame.getContentPane().add(jScrollPane5);

   jComboBoxCustomerView.setModel(new javax.swing.DefaultComboBoxModel<>());

   customerFrame.getContentPane().add(jComboBoxCustomerView);

    pack();
  // this removes the login GUI
  l.setVisible(false);
}


         
//public void mainwindow() {
	   public void initComponents() {
// main staff constructor		  
	 menuBar1 = new java.awt.MenuBar();
     menu1 = new java.awt.Menu();
     menu2 = new java.awt.Menu();
     jPanel1 = new javax.swing.JPanel();
     vehicleselectButton = new javax.swing.JButton();
     quitButton = new javax.swing.JButton();
     logoutButton = new javax.swing.JButton();
     addcustomerButton = new javax.swing.JButton();
     jButton8 = new javax.swing.JButton();
     jButton9 = new javax.swing.JButton();
     removevehicleButton = new javax.swing.JButton();
     removevehicleButton.setActionCommand("deleteVehicleGui"); 
     removevehicleButton.addActionListener(controller);
     te = new javax.swing.JPanel();
     Firstpanel = new javax.swing.JPanel();
     jLabel3 = new javax.swing.JLabel();
     vehicleSelect = new javax.swing.JPanel();
     jLabel1 = new javax.swing.JLabel();
     addlorryButton = new javax.swing.JButton();
     addcarButton = new javax.swing.JButton();
     addminibusButton = new javax.swing.JButton();
     jPanel2 = new javax.swing.JPanel();
     newCustomer = new javax.swing.JPanel();
     jLabel2 = new javax.swing.JLabel();
     customerpasswordLabel = new javax.swing.JLabel();
     CustomerIDLabel = new javax.swing.JLabel();
     CustomernameLabl = new javax.swing.JLabel();
     customeraddressLabel = new javax.swing.JLabel();
     customerphonenumberLabel = new javax.swing.JLabel();
     customeremailaddressLabel = new javax.swing.JLabel();
     customerusernameLabel = new javax.swing.JLabel();
     cpasswordtex = new javax.swing.JTextField();
     cidtex = new javax.swing.JTextField();
     cnametex = new javax.swing.JTextField();
     caddresstex = new javax.swing.JTextField();
     cphonenumtex = new javax.swing.JTextField();
     cemailaddresstex = new javax.swing.JTextField();
     cusernametex = new javax.swing.JTextField();
     customerSaveButton = new javax.swing.JButton();
     customerBackButton = new javax.swing.JButton();
     addCar = new javax.swing.JPanel();
     jLabel4 = new javax.swing.JLabel();
     jLabel5 = new javax.swing.JLabel();
     jLabel6 = new javax.swing.JLabel();
     jLabel7 = new javax.swing.JLabel();
     jLabel8 = new javax.swing.JLabel();
     jLabel9 = new javax.swing.JLabel();
     jLabel10 = new javax.swing.JLabel();
     vnametex = new javax.swing.JTextField();
     jLabel11 = new javax.swing.JLabel();
     jLabel12 = new javax.swing.JLabel();
     jLabel13 = new javax.swing.JLabel();
     vcarsavebutton = new javax.swing.JButton();
     vlorrysavebutton = new javax.swing.JButton();
     carBackButton = new javax.swing.JButton();
     vmodeltex = new javax.swing.JTextField();
     cdoorstex = new javax.swing.JTextField();
     vtoptex = new javax.swing.JTextField();
     vregtex = new javax.swing.JTextField();
     vhiretex = new javax.swing.JTextField();
     vhiretex1 = new javax.swing.JTextField();
     vhiretex3 = new javax.swing.JTextField();
     vfuelselect = new javax.swing.JComboBox<>();
     addLorry = new javax.swing.JPanel();
     jLabel14 = new javax.swing.JLabel();
     jLabel15 = new javax.swing.JLabel();
     jLabel16 = new javax.swing.JLabel();
     jLabel17 = new javax.swing.JLabel();
     jLabel18 = new javax.swing.JLabel();
     jLabel19 = new javax.swing.JLabel();
     jLabel21 = new javax.swing.JLabel();
     vnametex1 = new javax.swing.JTextField();
     vmodeltex1 = new javax.swing.JTextField();
     vtoptex1 = new javax.swing.JTextField();
     vregtex1 = new javax.swing.JTextField();
     vtoptex3 = new javax.swing.JTextField();
     vregtex3 = new javax.swing.JTextField();
     cdoorstex1 = new javax.swing.JTextField();
     lorryWeight = new javax.swing.JComboBox<>();
     vcarsavebutton1 = new javax.swing.JButton();
     vminiBussavebutton = new javax.swing.JButton();
     lorryBackButton = new javax.swing.JButton();
     addMinibus = new javax.swing.JPanel();
     jLabel20 = new javax.swing.JLabel();
     vnametex2 = new javax.swing.JTextField();
     jLabel22 = new javax.swing.JLabel();
     vmodeltex2 = new javax.swing.JTextField();
     jLabel23 = new javax.swing.JLabel();
     vregtex2 = new javax.swing.JTextField();
     jLabel24 = new javax.swing.JLabel();
     jLabel25 = new javax.swing.JLabel();
     cdoorstex2 = new javax.swing.JTextField();
     jLabel26 = new javax.swing.JLabel();
     lorryWeight1 = new javax.swing.JComboBox<>();
     jLabel27 = new javax.swing.JLabel();
     vcarsavebutton2 = new javax.swing.JButton();
     minibusBackButton = new javax.swing.JButton();
     jButton14 = new javax.swing.JButton();
     vehicleTableGui = new javax.swing.JPanel();
     vehicleTableLabel = new javax.swing.JLabel();
     jScrollPane1 = new javax.swing.JScrollPane();
     jScrollPane5 = new javax.swing.JScrollPane();
     jScrollPane2 = new javax.swing.JScrollPane();
     jTable1 = new javax.swing.JTable();
     jTable2 = new javax.swing.JTable();
     deletevehicleTableButton = new java.awt.Button();
     editvehicleBackButton = new javax.swing.JButton();
     carTableSelectButton = new javax.swing.JButton();
     minibusTableSelectButton = new javax.swing.JButton();
     lorryTableSelectButton = new javax.swing.JButton();
     viewCustomerButton = new javax.swing.JButton();
     deletecustomerTableButton = new java.awt.Button();
     editcustomerBackButton = new javax.swing.JButton();
     customerTableGui = new javax.swing.JPanel();
     customerTableLabel = new javax.swing.JLabel();
     
     
     menu1 = new java.awt.Menu();
     menu2 = new java.awt.Menu();
     jPanel1 = new javax.swing.JPanel();

     jButton8 = new javax.swing.JButton();
     jButton9 = new javax.swing.JButton();

     jButton14 = new javax.swing.JButton();
     viewCustomerButton = new javax.swing.JButton();
     te = new javax.swing.JPanel();
     Firstpanel = new javax.swing.JPanel();
     jLabel3 = new javax.swing.JLabel();
     vehicleSelect = new javax.swing.JPanel();
     jLabel1 = new javax.swing.JLabel();

     jPanel2 = new javax.swing.JPanel();
     newCustomer = new javax.swing.JPanel();
     jLabel2 = new javax.swing.JLabel();
     jLabel14 = new javax.swing.JLabel();
     jLabel15 = new javax.swing.JLabel();
     jLabel16 = new javax.swing.JLabel();
     jLabel17 = new javax.swing.JLabel();
     jLabel18 = new javax.swing.JLabel();
     jLabel19 = new javax.swing.JLabel();
     jLabel20 = new javax.swing.JLabel();

     addCar = new javax.swing.JPanel();
     jLabel4 = new javax.swing.JLabel();
     jLabel5 = new javax.swing.JLabel();
     jLabel6 = new javax.swing.JLabel();
     jLabel7 = new javax.swing.JLabel();
     jLabel8 = new javax.swing.JLabel();
     jLabel9 = new javax.swing.JLabel();
     jLabel10 = new javax.swing.JLabel();
     vnametex = new javax.swing.JTextField();
     jLabel11 = new javax.swing.JLabel();
     jLabel12 = new javax.swing.JLabel();
     jLabel13 = new javax.swing.JLabel();
     vcarsavebutton = new javax.swing.JButton();

     vmodeltex = new javax.swing.JTextField();
     cdoorstex = new javax.swing.JTextField();
     vtoptex = new javax.swing.JTextField();
     vregtex = new javax.swing.JTextField();
     vhiretex = new javax.swing.JTextField();
     vfuelselect = new javax.swing.JComboBox<>();
     vehicleTableGui = new javax.swing.JPanel();
     vehicleTableLabel = new javax.swing.JLabel();
     jScrollPane1 = new javax.swing.JScrollPane();
     jTable1 = new javax.swing.JTable();
     deletevehicleTableButton = new java.awt.Button();
     editvehicleBackButton = new javax.swing.JButton();
     carTableSelectButton = new javax.swing.JButton();
     minibusTableSelectButton = new javax.swing.JButton();
     lorryTableSelectButton = new javax.swing.JButton();
     customerTableGui = new javax.swing.JPanel();
     customerTableLabel = new javax.swing.JLabel();
     jScrollPane2 = new javax.swing.JScrollPane();
     jTable2 = new javax.swing.JTable();
     deletecustomerTableButton = new java.awt.Button();
     editcustomerBackButton = new javax.swing.JButton();
     addMinibus = new javax.swing.JPanel();
     miniBusTitleLabel = new javax.swing.JLabel();
     minibusMake = new javax.swing.JLabel();
     vnametex3 = new javax.swing.JTextField();
     minibusModel = new javax.swing.JLabel();
     vmodeltex3 = new javax.swing.JTextField();
     minibusTopspeed = new javax.swing.JLabel();
     vtoptex3 = new javax.swing.JTextField();
     minibusRegLabel = new javax.swing.JLabel();
     vregtex3 = new javax.swing.JTextField();
     minibusHireRateLabel = new javax.swing.JLabel();
     vhiretex3 = new javax.swing.JTextField();
     minibusseatcapacityLabel = new javax.swing.JLabel();
     seatcapacity = new javax.swing.JComboBox<>();
     vcarsavebutton1 = new javax.swing.JButton();
     vminiBussavebutton = new javax.swing.JButton();
     jTable3 = new javax.swing.JTable();
     jScrollPane3 = new javax.swing.JScrollPane();
     jScrollPane4 = new javax.swing.JScrollPane();
     jTable4 = new javax.swing.JTable();
     jTable5 = new javax.swing.JTable();
     
     hireoutButton = new javax.swing.JButton();
     selectvehicleLabel = new javax.swing.JLabel();
     selectcustomerLabel = new javax.swing.JLabel();
     jButton17 = new javax.swing.JButton();
     hireVehicle = new javax.swing.JPanel();
     deleteHire = new javax.swing.JButton();
     jComboBoxVehicleId = new javax.swing.JComboBox<>();

     jComboBoxCustomeriD = new javax.swing.JComboBox<>();

     menu1.setLabel("File");
     menuBar1.add(menu1);

     menu2.setLabel("Edit");
     menuBar1.add(menu2);

     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

     jPanel1.setBackground(new java.awt.Color(0, 0, 0));
     jPanel1.setLayout(null);

     vehicleselectButton.setText("Add Vehicle");
     vehicleselectButton.setActionCommand("VehicleSelect"); 
     vehicleselectButton.addActionListener(controller);

     jPanel1.add(vehicleselectButton);
     vehicleselectButton.setBounds(20, 100, 130, 30);

     quitButton.setText("Quit Program");
     quitButton.setActionCommand("quitProgram"); 
     quitButton.addActionListener(controller);
     jPanel1.add(quitButton);
     quitButton.setBounds(20, 510, 170, 50);

     logoutButton.setText("Logout");
     jPanel1.add(logoutButton);
     logoutButton.setBounds(20, 440, 170, 50);
     logoutButton.setActionCommand("logout"); 
     logoutButton.addActionListener(controller);

     addcustomerButton.setText("Add Customer");
     addcustomerButton.setActionCommand("addCustomerButton"); 
     addcustomerButton.addActionListener(controller);

     jPanel1.add(addcustomerButton);
     addcustomerButton.setBounds(20, 360, 130, 30);

     //jButton8.setText("return vehicles");
     //jPanel1.add(jButton8);
     jButton8.setBounds(20, 220, 130, 30);

     jButton9.setText("Hire Vehicles");
     jButton9.setActionCommand("HireButton"); 
     jButton9.addActionListener(controller);
     
     jPanel1.add(jButton9);
     jButton9.setBounds(20, 180, 130, 30);

     removevehicleButton.setText("Remove vehicle");
     jPanel1.add(removevehicleButton);
     removevehicleButton.setActionCommand("removevehicletableButton"); 
     removevehicleButton.addActionListener(controller);
     removevehicleButton.setBounds(20, 140, 130, 30);
     
     viewCustomerButton.setLabel("View Customer");
     viewCustomerButton.setActionCommand("viewcustomerData"); 
     viewCustomerButton.addActionListener(controller);
     viewCustomerButton.setMaximumSize(new java.awt.Dimension(113, 25));
     viewCustomerButton.setMinimumSize(new java.awt.Dimension(113, 25));
     viewCustomerButton.setPreferredSize(new java.awt.Dimension(113, 25));
     jPanel1.add(viewCustomerButton);
     viewCustomerButton.setBounds(20, 320, 130, 30);
// this is setup up the initial card layout
     te.setLayout(new java.awt.CardLayout());

     jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); 
  // this sets the logo for the staff hire section   
     jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\rasti\\eclipse-workspace\\csy2030as2\\src\\csy2030as2\\carlogo.jpg"));   

     javax.swing.GroupLayout FirstpanelLayout = new javax.swing.GroupLayout(Firstpanel);
     Firstpanel.setLayout(FirstpanelLayout);
     FirstpanelLayout.setHorizontalGroup(
         FirstpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirstpanelLayout.createSequentialGroup()
             .addContainerGap(62, Short.MAX_VALUE)
             .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addGap(51, 51, 51))
     );
     FirstpanelLayout.setVerticalGroup(
         FirstpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(FirstpanelLayout.createSequentialGroup()
             .addGap(195, 195, 195)
             .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap(134, Short.MAX_VALUE))
     );

     te.add(Firstpanel, "card4");

     jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); 
     jLabel1.setText("select vehicle type");

     addlorryButton.setText("Lorry");
     // action listeners for the button being setup
     addlorryButton.setActionCommand("addLorryButton"); 
     addlorryButton.addActionListener(controller);
     


     addcarButton.setText("Car");
  // action listeners for the button being setup
     addcarButton.setActionCommand("addcarButton"); 
     addcarButton.addActionListener(controller);


     addminibusButton.setText("MiniBus");
  // action listeners for the button being setup
     addminibusButton.setActionCommand("addminiBusButton"); 
     addminibusButton.addActionListener(controller);


     javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
     jPanel2.setLayout(jPanel2Layout);
     jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 100, Short.MAX_VALUE)
     );
     jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 100, Short.MAX_VALUE)
     );

     javax.swing.GroupLayout vehicleSelectLayout = new javax.swing.GroupLayout(vehicleSelect);
     vehicleSelect.setLayout(vehicleSelectLayout);
     vehicleSelectLayout.setHorizontalGroup(
         vehicleSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(vehicleSelectLayout.createSequentialGroup()
        		 // placing the buttons/labels and arranging the spacing and size
             .addGap(28, 28, 28)
             .addComponent(jLabel1))
         .addGroup(vehicleSelectLayout.createSequentialGroup()
             .addGap(30, 30, 30)
             .addComponent(addcarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addGap(46, 46, 46)
             .addComponent(addminibusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addGap(46, 46, 46)
             .addComponent(addlorryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
         .addGroup(vehicleSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(vehicleSelectLayout.createSequentialGroup()
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(0, 0, Short.MAX_VALUE)))
     );
     vehicleSelectLayout.setVerticalGroup(
         vehicleSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(vehicleSelectLayout.createSequentialGroup()
        		 // placing the buttons/labels and arranging the spacing and size
             .addGap(22, 22, 22)
             .addComponent(jLabel1)
             .addGap(150, 150, 150)
             .addGroup(vehicleSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(addcarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(addminibusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(addlorryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
         .addGroup(vehicleSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(vehicleSelectLayout.createSequentialGroup()
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(0, 0, Short.MAX_VALUE)))
     );

     te.add(vehicleSelect, "card2");

     newCustomer.setLayout(null);

     jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); 
     jLabel2.setText("Add New Customer");
     newCustomer.add(jLabel2);
  // placing the buttons/labels and arranging the spacing and size
     jLabel2.setBounds(23, 11, 408, 58);

     customerpasswordLabel.setText("Password");
     newCustomer.add(customerpasswordLabel);
     customerpasswordLabel.setBounds(20, 360, 130, 30);

     CustomerIDLabel.setText("Customer id");
     newCustomer.add(CustomerIDLabel);
     CustomerIDLabel.setBounds(20, 110, 130, 30);

     CustomernameLabl.setText("Name");
     newCustomer.add(CustomernameLabl);
     CustomernameLabl.setBounds(20, 150, 130, 30);

     customeraddressLabel.setText("Address");
     newCustomer.add(customeraddressLabel);
     customeraddressLabel.setBounds(20, 200, 130, 30);

     customerphonenumberLabel.setText("PhoneNumber");
     newCustomer.add(customerphonenumberLabel);
     customerphonenumberLabel.setBounds(20, 240, 130, 30);

     customeremailaddressLabel.setText("Email Address");
     newCustomer.add(customeremailaddressLabel);
     customeremailaddressLabel.setBounds(20, 280, 130, 30);

     customerusernameLabel.setText("Username");
     newCustomer.add(customerusernameLabel);
     customerusernameLabel.setBounds(20, 320, 130, 30);
     newCustomer.add(cpasswordtex);
     cpasswordtex.setBounds(140, 360, 170, 30);
     newCustomer.add(cidtex);
     cidtex.setBounds(140, 110, 170, 30);
     newCustomer.add(cnametex);
     cnametex.setBounds(140, 150, 170, 30);
     newCustomer.add(caddresstex);
     caddresstex.setBounds(140, 200, 170, 30);
     newCustomer.add(cphonenumtex);
     cphonenumtex.setBounds(140, 240, 170, 30);
     newCustomer.add(cemailaddresstex);
     cemailaddresstex.setBounds(140, 280, 170, 30);
     newCustomer.add(cusernametex);
     cusernametex.setBounds(140, 320, 170, 30);

     customerSaveButton.setText("Save");
     newCustomer.add(customerSaveButton);
     customerSaveButton.setActionCommand("addcustomerSytem"); 
     customerSaveButton.addActionListener(controller);
     customerSaveButton.setBounds(100, 410, 120, 50);

     customerBackButton.setText("Back");
     customerBackButton.setActionCommand("customerBack"); 
     customerBackButton.addActionListener(controller);

     newCustomer.add(customerBackButton);
     customerBackButton.setBounds(527, 535, 150, 50);

     te.add(newCustomer, "card3");

     jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); 
     jLabel4.setText("Add New Car");

     jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); 
     jLabel5.setText("Make");

     jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); 
     jLabel6.setText("Top Speed");

     jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); 

     jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); 

     jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); 
     jLabel9.setText("Model");

     jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); 
     jLabel10.setText("Reg Number");

     jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); 
     jLabel11.setText("Fuel Type");

     jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); 
     jLabel12.setText("Daily Hire Rate");

     jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); 
     jLabel13.setText("Number of doors");

     vcarsavebutton.setFont(new java.awt.Font("Tahoma", 0, 36)); 
     vcarsavebutton.setText("Save");
     vcarsavebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
     vcarsavebutton.setActionCommand("addcarSytem"); 
     vcarsavebutton.addActionListener(controller);
     
     
     carBackButton.setFont(new java.awt.Font("Tahoma", 0, 36));   
     carBackButton.setText("Back ");
     carBackButton.setActionCommand("carBack"); 
     carBackButton.addActionListener(controller);


     vfuelselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol", "diesel" }));

     javax.swing.GroupLayout addCarLayout = new javax.swing.GroupLayout(addCar);
     addCar.setLayout(addCarLayout);
     addCarLayout.setHorizontalGroup(
         addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarLayout.createSequentialGroup()
             .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addComponent(carBackButton)
             .addGap(23, 23, 23))
         .addGroup(addCarLayout.createSequentialGroup()
             .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(addCarLayout.createSequentialGroup()
                     .addContainerGap()
                     .addComponent(jLabel4))
                 .addGroup(addCarLayout.createSequentialGroup()
                     .addGap(25, 25, 25)
                     .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel5)
                         .addComponent(jLabel9)
                         .addComponent(jLabel6)
                         .addGroup(addCarLayout.createSequentialGroup()
                             .addComponent(jLabel10)
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                             .addComponent(jLabel7))
                         .addComponent(jLabel12)
                         .addComponent(jLabel13)
                         .addComponent(jLabel11))
                     .addGap(48, 48, 48)
                     .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(cdoorstex, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                         .addComponent(vmodeltex, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                         .addComponent(vnametex, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                         .addComponent(vtoptex, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                         .addComponent(vregtex, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                         .addComponent(vhiretex, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                         .addComponent(vfuelselect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                 .addGroup(addCarLayout.createSequentialGroup()
                     .addGap(115, 115, 115)
                     .addComponent(vcarsavebutton)))
             .addContainerGap(332, Short.MAX_VALUE))
         .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(addCarLayout.createSequentialGroup()
                 .addGap(35, 35, 35)
                 .addComponent(jLabel8)
                 .addContainerGap(675, Short.MAX_VALUE)))
     );
     addCarLayout.setVerticalGroup(
         addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      // placing the buttons/labels and arranging the spacing and size
         .addGroup(addCarLayout.createSequentialGroup()
             .addContainerGap()
             .addComponent(jLabel4)
             .addGap(39, 39, 39)
             .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(jLabel5)
                 .addComponent(vnametex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(addCarLayout.createSequentialGroup()
                     .addComponent(jLabel9)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(jLabel6)
                     .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(addCarLayout.createSequentialGroup()
                             .addGap(20, 20, 20)
                             .addComponent(jLabel7))
                         .addGroup(addCarLayout.createSequentialGroup()
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                             .addComponent(jLabel10))))
                 .addGroup(addCarLayout.createSequentialGroup()
                     .addComponent(vmodeltex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(vtoptex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(vregtex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
             .addGap(28, 28, 28)
             .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(jLabel12)
                 .addComponent(vhiretex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(18, 18, 18)
             .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(addCarLayout.createSequentialGroup()
                     .addComponent(jLabel13)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel11)
                         .addComponent(vfuelselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGap(46, 46, 46)
                     .addComponent(vcarsavebutton)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                     .addComponent(carBackButton)
                     .addGap(19, 19, 19))
                 .addGroup(addCarLayout.createSequentialGroup()
                     .addComponent(cdoorstex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
         .addGroup(addCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(addCarLayout.createSequentialGroup()
                 .addGap(212, 212, 212)
                 .addComponent(jLabel8)
                 .addContainerGap(399, Short.MAX_VALUE)))
     );

     te.add(addCar, "card5");
  // placing the buttons/labels setting font and text size
     jLabel14.setFont(new java.awt.Font("Tahoma", 0, 48));   
     jLabel14.setText("Add New Lorry");

     jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24));   
     jLabel15.setText("Make");

     jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24));   
     jLabel16.setText("Model");

     jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24));   
     jLabel17.setText("Top Speed");

     jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24));   
     jLabel18.setText("Reg Number");

     jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24));   
     jLabel19.setText("Daily Hire Rate");

     jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24));   
     jLabel21.setText("Load Weight");

     vlweight1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "12", "40" }));


     vlorrysavebutton.setFont(new java.awt.Font("Tahoma", 0, 36));   
     vlorrysavebutton.setText("Save");
     vlorrysavebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
     vlorrysavebutton.setActionCommand("addlorrySytem"); 
     vlorrysavebutton.addActionListener(controller);
     lorryBackButton.setFont(new java.awt.Font("Tahoma", 0, 36));   
     lorryBackButton.setText("Back ");
     lorryBackButton.setActionCommand("lorryBack"); 
     lorryBackButton.addActionListener(controller);
     

     javax.swing.GroupLayout addLorryLayout = new javax.swing.GroupLayout(addLorry);
     addLorry.setLayout(addLorryLayout);
     addLorryLayout.setHorizontalGroup(
         addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(addLorryLayout.createSequentialGroup()
             .addGap(20, 20, 20)
             .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(jLabel14)
                 .addGroup(addLorryLayout.createSequentialGroup()
                     .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel15)
                         .addComponent(jLabel16)
                         .addComponent(jLabel17)
                         .addComponent(jLabel18)
                         .addComponent(jLabel19)
                         .addComponent(jLabel21))
                  // placing the buttons/labels and arranging the spacing and size
                     .addGap(67, 67, 67)
                     .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(vlweight1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                             .addComponent(vhiretex1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                             .addComponent(vmodeltex1)
                             .addComponent(vnametex1)
                             .addComponent(vtoptex1)
                             .addComponent(vregtex1))))
                 .addGroup(addLorryLayout.createSequentialGroup()
                     .addGap(134, 134, 134)
                     .addComponent(vlorrysavebutton)))
             .addContainerGap(340, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLorryLayout.createSequentialGroup()
             .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addComponent(lorryBackButton)
             .addGap(27, 27, 27))
     );
     addLorryLayout.setVerticalGroup(
         addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(addLorryLayout.createSequentialGroup()
             .addGap(22, 22, 22)
             .addComponent(jLabel14)
             .addGap(32, 32, 32)
             .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(addLorryLayout.createSequentialGroup()
                     .addComponent(jLabel15)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(jLabel16)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel17)
                         .addComponent(vtoptex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addGroup(addLorryLayout.createSequentialGroup()
                     .addComponent(vnametex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(vmodeltex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(jLabel18)
                 .addComponent(vregtex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(28, 28, 28)
             .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(vhiretex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(jLabel19))
             .addGap(26, 26, 26)
             .addGroup(addLorryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(jLabel21)
                 .addComponent(vlweight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGap(25, 25, 25)
             .addComponent(vlorrysavebutton)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
             .addComponent(lorryBackButton)
             .addGap(24, 24, 24))
     );
    
     te.add(addLorry, "card6");
     // placing the buttons/labels setting font and text size
     miniBusTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 48));   
     miniBusTitleLabel.setText("Add New MiniBus");

     minibusMake.setFont(new java.awt.Font("Tahoma", 0, 24));   
     minibusMake.setText("Make");

     minibusModel.setFont(new java.awt.Font("Tahoma", 0, 24));   
     minibusModel.setText("Model");

     minibusTopspeed.setFont(new java.awt.Font("Tahoma", 0, 24));   
     minibusTopspeed.setText("Top Speed");

     minibusRegLabel.setFont(new java.awt.Font("Tahoma", 0, 24));   
     minibusRegLabel.setText("Reg Number");

     minibusHireRateLabel.setFont(new java.awt.Font("Tahoma", 0, 24));   
     minibusHireRateLabel.setText("Daily Hire Rate");

     minibusseatcapacityLabel.setFont(new java.awt.Font("Tahoma", 0, 24));   
     minibusseatcapacityLabel.setText("Seat Capacity");

     vmbseatcap1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16" }));

     vminiBussavebutton.setFont(new java.awt.Font("Tahoma", 0, 36));   
     vminiBussavebutton.setText("Save");
     vminiBussavebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
     vminiBussavebutton.setActionCommand("addminibusSytem"); 
     vminiBussavebutton.addActionListener(controller);


     minibusBackButton.setFont(new java.awt.Font("Tahoma", 0, 36));   
     minibusBackButton.setText("Back ");
     minibusBackButton.setActionCommand("minibusBack"); 
     minibusBackButton.addActionListener(controller);


     javax.swing.GroupLayout addMinibusLayout = new javax.swing.GroupLayout(addMinibus);
     addMinibus.setLayout(addMinibusLayout);
     addMinibusLayout.setHorizontalGroup(
    		// placing the buttons/labels and arranging the spacing and size
         addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(addMinibusLayout.createSequentialGroup()
             .addGap(258, 258, 258)
             .addComponent(vregtex3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap(296, Short.MAX_VALUE))
         .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(addMinibusLayout.createSequentialGroup()
                 .addGap(17, 17, 17)
                 .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addMinibusLayout.createSequentialGroup()
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(minibusBackButton))
                     .addGroup(addMinibusLayout.createSequentialGroup()
                         .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(miniBusTitleLabel)
                             .addGroup(addMinibusLayout.createSequentialGroup()
                                 .addGap(13, 13, 13)
                                 .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addComponent(minibusMake)
                                     .addComponent(minibusModel)
                                     .addComponent(minibusTopspeed)
                                     .addComponent(minibusRegLabel)
                                     .addComponent(minibusHireRateLabel)
                                     .addComponent(minibusseatcapacityLabel))
                                 .addGap(69, 69, 69)
                                 .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                     .addComponent(vmodeltex3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                     .addComponent(vnametex3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                     .addComponent(vtoptex3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                     .addComponent(vhiretex3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                     .addComponent(vmbseatcap1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                             .addGroup(addMinibusLayout.createSequentialGroup()
                                 .addGap(103, 103, 103)
                                 .addComponent(vminiBussavebutton)))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addContainerGap(17, Short.MAX_VALUE)))
     );
     addMinibusLayout.setVerticalGroup(
         addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      // placing the buttons/labels and arranging the spacing and size
         .addGroup(addMinibusLayout.createSequentialGroup()
             .addGap(223, 223, 223)
             .addComponent(vregtex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap(328, Short.MAX_VALUE))
         .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(addMinibusLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addComponent(miniBusTitleLabel)
                 .addGap(39, 39, 39)
                 .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(minibusMake)
                     .addComponent(vnametex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(addMinibusLayout.createSequentialGroup()
                         .addComponent(minibusModel)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(minibusTopspeed)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(minibusRegLabel))
                     .addGroup(addMinibusLayout.createSequentialGroup()
                         .addComponent(vmodeltex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(vtoptex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addGap(28, 28, 28)
                 .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(minibusHireRateLabel)
                     .addComponent(vhiretex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(60, 60, 60)
                 .addGroup(addMinibusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(minibusseatcapacityLabel)
                     .addComponent(vmbseatcap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(46, 46, 46)
                 .addComponent(vminiBussavebutton)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(minibusBackButton)
                 .addGap(16, 16, 16)))
     );

     te.add(addMinibus, "card7");
     // placing the buttons/labels setting font and text size    
     vehicleTableLabel.setFont(new java.awt.Font("Tahoma", 0, 24));   
     vehicleTableLabel.setText("Remove/Edit Vehicles");

     columnNames = new String[] {"Make", "Model", "Top Speed", "Reg Number", "Dailyhire Rate","Door No","Fuel Type","Load Weight","seat Capacity", "Hirer"};
     fmodel = new DefaultTableModel(data, columnNames);
     jScrollPane1.setViewportView(jTable1);
     
     deletevehicleTableButton.setFont(new java.awt.Font("Dialog", 1, 24));   
     deletevehicleTableButton.setLabel("Delete");
     deletevehicleTableButton.setActionCommand("removevehicletableDeleteButton"); 
     deletevehicleTableButton.addActionListener(controller);

     editvehicleBackButton.setFont(new java.awt.Font("Tahoma", 1, 24));   
     editvehicleBackButton.setText("Reset");
     editvehicleBackButton.setActionCommand("removevehicletableBackButton"); 
     editvehicleBackButton.addActionListener(controller);

     carTableSelectButton.setText("Car");
     carTableSelectButton.setActionCommand("viewcarData"); 
     carTableSelectButton.addActionListener(controller);

     minibusTableSelectButton.setText("MiniBus");
     minibusTableSelectButton.setActionCommand("MiniBus");
     minibusTableSelectButton.setActionCommand("viewminibusData"); 
     minibusTableSelectButton.addActionListener(controller);

     lorryTableSelectButton.setText("Lorry");
     lorryTableSelectButton.setActionCommand("viewLorryData"); 
     lorryTableSelectButton.addActionListener(controller);

     javax.swing.GroupLayout vehicleTableGuiLayout = new javax.swing.GroupLayout(vehicleTableGui);
     vehicleTableGui.setLayout(vehicleTableGuiLayout);
     vehicleTableGuiLayout.setHorizontalGroup(
         vehicleTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(vehicleTableGuiLayout.createSequentialGroup()
             .addGap(35, 35, 35)
             .addComponent(vehicleTableLabel)
             .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(vehicleTableGuiLayout.createSequentialGroup()
             .addGroup(vehicleTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGroup(vehicleTableGuiLayout.createSequentialGroup()
                     .addGap(26, 26, 26)
                     .addComponent(deletevehicleTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(36, 36, 36)
                     .addComponent(carTableSelectButton)
                     .addGap(18, 18, 18)
                     .addComponent(minibusTableSelectButton)
                     .addGap(18, 18, 18)
                     .addComponent(lorryTableSelectButton)))
             .addGap(0, 34, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehicleTableGuiLayout.createSequentialGroup()
             .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addComponent(editvehicleBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap())
     );
     vehicleTableGuiLayout.setVerticalGroup(
         vehicleTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(vehicleTableGuiLayout.createSequentialGroup()
             .addGap(44, 44, 44)
             .addComponent(vehicleTableLabel)
             .addGap(38, 38, 38)
             .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addGap(18, 18, 18)
             .addGroup(vehicleTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(deletevehicleTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGroup(vehicleTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(carTableSelectButton)
                     .addComponent(minibusTableSelectButton)
                     .addComponent(lorryTableSelectButton)))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(editvehicleBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap(17, Short.MAX_VALUE))
     );

     te.add(vehicleTableGui, "card6");
     // placing the buttons/labels setting font and text size  
     customerTableLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); 
     customerTableLabel.setText("Remove/Edit Customers");

     columnNames2 = new String[] {"Id", "Name", "Address", "PhoneNum", "Email","Username" , "Password", "Loaned Vehicles"};
     fmodel2 = new DefaultTableModel(data, columnNames2);
     jScrollPane2.setViewportView(jTable2);

     deletecustomerTableButton.setFont(new java.awt.Font("Dialog", 1, 24)); 
     deletecustomerTableButton.setLabel("Delete");
     deletecustomerTableButton.setActionCommand("removecustomertableDeleteButton"); 
     deletecustomerTableButton.addActionListener(controller);
     
  

     editcustomerBackButton.setFont(new java.awt.Font("Tahoma", 1, 24)); 
     editcustomerBackButton.setText("Reset");
     editcustomerBackButton.setActionCommand("removecustomertableBackButton"); 
     editcustomerBackButton.addActionListener(controller);
  // placing the buttons/labels and arranging the spacing and size
     javax.swing.GroupLayout customerTableGuiLayout = new javax.swing.GroupLayout(customerTableGui);
     customerTableGui.setLayout(customerTableGuiLayout);
     customerTableGuiLayout.setHorizontalGroup(
         customerTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 678, Short.MAX_VALUE)
         .addGroup(customerTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(customerTableGuiLayout.createSequentialGroup()
                 .addGap(6, 6, 6)
                 .addGroup(customerTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(editcustomerBackButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(customerTableGuiLayout.createSequentialGroup()
                         .addGroup(customerTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(customerTableGuiLayout.createSequentialGroup()
                                 .addGap(35, 35, 35)
                                 .addComponent(customerTableLabel))
                             .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addGroup(customerTableGuiLayout.createSequentialGroup()
                                 .addGap(26, 26, 26)
                                 .addComponent(deletecustomerTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                         .addGap(22, 22, 22)))
                 .addGap(6, 6, 6)))
     );
     customerTableGuiLayout.setVerticalGroup(
         customerTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 573, Short.MAX_VALUE)
         .addGroup(customerTableGuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(customerTableGuiLayout.createSequentialGroup()
                 .addGap(30, 30, 30)
                 .addComponent(customerTableLabel)
                 .addGap(38, 38, 38)
                 .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(18, 18, 18)
                 .addComponent(deletecustomerTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(editcustomerBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(31, Short.MAX_VALUE)))
     );

     te.add(customerTableGui, "card7");
     // placing the buttons/labels setting font and text size     

         fmodel2 = new DefaultTableModel(data, columnNames2);
         jScrollPane3.setViewportView(jTable3);


         fmodel = new DefaultTableModel(data, columnNames);
         jScrollPane4.setViewportView(jTable4);

         hireoutButton.setFont(new java.awt.Font("Tahoma", 1, 20)); 
         hireoutButton.setText("Hire Out");
         hireoutButton.setActionCommand("HireOutFunction"); 
         hireoutButton.addActionListener(controller);

         selectvehicleLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
         selectvehicleLabel.setText("Select Vehicle");

         selectcustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); 
         selectcustomerLabel.setText("Select Customer");

         jButton17.setFont(new java.awt.Font("Tahoma", 0, 26)); 
         jButton17.setText("Reset");
         jButton17.setActionCommand("resetHireVehicleTable"); 
         jButton17.addActionListener(controller);


         deleteHire.setFont(new java.awt.Font("Tahoma", 1, 24)); 
         deleteHire.setText("Return");
         deleteHire.setActionCommand("deleteHireVehicleTable"); 
         deleteHire.addActionListener(controller);
/// this is where im trying to do my hire out 
         jComboBoxVehicleId.setModel(new javax.swing.DefaultComboBoxModel<>());
      

         jComboBoxCustomeriD.setModel(new javax.swing.DefaultComboBoxModel<>());

         javax.swing.GroupLayout hireVehicleLayout = new javax.swing.GroupLayout(hireVehicle);
         hireVehicle.setLayout(hireVehicleLayout);
         hireVehicleLayout.setHorizontalGroup(
             hireVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(hireVehicleLayout.createSequentialGroup()
            		// placing the buttons/labels and arranging the spacing and size
                 .addGap(42, 42, 42)
                 .addGroup(hireVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(hireVehicleLayout.createSequentialGroup()
                         .addComponent(selectvehicleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addGroup(hireVehicleLayout.createSequentialGroup()
                         .addGroup(hireVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(hireVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                 .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                                 .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                             .addComponent(selectcustomerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                         .addGroup(hireVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(hireoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING)
                             .addComponent(deleteHire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jComboBoxVehicleId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jComboBoxCustomeriD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGap(47, 47, 47))))
         );
         hireVehicleLayout.setVerticalGroup(
             hireVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(hireVehicleLayout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(selectvehicleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(hireVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(hireVehicleLayout.createSequentialGroup()
                         .addComponent(jComboBoxVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(18, 18, 18)
                         .addComponent(jComboBoxCustomeriD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addGap(18, 18, 18)
                 .addGroup(hireVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(hireVehicleLayout.createSequentialGroup()
                         .addComponent(selectcustomerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(hireVehicleLayout.createSequentialGroup()
                         .addComponent(hireoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                         .addComponent(deleteHire, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(66, 66, 66)
                         .addComponent(jButton17)))
                 .addContainerGap(56, Short.MAX_VALUE))
         );
         te.add(hireVehicle, "card9");

     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(te, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     );
     layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(te, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     );
   
     pack();
     // sets the card layout visible
   setVisible(true);
}


     




	   public String getModel3()
	   {
	   return vmodeltex3.getText();
	   }
	   public String getMake3()
	   {
	   return vnametex3.getText();
	   }

	   public String getTopSpeed3()
	   {
	   return vtoptex3.getText();
	   }
	   public String getReg3()
	   {
	   return vregtex3.getText();
	   }

	   public double getHire3()
	   {
	   	
	   return Double.parseDouble(vhiretex3.getText());

	   }
	   public String gethiredToo3()
	   {
	   return "0";
	   }


	   


	   public String getModel2()
	   {
	   return vmodeltex1.getText();
	   }
	   public String getMake2()
	   {
	   return vnametex1.getText();
	   }

	   public String getTopSpeed2() // this gets the base lorry requirments
	   {
	   return vtoptex1.getText();
	   }
	   public String getReg2()
	   {
	   return vregtex1.getText();
	   }

	   public double getHire2()
	   {
	   	
	   return Double.parseDouble(vhiretex1.getText());

	   }
	   public String gethiredToo2()
	   {
	   return "0";
	   }
	   

public String getModel()
{
return vmodeltex.getText() + vmodeltex1.getText();
}
public String getMake()
{
return vnametex.getText();
}

public String getTopSpeed() 		// base car
{
return vtoptex.getText();
}
public String getReg()
{
return vregtex.getText();
}

public double getHire()
{
	
return Double.parseDouble(vhiretex.getText());

}
public String gethiredToo()
{
return "0";
}


public String getFuelType()
{
	 System.out.println(this.vfuelselect.getSelectedItem() + "fuel type");//this is the unique car getters/setters
return vfuelselect.getSelectedItem().toString(); 
}
public int getNumberOfDoors()
{
return Integer.parseInt(cdoorstex.getText());

}



public int getHoldCapacity()
{	 System.out.println(this.vlweight1.getSelectedItem() + " ammount of weight");// this is the unique lorry getters/setters
	return Integer.parseInt((String)vlweight1.getSelectedItem());
}


public int getSeatCapacity()
	{	 System.out.println(this.vmbseatcap1.getSelectedItem() + " ammount of seats");//this is the unique Minibus getters/setters
return Integer.parseInt((String)vmbseatcap1.getSelectedItem());
	}
	










//vehicle getters
public  int getCustomerId()
{
return Integer.parseInt(cidtex.getText());
}

public String getName()
{
return cnametex.getText();
}
public String getAddress()
{
return caddresstex.getText();
}
public  int getPhoneNumber()
{
return Integer.parseInt(cphonenumtex.getText());
}
public String getEmailAddress()
{
return cemailaddresstex.getText();
}
public String getcUserName()
{
return cusernametex.getText();
}

public String gethiredOut()
{
return "0";// this is what sets the customer hired out to 0 when the customer is created or vehicle is returned
}
public String getcpassword()
{
return cpasswordtex.getText();
}
  public void hiddenlogin() {

  l.setVisible(false); // this hides the login screen
  }
public String getuserName()
{
return userName_text.getText();
}
public String getpassword()
{
return password_text.getText();
}




private javax.swing.JButton customerExit;
private javax.swing.JScrollPane jScrollPane5;
javax.swing.JTable jTable5;

javax.swing.JPanel customerTableGui;
private javax.swing.JLabel customerTableLabel;
private java.awt.Button deletecustomerTableButton;
private javax.swing.JButton editcustomerBackButton;
private javax.swing.JButton viewCustomerButton;
private javax.swing.JButton editvehicleBackButton;
private javax.swing.JButton carTableSelectButton;
private javax.swing.JButton lorryTableSelectButton;
private javax.swing.JButton minibusTableSelectButton;
private javax.swing.JButton jButton14;
java.awt.Button deletevehicleTableButton;
javax.swing.JTable jTable1;
javax.swing.JTable jTable2;
javax.swing.JScrollPane jScrollPane1;
javax.swing.JScrollPane jScrollPane2;
private javax.swing.JLabel vehicleTableLabel;
javax.swing.JPanel vehicleTableGui;
private javax.swing.JLabel CustomerIDLabel;
private javax.swing.JLabel CustomernameLabl;
javax.swing.JPanel Firstpanel;
javax.swing.JPanel addCar;
javax.swing.JPanel addLorry;
javax.swing.JPanel addMinibus;
private javax.swing.JButton addcarButton;
private javax.swing.JButton addcustomerButton;
private javax.swing.JButton addlorryButton;
private javax.swing.JButton addminibusButton;
//private javax.swing.JTextField caddresstex;
//private javax.swing.JTextField cdoorstex;
private javax.swing.JTextField cdoorstex1;
private javax.swing.JTextField cdoorstex2;
//private javax.swing.JTextField cemailaddresstex;
//private javax.swing.JTextField cidtex;
//private javax.swing.JTextField cnametex;
//private javax.swing.JTextField cpasswordtex;
//private javax.swing.JTextField cphonenumtex;
//private javax.swing.JTextField cusernametex;
private javax.swing.JLabel customeraddressLabel;
private javax.swing.JLabel customeremailaddressLabel;
private javax.swing.JLabel customerpasswordLabel;
private javax.swing.JLabel customerphonenumberLabel;
private javax.swing.JLabel customerusernameLabel;
private javax.swing.JButton customerSaveButton;
private javax.swing.JButton carBackButton;
private javax.swing.JButton customerBackButton;
private javax.swing.JButton lorryBackButton;
private javax.swing.JButton minibusBackButton;
private javax.swing.JButton quitButton;
private javax.swing.JButton logoutButton;
private javax.swing.JButton jButton8;
private javax.swing.JButton jButton9;
private javax.swing.JLabel miniBusTitleLabel;
private javax.swing.JLabel minibusHireRateLabel;
private javax.swing.JLabel minibusMake;
private javax.swing.JLabel minibusModel;
private javax.swing.JLabel minibusRegLabel;
//private javax.swing.JButton minibusTableSelectButton;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel10;
private javax.swing.JLabel jLabel11;
private javax.swing.JLabel jLabel12;
private javax.swing.JLabel jLabel13;
private javax.swing.JLabel jLabel14;
private javax.swing.JLabel jLabel15;
private javax.swing.JLabel jLabel16;
private javax.swing.JLabel jLabel17;
private javax.swing.JLabel jLabel18;
private javax.swing.JLabel jLabel19;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel20;
private javax.swing.JLabel jLabel21;
private javax.swing.JLabel jLabel22;
private javax.swing.JLabel jLabel23;
private javax.swing.JLabel jLabel24;
private javax.swing.JLabel jLabel25;
private javax.swing.JLabel jLabel26;
private javax.swing.JLabel jLabel27;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
javax.swing.JTable jTable3;
javax.swing.JTable jTable4;

//hire vehicle section
private javax.swing.JScrollPane jScrollPane3;
private javax.swing.JScrollPane jScrollPane4;
private javax.swing.JButton hireoutButton;
private javax.swing.JLabel selectcustomerLabel;
private javax.swing.JLabel selectvehicleLabel;
private javax.swing.JButton jButton17;
javax.swing.JPanel hireVehicle;
private javax.swing.JButton deleteHire;
 javax.swing.JComboBox<String> jComboBoxCustomeriD;
 javax.swing.JComboBox<String> jComboBoxVehicleId;
 javax.swing.JComboBox<String> jComboBoxCustomerView;

private javax.swing.JLabel jLabel8;
private javax.swing.JLabel jLabel9;
private javax.swing.JPanel jPanel1;
private javax.swing.JPanel jPanel2;
private javax.swing.JLabel minibusTopspeed;
private javax.swing.JLabel minibusseatcapacityLabel;
private javax.swing.JComboBox<String> lorryWeight;
private javax.swing.JComboBox<String> lorryWeight1;
private java.awt.Menu menu1;
private java.awt.Menu menu2;
private java.awt.MenuBar menuBar1;
javax.swing.JPanel newCustomer;
private javax.swing.JButton removevehicleButton;
javax.swing.JPanel te;

private javax.swing.JButton vminiBussavebutton;
private javax.swing.JButton vcarsavebutton1;
private javax.swing.JButton vcarsavebutton2;
javax.swing.JPanel vehicleSelect;
private javax.swing.JButton vehicleselectButton;

private javax.swing.JComboBox<String> seatcapacity;
private javax.swing.JTextField vhiretex1;
private javax.swing.JTextField vhiretex3;

private javax.swing.JTextField vmodeltex1;
private javax.swing.JTextField vmodeltex2;
private javax.swing.JTextField vmodeltex3;

private javax.swing.JTextField vnametex1;
private javax.swing.JTextField vnametex2;
private javax.swing.JTextField vnametex3;

private javax.swing.JTextField vregtex1;
private javax.swing.JTextField vregtex2;
private javax.swing.JTextField vregtex3;

private javax.swing.JTextField vtoptex1;
private javax.swing.JTextField vtoptex3;
}