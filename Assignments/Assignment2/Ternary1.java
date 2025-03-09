class Ternary1{
  
    public static void main(String []args)
	  {
	     int x = 77;
		 int y = 22;
		 int z = 10;
		 
		  int result = z > (x > y ? x : y)? z: ((x > y) ? x : y);
		  
		    System.out.println(" The Largest Number is:" +result);
		 }
		}