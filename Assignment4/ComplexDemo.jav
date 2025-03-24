class Complex{
	 double real;
	 double imaginary;
	
	Complex(){
		this.real = 0;
		this.imaginary = 0;
	}
	
	Complex(double real){
		this.real = real;
		this.imaginary = 0;
	}
	
	Complex(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	Complex add(Complex other){
		double newreal = this.real + other.real;
		double newimaginary = this.imaginary + other.imaginary;
		return new Complex(newreal, newimaginary);
	}
	
	Complex multiply(Complex other){
		double newreal = (this.real * other.real) - (this.imaginary * other.imaginary);
		double newimaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
		return new Complex(newreal, newimaginary);
	}
	
	void display(){
		System.out.println(this.real + " " + (this.imaginary >= 0 ? "+" : "-") + " " + this.imaginary + "i");
	}
}

class ComplexDemo{

  public static void main(String []args){
  
    Complex c1 = new Complex(5, 7.2);
	Complex c2 = new Complex(-3, 6.66);
	
	 Complex sum = c1.add(c2);
	 Complex product = c1.multiply(c2);
	 
	 sum.display();
	 product.display();
	 }
}