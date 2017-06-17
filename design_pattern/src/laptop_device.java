
public class laptop_device {
	private String os;
	private int ram;
	private int hard_disk;
	private int battery;
	private String company;
	private String processor;
	private String display_type;
	
	public laptop_device(String os, int ram, int hard_disk, int battery,String company, String processor, String display_type) {
		super();
		this.os = os;
		this.ram = ram;
		this.hard_disk = hard_disk;
		this.battery = battery;
		this.company = company;
		this.processor = processor;
		this.display_type = display_type;
	}

	@Override
	public String toString() {
		return "Laptop Device with desired configurations : \n\tOperating System = " + os + ", \n\tRAM = " + ram + 
				", \n\tHard Disk = "+ hard_disk + "\n\tBattery = " + battery + "\n\tCompany = " + company
				+ "\n\tProcessor = " + processor + "\n\tDisplay Type = " + display_type;
	}
		 	
}
