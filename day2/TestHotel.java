package day2;

public class TestHotel {

	public static void main(String[] args) {
		Hotel hotel1 = new Hotel();
		hotel1.hotelName = "RJ hotel";
		hotel1.mobileNumber = 6382554731l;
		hotel1.openingTime = "9AM";
		hotel1.menu = "idly,dosa,poori,pongal,rice";
		hotel1.address = "ayanambakam,chennai";
		System.out.println("hotel1.hotelname :" + hotel1.hotelName);
		System.out.println("hotel1.menu :" + hotel1.menu);

	}

}
