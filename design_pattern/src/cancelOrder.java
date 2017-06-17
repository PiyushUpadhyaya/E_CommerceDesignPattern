
public class cancelOrder implements Order {

	private receiver_Seller order;
	public String device;
	
	public cancelOrder(receiver_Seller order){
		this.order = order;
	}
	@Override
	public void execute(String device) {
		order.cancel_it(device);
	}

}
