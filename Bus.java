public class Bus {
	
  private int Bus_no;
  private boolean Ac;
  private int Capacity;//get and set
  private int Booking_Number;
  
  Bus(int busno,boolean ac,int cap,int b_no)
  {
	  Bus_no = busno;
	  Ac = ac;
	  Capacity = cap;
	  Booking_Number = b_no;
  }
  
  public int getCapcity() //acccessor method
  {
	  return Capacity;
  }
  
  public void setCapacity(int cap)//mutator
  {
	  Capacity = cap;
  }
  
  public boolean getAc()
  {
	  return Ac;
  }
  public void setAc(boolean ac)
  {
	  Ac = ac;
  }
  
  public int getBus_no()
  {
	  return Bus_no;
	  
  }
 public int getBooking_Number()
	{
		return Booking_Number;
	}
 public void setBus_no()
	{
		 Bus_no = busno;
	}
 public int Booking_Number()
	{
		Booking_Number= b_no;
	}
		
  
  public void DisplayBusinfo()
  {
	  System.out.println("------Bus Details--------");
	  System.out.println("Bus NumberP:"+Bus_no+"\n"+"AC: "+Ac+"\n"+"Bus Capacity: "+Capacity+"\n"+"Booking Number"+Booking_Number);
	  System.out.println("-------------------------");
  }
  
  

}
