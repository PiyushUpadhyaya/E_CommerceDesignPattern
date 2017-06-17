
public class CardPayment implements PaymentMethod{

	private String card_holders_name;
	private String card_number;
	private String expires;
	
	public String getCard_holders_name() {
		return card_holders_name;
	}

	public String getCard_number() {
		return card_number;
	}

	public String getExpires() {
		return expires;
	}

	public CardPayment(String card_holders_name, String card_number,String expires) {
		super();
		this.card_holders_name = card_holders_name;
		this.card_number = card_number;
		this.expires = expires;
	}

	@Override
	public double pay(double amount) {
		// TODO Auto-generated method stub
		return amount;
	}

}
