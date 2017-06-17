
public class MobileTransfer implements PaymentMethod{

	private String operator;
	private String contactNumber;
	
	public MobileTransfer(String operator, String contactNumber) {
		super();
		this.operator = operator;
		this.contactNumber = contactNumber;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	@Override
	public double pay(double amount) {
		// TODO Auto-generated method stub
		return amount;
	}

}
