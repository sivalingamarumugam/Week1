package week1.day1.clasroom;

public class MobilePhone {
	
	String mobileBrand = "Iphone 8 plus";
	int totalContacts = 200;
	long imeiNumber = 834534534543L;
	double mobilePrice = 50000.45;
	
	public static void main(String[] args) {
		MobilePhone options = new MobilePhone();
		options.makeCall();
		options.sendMessage();
		options.takePicture();
		String brandName = options.mobileBrand;
		int noOfContacts = options.totalContacts;
		long mobileImei= options.imeiNumber;
		double price = options.mobilePrice;
		System.out.println("Brand Name:"+brandName);
		System.out.println("Total Contacts:"+noOfContacts);
		System.out.println("Mobile IMEI:"+mobileImei);
		System.out.println("Mobile Price:"+price);
	}
	
public void makeCall()
{
	System.out.println("makeCall");
}

 public void takePicture() {
	System.out.println("takePicture");
}

 public void sendMessage() 
 {
	System.out.println("sendMeassge");
}
}
