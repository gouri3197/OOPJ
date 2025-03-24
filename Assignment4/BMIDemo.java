class BMICalculator{

    double height;
	double weight;
	
	BMICalculator(double height,double weight){
	   this.height = height;
	   this.weight = weight;
	   
	 }
		 
		 public void setval(double height,double weight){
			
			this.height =height;
			this.weight = weight;
			
			
		  }
		
		    public void getval(){
				
				System.out.println("Height of person is" +height);
			    System.out.println("Weight of person is" +weight);
			 }
			
			 public void BMI(){
				
				double BMI;
				BMI = weight/(height * height);
			   System.out.println(BMI);
			  }
			 
			 
	}
	class BMIDemo{
		
		public static void main(String []args){
			
			   BMICalculator b = new BMICalculator(160,60);
			   
			    b.BMI();
		}
	}