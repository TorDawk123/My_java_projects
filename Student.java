//Torian Dawkins 09-28-2021
//class notes (methods)
//creatinging methods
/* main(____)
{ Create Variables
 Get Data
 Process data
 output
 }
*/

/*pulibx class name
 { define class variables and instance variables
   create constructors
   create get() and set() method
   other methods
  }
*/

// for constructors the main method comes later
// create instant variables
public class Student
{
 String name,address;
 private int ID;
 
 // create constructors
 //the new string are different from the ones in the parenthese
 //but soon will equal it
 public Student()
 { }
 public Student(String nm, int ID,String adr)
 {name = nm;
 this.ID = ID;
 address = adr;
 }
 
 //create get() and set() methods
 // get() methods can get data but cannot change
 public String getname()
 { return name; }
 
 public int getID()
 { return ID; }
 
 public String getaddress()
 {return address; }
 
 public void setname(String nm)
 { name = nm; }
 
 public void setID(int ID)
 { ID = ID;}
 
 public void setaddress(String adr)
 { address = adr; }
 
 //other methods
 public void print()
 { System.out.println("Name: "+name);
   System.out.println("ID: "+ID);
   System.out.println("Address "+address);
   
  }

}
 

 
 
 