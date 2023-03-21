package csy2030as2;

import javax.swing.JFrame;

public class NorthamptonVehicleHire {

	public static void main(String[] args) {
	
		NorthamptonVehicleHireModel model = new NorthamptonVehicleHireModel();
		NorthamptonVehicleHireController controller = new NorthamptonVehicleHireController(model);
		NorthamptonVehicleHireView view = new NorthamptonVehicleHireView(model, controller);

}
}
