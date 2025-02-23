public class Bus {
	
  private int Bus_no;
  private boolean Ac;
  private int Capacity;//get and set
  
  Bus(int busno,boolean ac,int cap)
  {
	  Bus_no = busno;
	  Ac = ac;
	  Capacity = cap;
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
  
  public void DisplayBusinfo()
  {
	  System.out.println("------Bus Details--------");
	  System.out.println("Bus NumberP:"+Bus_no+"\n"+"AC: "+Ac+"\n"+"Bus Capacity: "+Capacity);
	  System.out.println("-------------------------");
  }
  
  

}
