
public class laptop_builder {
	private String os;
	private int ram;
	private int hard_disk;
	private int battery;
	private String company;
	private String processor;
	private String display_type;
	
	public laptop_builder setOs(String os) {
		this.os = os;
		return this;
	}
	public laptop_builder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public laptop_builder setHard_disk(int hard_disk) {
		this.hard_disk = hard_disk;
		return this;
	}
	public laptop_builder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public laptop_builder setCompany(String company) {
		this.company = company;
		return this;
	}
	public laptop_builder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public laptop_builder setDisplay_type(String display_type) {
		this.display_type = display_type;
		return this;
	}
	public laptop_device getDevice(){
		return new laptop_device(os, ram, hard_disk, battery, company, processor, display_type);
	}
}
