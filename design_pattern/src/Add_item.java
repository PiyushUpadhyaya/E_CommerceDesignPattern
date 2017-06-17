import java.util.Scanner;


public class Add_item {
	
	public static void second_seq(String device_ordered){
		System.out.println("***********************************************************************************************************************************************************");
		System.out.println("Selected Product is : "+device_ordered);
		String dummy=null,Company,Processor,DisplayType,OS,input_test="-";
		int Battery,RAM,HardDisk;
		System.out.println("Finding " + device_ordered + " for you.");
		System.out.println("Please enter following details  : " + '\n' + '\t' + 
				"Operating System: "+'\n' + '\t' + "RAM: " +'\n' + '\t' +"Hard Disk : " 
				+'\n' + '\t'+"Battery: " +'\n' + '\t' + "Company : "+'\n' + '\t' + 
				"Processor : " +'\n' + '\t' +"Display Type (LED/LCD)");
		System.out.println("***********************************************************************************************************************************************************");
		Scanner scan = new Scanner(System.in);
		if(input_test.equals((dummy = scan.nextLine())))
		{
			OS = null;
		}else{
			OS = dummy;
		}
		if(input_test.equals((dummy = scan.nextLine())))
		{
			RAM = 0;
		}else{
			RAM = Integer.parseInt(dummy);
		}
		if(input_test.equals(dummy = scan.nextLine()))
		{
			HardDisk = 0;
		}else{
			HardDisk = Integer.parseInt(dummy);
		}
		if(input_test.equals(dummy = scan.nextLine()))
		{
			Battery = 0;
		}else{
			Battery = Integer.parseInt(dummy);
		}
		if(input_test.equals(dummy = scan.nextLine()))
			{
				Company = null;
		}else{
				Company = dummy;
		}
		
		if(input_test.equals(dummy = scan.nextLine()))
		{
			Processor = null;
		}else{
			Processor = dummy;
		}
		if(input_test.equals(dummy = scan.nextLine()))
		{
			DisplayType = null;
		}else{
			DisplayType = dummy;
		}
		System.out.println(OS+" "+RAM+" "+HardDisk+" "+Battery+" "+Company+" "+Processor+" "+DisplayType);
		System.out.println("***********************************************************************************************************************************************************");
		System.out.println("");
		laptop_device lappy = new laptop_builder().setOs(OS).setBattery(Battery).setCompany(Company).setDisplay_type(DisplayType)
				.setHard_disk(HardDisk).setProcessor(Processor).setRam(RAM).getDevice();
		System.out.println(lappy);
		System.out.println("Want to place the order?(Yes/No)");
		switch(scan.nextLine()){
			case "Yes":
					User.third_seq(device_ordered);
					break;
			case "No" :
					System.out.println("Thanks for visiting!TATA");
					break;
			default :
				System.out.println("Please enter in the above mentioned format only!");
				
			
		}
	}
}
