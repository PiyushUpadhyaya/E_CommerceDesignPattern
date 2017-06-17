// lenovo laptop in udaipur
public class SearcherFunction {
	private String input_expression;
	private String device;
	private String brand;
	private String location;
	String[] words_of_expression;
	
	public SearcherFunction(String expression){
		this.input_expression = expression;
		words_of_expression = getInput().split(" ");
		brand = getFirstCharacterCapital(words_of_expression[0]);//Lenovo
		device = getFirstCharacterCapital(words_of_expression[1]);//Laptop
		location= getFirstCharacterCapital(words_of_expression[3]);//Udaipur
	}

	public String getFirstCharacterCapital(String input) {
		input = input.toLowerCase();
		input = Character.toUpperCase(input.charAt(0))+input.substring(1);
		return input;
	}
	public String getBrand(){
		return brand;
	}
	public String getDevice(){
		return device;
	}
	public String getLocation(){
		return location;
	}
	public String getInput() {
		return input_expression;
	}

}
