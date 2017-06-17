import java.util.Scanner;


public class User {
	public static void third_seq(String device_ordered){
		//Invoker
		receiver_Seller recv = new receiver_Seller();
		
		placeOrder placeProductOrder = new placeOrder(recv);
		cancelOrder cancelProductOrder = new cancelOrder(recv);
		
		Invoker invoker = new Invoker();
		System.out.println("***********************************************************************************************************************************************************");
		System.out.println("For placing Order press 1");
		System.out.println("For cancellation press 2");
		System.out.println("***********************************************************************************************************************************************************");
		Scanner scan = new Scanner(System.in);
		switch(scan.nextInt()){
		case 1: 
			invoker.takeOrder(placeProductOrder,device_ordered);
			break;
		case 2:
			invoker.takeOrder(cancelProductOrder,device_ordered);
			break;
		default:
			System.out.println("Wrong inputs!");
		}
		invoker.placeOrders();
		System.out.println("How would you like to pay?");
	}
	
}
