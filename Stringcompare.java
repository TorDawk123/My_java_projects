//declare the class
public class Stringcompare
{

 public static void main(String args[])
 {
   //variables
   String name1 = "tor";
   String name2 = "may";
   String name3 = "craig";
   
   //compare string names
   if(name1.equals(name2))
   {
    System.out.println(name1+" and "+name2+" are equal ");
   }
   
   else
   {
     System.out.println(name1+" and "+name2+" are not equal ");
   }
   
   //compare mark and mary
   if(name1.equals(name3))
   {
    System.out.println(name1+" and "+name3+" are equal ");
   }
   
   else
   {
     System.out.println(name1+" and "+name3+" are not equal ");
   }
   
   if(name2.equals(name3))
   {
    System.out.println(name2+" and "+name3+" are equal ");
   }
   
   else
   {
     System.out.println(name2+" and "+name3+" are not equal ");
   }

   
 }
 
}

   
   