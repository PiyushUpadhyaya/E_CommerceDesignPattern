
public class receiver_Seller {
	public String device;
	public String device_id;
	public String brand;
	public double amount;
	public String order;
	public void place_it(String device,String device_id,String brand,int amount,String order_id){
		System.out.println("Your order placed! Details mentioned below ");
		System.out.println("Device: "+ device+ " Device id : " + device_id + " Brand : " + brand+ " Amounting to : " + amount
				+ " Order-id : " +order_id);
		System.out.println("***********************************************************************************************************************************************************");
		PaymentMaker.fourth_seq(amount);
	}
	public void cancel_it(String order){
		System.out.println("Your *** " + order + "*** order has been "+"cancelled");
		amount = 125.0;
		System.out.println("You'll have to pay a cancellation charge of " +amount);
		System.out.println("***********************************************************************************************************************************************************");
		PaymentMaker.fourth_seq(amount);
	}
	
}
