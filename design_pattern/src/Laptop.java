
public class Laptop extends Expression{

	public String []Available_locs = {"Udaipur","Jaipur","Jodhpur"};
	String location = "Udaipur";
	public String result;
	@Override
	public String laptop(String brand) {
		
		if(location == Available_locs[0])
			result = '\t'+ "Buy Laptop,Shop 1,Bapu Bazar,Udaipur" 
						+ '\n'+ '\t'+"Buy Laptop,Shop 42,Hathi Pole,Udaipur"
						+'\n'+ '\t'+ "Buy Laptop,Shop 39,MG Road,Udaipur"; 
		else if(location == Available_locs[1])
			result = "Buy Laptop,Shop 12,Victory Tower//" + "Buy Laptop,Shop 142,Sindhi Camp// " + "Buy Laptop,Shop 56,Nayapura Market";
		else if(location == Available_locs[2])
			result = "Buy Laptop,Shop 112,Polo Victory Tower//" + "Buy Laptop,Shop 20,Jagdish Temple// " + "Buy Laptop,Shop 17,Lambi Gali";
		return result.toString();
	}

	@Override
	public String camera(String brand) {
		
		return "cameraobj".toString();
	}

	@Override
	public String phone(String brand) {
		// TODO Auto-generated method stub
		return "phoneObjNull".toString();
	}

	

}
