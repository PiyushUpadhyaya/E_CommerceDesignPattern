import java.util.List;
import java.util.ArrayList;


public class Invoker {
	public String device;
	private List<Order> orderList = new ArrayList<Order>();
	public void takeOrder(Order order,String device){
		this.device=device;
		System.out.println("************************************************");
		orderList.add(order);	
	}
	public void placeOrders(){
		for(Order order : orderList){
			order.execute(device);
		}
		orderList.clear();
	}
}
