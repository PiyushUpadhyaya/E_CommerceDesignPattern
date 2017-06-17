
public class Phone extends Expression{

	public String []Available_locs = {"Udaipur","Jaipur","Jodhpur"};
	public String result;
	String location = "Jodhpur";
	@Override
	public String phone(String brand) {
		
		if(location == Available_locs[0])
			result = "Buy Phone,Shop 1,Bapu Bazar//" + "Buy Phone,Shop 42,Hathi Pole // " + "Buy Phone,Shop 39,MG Road"; 
		else if(location == Available_locs[1])
			result = "Buy Phone,Shop 12,Victory Tower//" + "Buy Phone,Shop 142,Sindhi Camp// " + "Buy Phone,Shop 56,Nayapura Market";
		else if(location == Available_locs[2])
			result = '\t'+ "Buy Phone,Shop 112,Polo Victory Tower,Jodhpur" +'\n'+ '\t'+
			"Buy Phone,Shop 20,Jagdish Temple,Jodhpur" + '\n'+ '\t'+"Buy Phone,Shop 17,Lambi Gali,Jodhpur";
		return result;
	}

	@Override
	public String camera(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String laptop(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
