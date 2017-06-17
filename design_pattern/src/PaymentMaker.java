import java.util.Scanner;

public class PaymentMaker {
	public static void fourth_seq(double paymentAmount) {
		System.out.println("NEED TO PAY :::: "+paymentAmount);
		Scanner scan = new Scanner(System.in);

		System.out.println("1. Card Payment");
		System.out.println("2. Mobile Transfer");
		System.out.println("***********************************************************************************************************************************************************");
		boolean checker=true;
		while(checker==true){
			int paymentChosen = Integer.parseInt(scan.nextLine());
			switch(paymentChosen){
				case 1: 
					System.out.println("Card Payment Chosen");
					System.out.println("Enter following details : ");
					System.out.println("**********************************************************************************************************************");
					System.out.println("Card Holder's Name");String card_holders_name = scan.nextLine();
					System.out.println("Card Number"); String card_number = scan.nextLine();
					System.out.println("Expiry Date: MM/YY"); String expires = scan.nextLine();
					System.out.println("Payment Amount : "+paymentAmount); 
					Context context = new Context(new CardPayment(card_holders_name, card_number, expires));
					System.out.println("Amount Transferred = " +context.executePaymentMethod(paymentAmount));
					System.out.println("**********************************************************************************************************************");
					checker = false;
					break;
				case 2:
					System.out.println("Mobile Payment Chosen");System.out.println("Enter following details : ");
					System.out.println("**********************************************************************************************************************");
					System.out.println("Mobile Operator : ");String operator = scan.nextLine();
					System.out.println("Mobile Number"); String contactNumber = scan.nextLine();
					System.out.println("Payment Amount : " +paymentAmount); 
					Context context2 = new Context(new MobileTransfer(operator, contactNumber));
					System.out.println("Amount Transferred : " +context2.executePaymentMethod(paymentAmount));
					System.out.println("**********************************************************************************************************************");
					checker = false;
					break;
			default:
					System.out.println("Please enter the above numbers only! lnvalid Choice");
					checker = true;
					break;
			}
		}
		System.out.println("**********************************************************************************************************************");
		System.out.println("**********************************************************************************************************************");
		System.out.println("We have some awesome other products too!");
		System.out.println("Want to See?(Yes/No)");
		checker=true;
		while(checker==true){
			String loop = scan.nextLine();
			switch(loop){
				case "Yes":
					Locator.main(null);
					checker = false;
					break;
				case "No" :
					System.out.println("Thanks for visiting us!");
					checker = false;
					break;
				default :
						System.out.println("Please review the choice!");
						checker = true;
						break;
			}
		}
		scan.close();
	}

}

