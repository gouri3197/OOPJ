class Boolean{

    public static void main(String []args)
	 {
	 
	   boolean b1 = true;
	   boolean b2 = false;
	   boolean b3 = true;
	   
	    boolean twoTrue = ( b1 && b2 && !b3) || (b1 && !b2 && b3) || (!b1 && b2 && b3);
		
		   System.out.println(twoTrue);
	}
}	