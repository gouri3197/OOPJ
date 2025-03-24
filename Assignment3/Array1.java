class Array1{

   public static void main(String []args){
   
      int numbers[] = new int[]{22,33,45,55,81,7,91,39,75};

 
      int Minimum = numbers[0];
      int Maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
		
          if (numbers[i] > Maximum)
		  
           Maximum = numbers[i];
		   
         else if (numbers[i] < Minimum)
		 
           Minimum = numbers[i];
  }

            System.out.println("Maximum Number is : " + Maximum);
			
              System.out.println("Minimum Number is : " + Minimum);
 }
}


