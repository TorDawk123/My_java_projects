//Torian Dawkins 

public class Lease
{
  String tenant;
  int apartmentnm;
  double rentam;
  int LeaseM;
  
  //create constructors
  public Lease(String tenant, int apartmentnm,double rentam,int LeaseM)
  {tenant = "XXX";
   apartmentnm = 0;
   rentam = 1000;
   LeaseM = 12;
   
   }
   
   // create get()
   public String gettenant()
   { return tenant; }
   public int getapartmentnm()
   {return apartmentnm; }
   public double getrentam()
   {return rentam; }
   public int getLeaseM()
   {return LeaseM;}
   
   //create set methods
   public void setrentam(double rent)
   { rentam = rent; }
   
   public void setapartmentnm(int nm)
   {apartmentnm = nm; }
   
   public void settenant(String name)
   { tenant = name; }
   
   public void setLeaseM(int LM)
   {LeaseM = LM;}
   
   //Other Methods this adds pets to the fee amount 
   public void addPetfee()
   { rentam = rentam + 10; 
    explainpetpolicy();
   }
   
   //explains the pet policy
   public static void explainpetpolicy()
   { System.out.println("If you want to have a pet it cost an extra 10 dollars with your rent. "); }
   
   // display th program
   public void print()
   
  { System.out.println("Tenant Name: " + tenant);
    System.out.println("Tenant apt number: " + apartmentnm);
    System.out.println("Tenant rent: " + rentam);
    System.out.println("Tenant Lease time: "+ LeaseM);
   
   }
}

  
  