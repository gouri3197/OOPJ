class Evenodd1{

 static boolean isEven (int n)
 {
	  if ((n | 1)>n)
		  return true;
	  else
		  return false;
 }
	   
 public static void main(String []args)
  {
 
     int n =10;
 	  
	     System.out.println(isEven(n)==true ? "is even" : "is odd");
  }
  
    
        
}