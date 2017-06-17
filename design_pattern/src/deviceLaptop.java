import java.util.ArrayList;
import java.util.Iterator;


public class deviceLaptop implements deviceIterator{
	ArrayList<deviceInfo> lappy;
	
	public deviceLaptop(){
		lappy = new ArrayList<deviceInfo>();
		addLaptop("laptop","Windows", 8, 500, 8000, "lenovo");
	}

	public void addLaptop(String device,String os, int ram, int hard_disk, int battery,String company){
		deviceInfo deviceInfo = new deviceInfo(device, company, os, hard_disk, ram,battery);
		lappy.add(deviceInfo);
	}
	public ArrayList<deviceInfo> getLappy(){
		return lappy;
	}
	public Iterator<deviceInfo> createIterator(){
		return lappy.iterator();
	}
}
