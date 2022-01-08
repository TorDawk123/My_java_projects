// scanner for the Bank account program
// import for the programm
import java.util.Scanner;

//declare the class version
public class BankAccountApp
{

 public static void main(String args[])
 {
  // brings in the variables the acronyms version
  String nm;
  int anum;
  double bal;
  
  Scanner kb = new Scanner(System.in);
  
  System.out.println("what is the account holders name: ");
  nm = kb.next();
  
  System.out.println("what is the account number: ");
  anum = kb.nextInt();
  
  System.out.println("What is the Balance: ");
  bal = kb.nextDouble();
  
  BankAccount b1 = new BankAccount(nm,anum,bal);
  
  }
  
}
  
