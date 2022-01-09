//declare the clas
public class stringcompareto
{

 public static void main(String args[])
 {
 //variables in string
 String name1 = "mary";
 String name2 = "mark";
 
 //comparison for mark and mary
   if(name1.compareTo(name2) < 0)
   {
     System.out.println(name1+" is less than "+name2);
   }
 
   else if(name1.compareTo(name2) == 0)
   {
     System.out.println(name1 + "is equal to "+ name2);
   }
 
   else
   {
    System.out.println(name1 + " is greater than "+ name2);
   }
   
  }
 
}
