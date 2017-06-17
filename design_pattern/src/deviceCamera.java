import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class deviceCamera implements deviceIterator{
	ArrayList<deviceInfo> camera;
	int arrayValue = 0;
	public deviceCamera(){
		camera = new ArrayList<deviceInfo>();
		addCamera("DSLR","Android", 1, 80, 4000, "KODAK");
		addCamera("DSLR","Win", 2, 180, 3000, "Cso");
		addCamera("DSLR","Win", 2, 180, 3000, "Cso");
	}

	public void addCamera(String device,String os, int ram, int hard_disk, int battery,String company){
		deviceInfo deviceInfo = new deviceInfo(device, company, os, hard_disk, ram,battery);
		camera.add(deviceInfo);
	}
	public ArrayList<deviceInfo> getCamera(){
		return camera;
	}
	public Iterator<deviceInfo> createIterator(){
		return camera.iterator();
	}
}
