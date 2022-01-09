//import java scanner
import java.util.Scanner;

//declare my class
public class guesswordgame
{

 public static void main(String args[])
 {
 
 //variables 
 String input;
 
 Scanner kb = new Scanner(System.in);
 
 System.out.println("enter the secret word");
 input = kb.nextLine();
 
 //condition statements
   if(input.equalsIgnoreCase("SUGAR"))
   {
    System.out.println("you guessed the right word");
   }
 
   else 
   {
    System.out.println("Thats the wrong word");
   }
 }
 
}
 

 