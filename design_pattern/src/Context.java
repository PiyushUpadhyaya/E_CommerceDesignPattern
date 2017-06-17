
public class Context {
	private PaymentMethod paymentMethod;
	public Context(PaymentMethod paymentMethod){
		this.paymentMethod = paymentMethod;		
	}
	
	public double executePaymentMethod(double amount){
		return paymentMethod.pay(amount);
		
	}
}	
