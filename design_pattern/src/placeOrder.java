
public class placeOrder implements Order{

	private receiver_Seller order;
	public String device;
	public String device_id;
	public String brand;
	public String amount;
	public String order_id;
	
	public placeOrder(receiver_Seller order){
		this.order = order;
	}
	@Override
	public void execute(String device) {
		if(device.equals("Laptop"))
			order.place_it("Laptop","ATG300","Lenovo",49000,"ABCD123456");
		else if(device.equals("Camera"))
			order.place_it("Camera","KDK321","Kodak",33000,"BCDF0987");
		else if(device.equals("Phone"))
			order.place_it("Phone","ZXKLM123","ASUS",15000,"GHJF5678");
		
	}

}
