import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Locator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("***********************************************************************************************************************************************************");
		System.out.println("Enter the query as : brandname product near location (Udaipur,Jaipur,Jodhpur)");//lenovo laptop near udaipur
		String search_query = scan.nextLine();
		SearcherFunction query = new SearcherFunction(search_query);
		String device = query.getDevice();
		String location = query.getLocation();
		
		if((location.equals("Udaipur") || location.equals("Jaipur") || location.equals("Jodhpur"))
				&& (device.equals("Laptop") || device.equals("Phone") || device.equals("Camera"))){
		String brand = query.getBrand();
		System.out.println("You searched for :: "+ brand + " "+device + " near " + location + " ");
		System.out.println("***********************************************************************************************************************************************************");
		String device_param_to_send = device.toLowerCase();
		try {
			Class<?> tempClass = Class.forName(device);
			Object deviceSearch = tempClass.getConstructor().newInstance();
			@SuppressWarnings("rawtypes")
			Class[] methodParams = new Class[]{String.class};
			Method locatingMethod = tempClass.getMethod(device_param_to_send, methodParams);
			Object [] par  = new Object[]{new String(location)};
			String result = (String) locatingMethod.invoke(deviceSearch, par);
			System.out.println();System.out.println("Available Stores are :: ");System.out.println(result);
			System.out.println("***********************************************************************************************************************************************************");
			switch(device){
				case "Laptop" :
					System.out.println();System.out.println("Store of Udaipur Selected!");
					break;
				case "Camera" :
					System.out.println();System.out.println("Store of Jaipur Selected!");
					break;
				case "Phone" :
					System.out.println();System.out.println("Store of Jodhpur Selected!");
					break;
				default : 
					System.out.println("No availability of device and location! ");
					break;
			}
			System.out.println("***********************************************************************************************************************************************************");
			System.out.println("Shall we show you the devices at the stores of :: "+location + "? Press 1");
			scan.nextLine();
			System.out.println("***********************************************************************************************************************************************************");
			storeProviding.first_seq(location,device);
		} catch (ClassNotFoundException  | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan.close();
	 }else{
		System.out.println("We have not expanded to " +location+ " for mentioned product "+device);
		System.out.println("Working Cities: Udaipur, Jaipur and Jodhpur");
		System.out.println("Selling Laptop, Phone and Camera");
		Locator.main(null);
	}
	}
}
