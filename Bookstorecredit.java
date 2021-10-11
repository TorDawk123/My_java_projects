// Torian Dawkins notes 9-23-21
// Imports for scanning input and messagebox
// Important for creating multiple classes
import java.util.Scanner;

import javax.swing.JOptionPane;

//introduction of class
public class Bookstorecredit
{ static String name;
  static double gpa;
  
    // Creates public static void
    public static void main(String args[])
    {
    //Prompts user to put in information
    Scanner kb = new Scanner(System.in);
    
    System.out.println("Enter your name: ");
    name = kb.next();
    
    System.out.println("Enter the gpa: ");
    gpa = kb.nextDouble();
    
    message(name,gpa);
    
    }
    // this is the creation of a new class in the program
    // this also passes the values through String is place holder for letters
    //double is for the gpa in the set up-->
    public static void message(String nm, double gp)
    {
    JOptionPane.showMessageDialog(null,nm+" has "+gp+" GPA ");
    JOptionPane.showMessageDialog(null,nm+"\'s bookstore credit is $"+(10*gp));
   
    }
    
}
    