import java.util.Scanner;
class Student{

       String name;
       int os;
       int oopj;
        int db;
        double total;
        double avg;
    
      void accept()
	    {
           Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter marks in Operating System: ");
        os = in.nextInt();
        System.out.print("Enter marks in OOPJ: ");
        oopj = in.nextInt();
        System.out.print("Enter marks in Database: ");
        db = in.nextInt();

        }
         

		 public void compute()
		  {
			
		     total = os + oopj + db;
			
			avg = total / 3;
			
		  }
		void display()
		  {
		    
			 System.out.println("Enter Student name=" + name);
			 System.out.println("Enter marks in Operating System=" +os);
			  System.out.println("Enter marks in OOPJ=" +oopj);
			  System.out.println("Enter marks in Database=" +db);
			 System.out.println(" Total Marks =" + total);
			 System.out.println("Enter Average=" + avg);
		  }
}
public class StudentException{


    public static void main(String []args){

       Student s = new Student();
	      s.accept();
		  s.compute();
	     s.display();
		 
		 

    }
}