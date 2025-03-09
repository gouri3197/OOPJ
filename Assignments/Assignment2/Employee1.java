class Employeedemo{

         private int empId;
		 private string empName;
		 private string empAddress;
		 private int empPhoneNO;
		 private int empSalary;
		 
		   
		   void set(int id, string name, string address, int phoneno, int salary)
		      {
			    empId = id;
				empName = name;
				empAddress = address;
				empPhoneNo = phoneno;
				empSalary= salary;
			 }
			 
			 void show()
			  {
			    System.out.println(empid+" "+empName+" "+empAddress+" "+empPhoneNo+" "+empSalary+");
			  }
        }

class Employee1{

      public static void main(String []args)
       {
      
         Employeedemo e1 = new Employeedemo();
             e1.set(101, "Gouri", "Pune", 9920129956,		 