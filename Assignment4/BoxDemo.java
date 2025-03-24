class Box{

    int height;
	int width;
	int breadth;
	double volume;
	double area;
	
	Box(){
	
	  }
	  
	Box(int height, int width, int breadth){
	  this.height = height;
	  this.width = width;
	  this.breadth = breadth;
	  }
	  
	  double getVolume(){
	  
	     double volume = height * width * breadth;
		 
		 return volume;
		 }
		 
	  double getArea(){
	  
	    double area = 2 * ((width * breadth)+ (breadth * height) + (height * width));
           
		    return area;
		}
		
		void display(){
		
		  System.out.println("Volume of Box:" +getVolume());
		  System.out.println("Area of Box:" +getArea());
		 }

}		 
public class BoxDemo{

    public static void main(String []args){
	
	  Box b1 = new Box( 10, 20 ,5);
	     b1.display();
	  Box b2 = new Box(5, 7, 3);
	     b2.display();
	  }
}