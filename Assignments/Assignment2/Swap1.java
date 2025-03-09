class Swap1{

  public static void main(String []args)
    {
	  int a = 55;
	  int b= 99;
	  
	    System.out.println("Before swapping "  + a + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping "   + a  + b);
	}
}