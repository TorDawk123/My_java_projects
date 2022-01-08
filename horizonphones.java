//torian ch5 workshop class problem 

// import the scanner
import java.util.Scanner;

//declare the class name
public class horizonphones
{

  public static void main(String arg[])
  { double plan;
    int text;
    double minutes;
    double data;
    
    Scanner kb = new Scanner(System.in);
    
    //input
    System.out.println("How many minutes do you need: ");
    minutes = kb.nextDouble();
    
    System.out.println("How many text do you need to send: ");
    text = kb.nextInt();
    
    System.out.println("How much data do you need: ");
    data = kb.nextDouble();
    
    if(minutes <= 500 && text == 0 && data == 0)
    { 
     System.out.println("You should get the $49 monthly plan A");
    }
    
    else if(minutes <= 500 && text>=1 && data == 0)
    {
     System.out.println("You should get the $55 monthly plan");
    }
    
    else if(minutes >=500 && data==0 && text <=100)
    {
    System.out.println("You should get the monthly plan for $61");
    }
    
    else if (text >= 100 && minutes==0 && data==0)
    {
     System.out.println("You should get plan D for $70");
    }
    
    else if(data<=3)
    {
     System.out.println("You should get plan E for $79");
    }
    
    else if(data>=3)
    {
     System.out.println("You should get the F plan for $87");
    }
    
   }
}
    
    
  
  
    