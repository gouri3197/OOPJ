class Arithmeticbitwise{

 public static void main(String args[])
 {
     int a = 22;
	 
	   if(a<0)
	     {
		   a= -a;
		  }
		  
		  while(a>3)
		   {
		     a= (a&3) + (a>>2);
		 }
		
		if(a==0 || a==3)
		   
		     System.out.println(" Number is divisible by 3");
		else
		 
		      System.out.println("Number is not divisible by 3");
      }
}	  