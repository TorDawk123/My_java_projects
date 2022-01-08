//workshop final review 

//Bank part 1 of inheritence 

//declare the class 
public class Bank{

  //private the constructors variables
  private String banknm;
  private String phonenum;
  private String address;
  
  //constructor 1 
  public Bank(){}
  
  //constructor 2
  public Bank(String nm,String phnm, String addr)
  {
   banknm = nm;
   phonenum = phnm;
   address = addr;
   
  }
  
  //get and set method
  public String getbanknm()
  { return banknm; }
  public void setbanknm(String nm)
  { banknm = nm;}
  
  public String getphonenum()
  {return phonenum;}
  public void setphonenum(String phnm)
  { phonenum = phnm;}
  
  public String getaddress()
  {return address;}
  public void setaddress(String addr)
  {address = addr;}
  
  //the to string method
  public String toString()
  {
    return "the name:"+banknm+" and phone number:"+phonenum+"the address of this place"+address;
  }
  
}
  
  
    