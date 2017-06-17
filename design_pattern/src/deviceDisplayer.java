import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;


public class deviceDisplayer {

	deviceLaptop devLaptop;
	deviceCamera devCamera;
	devicePhone devPhone;
	//iterator
	deviceIterator iterForLaptop;
	deviceIterator iterForCamera;
	deviceIterator iterForPhone;
	
	
	public deviceDisplayer(deviceIterator newLaptop,deviceIterator newCamera, deviceIterator newPhone) {
		iterForLaptop = newLaptop;
		iterForCamera = newCamera;
		iterForPhone = newPhone;
	}

	public void showDevices() {
		// TODO Auto-generated method stub
		Iterator<deviceInfo> DevLaptop = iterForLaptop.createIterator();
		Iterator<deviceInfo> DevCamera = iterForCamera.createIterator();
		Iterator<deviceInfo> DevPhone = iterForPhone.createIterator();
		System.out.println("************************************************");
		System.out.println("Laptop devices are : ");
		printDevice(DevLaptop);
		System.out.println("************************************************");
		System.out.println("Phone devices are : ");
		printDevice(DevPhone);
		System.out.println("************************************************");
		System.out.println("Camera devices are : ");
		printDevice(DevCamera);
		
	}	

	public void printDevice(Iterator<deviceInfo> iterator) {
		int count=1;
		while(iterator.hasNext()){
			deviceInfo devinfo = (deviceInfo) iterator.next();
			System.out.println("Showing Available :: " + devinfo.getDevice().toUpperCase());
			System.out.println();
			System.out.println("\tBrand : " + devinfo.getBrand() +'\n'+'\t'+ "In-built Memory :  "+devinfo.getMemory()
					+'\n'+'\t' + "OS : "+devinfo.getOs() +'\n'+'\t'+"RAM : " +devinfo.getRam()
					+'\n'+'\t'+ "Battery : "+ devinfo.getBattery());
			System.out.println();
		}
	}
}
