
public class Camera extends Expression{

	public String []Available_locs = {"Udaipur","Jaipur","Jodhpur"};
	public String result;String location = "Jaipur";
	@Override
	public String camera(String brand) {
		
		if(location == Available_locs[0])
			result = "KODAK SHOP,Shop 1,Bapu Bazar//" + '\n'+ "Camera Sellers,Shop 42,Hathi Pole // " + "Buy Camera,Shop 39,MG Road"; 
		else if(location == Available_locs[1])
			result = '\t'+"KODAK SHOP,Shop 1,Bapu Bazar, Jaipur" + '\n'+'\t'+ "Camera Sellers,Shop 42,Hathi Pole, Jaipur " + 
					'\n'+ '\t'+"Buy Camera,Shop 39,MG Road, Jaipur";
		else if(location == Available_locs[2])
			result = "Buy Camera,Shop 112,Polo Victory Tower//" + "Buy Camera,Shop 20,Jagdish Temple// " + "Buy Camera,Shop 17,Lambi Gali";
		return result;
	}

	@Override
	public String laptop(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String phone(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
