// import for scanner
import java.util.Scanner;

public class TestStudent

  {public static void main(String args[])
    {Student std1 = new Student("Mary", 123, "555 Broadway, DF");
     Student std2 = new Student();
     
     Scanner kb = new Scanner(System.in);
     String name, address; //need variables to read into from the keyboard
     int id;
          
     std1.print();
     std2.setname("Torian");
     std2.setID(567);
     std2.setaddress("78 main street.,Peeksill, NY 10566");
     std2.print();
     
     System.out.print("Enter a name: ");
     name = kb.next(); //one word name
     System.out.print("Enter the student ID: ");
     id = kb.nextInt();
     System.out.print("Enter the address: ");
     kb.nextLine();
     address = kb.nextLine();
     
     //create std3 objects(variables)
     Student std3 = new Student(name,id,address);
     std3.print();
     System.out.println(std3.name+"\t"+std3.getid()+ "\t"+std3.address);
    }
  }
     
