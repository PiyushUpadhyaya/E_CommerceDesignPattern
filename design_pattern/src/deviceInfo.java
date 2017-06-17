
public class deviceInfo {
	String device;
	String brand;
	String os;
	int memory;
	int ram;
	int battery;
	
	public deviceInfo(String newDevice, String newBrand, String newOS, int newMemory, int newRam, int newBattery){
		device = newDevice;
		brand = newBrand;
		os = newOS;
		memory = newMemory;
		ram = newRam;
		battery = newBattery;
	}
	
	public String getOs() {
		return os;
	}

	public int getMemory() {
		return memory;
	}

	public int getRam() {
		return ram;
	}

	public String getDevice(){
		return device;
	}
	public int getBattery() {
		return battery;
	}

	public String getBrand(){
		return brand;
	}
}
