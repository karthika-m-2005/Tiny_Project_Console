import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String PassengerName;
	int bus_no;
	Date date;
	
	Booking()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Passenger Name: ");
		PassengerName = sc.nextLine();
		System.out.print("Enter the Bus Number: ");
		bus_no = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Date dd-mm-yyyy");
		String dateinput = sc.nextLine();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date  =  dateformat.parse(dateinput);
		} catch (ParseException e) {
			
			System.out.println("Invalid Dtae Format.Please Enter date in dd-mm-yyy.");
			e.printStackTrace();
		}
	
		
		
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
	{
		int Capacity = 0;
		for(Bus b :buses)
		{
			if(b.getBus_no() == bus_no)
			{
				Capacity = b.getCapcity();
			}
		}
		int booked = 0;
		for(Booking b : bookings)
		{
			if(b.bus_no == bus_no && b.date.equals(date))
			{
				booked++;
			}
		}
		
		return booked<Capacity?true:false;
	}
	




}
