class ElectricityBill{

  String CustomerName;
  double unitsConsumed;
  double billAmount=0;
  
  ElectricityBill(){
  
    this.CustomerName = CustomerName;
	this.unitsConsumed = unitsConsumed;
	
	}
	
	  
	}
	
class BillDemo{
public static void main(String []args){
	void calculateBillAmount(){
	 
	     if(unitsConsumed>=300){
			billAmount = 1900 + ((unitsConsumed-300)*10);
		} else if(unitsConsumed<300 && unitsConsumed>100){
			billAmount = 500 + ((unitsConsumed-100)*7);
		} else {
			billAmount = unitsConsumed*5;
		}
	
	}
       String Name = "Gouri";
	   
	   double d = 420;
	   
	   ElectricityBill eb = new ElectricityBill();
	   eb.calculateBillAmount();
	   double billAmount = calculateBillAmount();
	
	   
	   System.out.println("Customer Name:" +Name+ ", Units Consumed:" + d +", Bill:" + billAmount);
	   
	   }
}
