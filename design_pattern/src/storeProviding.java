import java.awt.SecondaryLoop;


public class storeProviding {

	
	public static void first_seq(String location, String device) {
		System.out.println("Location Selected as : " + location);
		System.out.println("***********************************************************************************************************************************************************");
		deviceLaptop devLaptop = new deviceLaptop();
		deviceCamera devCamera = new deviceCamera();
		devicePhone devPhone = new devicePhone();
		deviceDisplayer xyz_shop = new deviceDisplayer(devLaptop, devCamera, devPhone);
		xyz_shop.showDevices();
		Add_item.second_seq(device);

	}

}
