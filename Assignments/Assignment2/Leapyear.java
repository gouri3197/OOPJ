import java.util.Scanner;
  class Leapyear{
  
     public static void main(String []args)
	   {
	   
	     int year;
		 
		   System.out.println("Enter a year :");
		   
		     Scanner sc = new Scanner(System.in);
			 
			   year = sc.nextInt();
			   
			     if (((year %4 == 0) && (year %100! = 0)) || (year %400 ==0))
				   
				     System.out.println(" Year is a leap year");
					 
				 else
				  
				      System.out.println(" year is not a leap year");
				}
}				