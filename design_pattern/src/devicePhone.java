import java.util.Hashtable;
import java.util.Iterator;


public class devicePhone implements deviceIterator{
	Hashtable<Integer, deviceInfo> phone = new Hashtable<Integer,deviceInfo>();
	int hashKey=0;
	
	public devicePhone(){
		addPhone("phone","Android", 3, 64, 3100, "HTC");
	}

	public void addPhone(String device,String os, int ram, int hard_disk, int battery,String company){
		deviceInfo deviceInfo = new deviceInfo(device, company, os, hard_disk, ram,battery);
		phone.put(hashKey,deviceInfo);
		hashKey++;
	}
	public Hashtable<Integer,deviceInfo> getPhone(){
		return phone;
	}
	public Iterator<deviceInfo> createIterator(){
		return phone.values().iterator();
	}
}
