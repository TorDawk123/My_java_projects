// Notes 9-21-2021
public class increment
{
     public static void main(String args[])
     {
     
     int x=10, y=11, z, a;
     
     z = x++; //post increment, return x value first and then increments
     System.out.println("pre-x: z="+z);
     System.out.println("post-x: x= "+x);
     
     a = ++x; //post increment, return x value first and then increments
     System.out.println("pre-x: z="+a);
     System.out.println("post-x: x= "+x);
     
     }
     
}