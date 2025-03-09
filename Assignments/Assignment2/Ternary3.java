class Ternary3{

   public static void main(String []args){
   
       int a = 10;
	   int b = 5;
	   int c = 66;
	   int minimum;
	   
	   
	   minimum = c <(a < b? a:b)? c:((a < b)? a:b);
         System.out.println(" The munimum is " +minimum);
    }
}	