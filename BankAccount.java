//torian Dawkins 
//practice problem

public class BankAccount
{
 //creates the variables
 private String name;
 private int accountnum;
 private double balance;

//this gives constructors and converts to smaller acronyms
//
public BankAccount() {}
public BankAccount(String nm, int anum, double bal)
{ 
 name = nm;
 accountnum = anum;
 balance = bal;
 
}

//get and set methods
public String getname()
{ return name; }
public void setname(String nm)
{ name = nm;}

public int getaccountnum()
{return accountnum;}
public void setaccountnum(int anum)
{ accountnum = anum;}

public double getbalance()
{ return balance;}
public void setbalance(double bal)
{ balance = bal;}

// computing money being withdrawned from your account
public void withdraw(double amount)
{ 
  balance = balance - amount;

}
// this computes the surcharge being taken out of your account at the atm
public void charge()
{
  balance = balance - 10;
}

//this computes the ampunt being deposited into your account
public void deposit(double amount)
{
 balance = balance + amount;
}


// the output for the bank account
public void print()
{
 System.out.print("The account holders name: "+name);
 System.out.print("The account number is: "+accountnum);
 System.out.print("The account balance: "+balance);
 
 }
 
}


