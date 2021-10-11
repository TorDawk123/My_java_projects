//Torian Dawkins 09-21-2021
// notes calculating the average using the method
// Method type: ----> must also have a return statment
  /* int
     double
     string
     char 
     boolean
   */
import java.util.Scanner;

//creates class
public class Methodaverage
{    static int t1, t2, t3;
     static int ave;
        
    public static void main(String args[])
    {
    
        
    input();
    
    //processing an spitting out data
    //ave = average(t1, t2, t3);
    
    output();
    
    }
    // this formula does the operation
    public static int average(int a, int b, int c)
    { return (a+b+c)/3;}
    
    public static void input()
    { 
    //data into variables
    //scanner for input
    Scanner kb = new Scanner(System.in);
    
    System.out.println("enter the test grade: ");
    t1 = kb.nextInt();
    
    System.out.println("enter the test grade: ");
    t2 = kb.nextInt();
    
    System.out.println("enter the test grade: ");
    t3 = kb.nextInt();
    
    public static void output()
    { 
    System.out.println("Test 1="+t1+ "\tTest 2 ="+t2+"\tTest 3="+t3);
    
    System.out.println("Average = "+average(t1,t2,t3);
    
    }
    
}