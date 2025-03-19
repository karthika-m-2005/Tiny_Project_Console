import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,9));
		
		int useroption = 1;
		Scanner sc = new Scanner(System.in);
		
		for(Bus b :buses)
		{
			b.DisplayBusinfo();
		}
		
		while(useroption == 1)
		{
		    System.out.print("Enter 1 to Book or enter 2 to Exit: ");
		    useroption =  sc.nextInt();
		    if(useroption == 1)
		    {
		    	Booking booking = new Booking();
		    	if(booking.isAvailable(bookings,buses))
		    	{
		    		bookings.add(booking);
		    		System.out.println("Your Booking is Confirmed");
		    	}
		    	else
		    		System.out.println("Sorry! Bus is Full.Try Another Bus or Date ");
		    }
		}
		
		
		

	}

}
