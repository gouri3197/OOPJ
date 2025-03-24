class Array3 {

   public static void main(String args[]){
   
     
	   int temp, size;
	   
        int arr[] = {20, 25, 35, 45, 55, 65,76,86,96};
		
          size = arr.length;

         for(int i = 0; i<size; i++ ){
		 
         for(int j = i+1; j<size; j++){

            if(arr[i]>arr[j])
			{
			
               temp = arr[i];
			   
               arr[i] = arr[j];
			   
               arr[j] = temp;
            }
         }
      }
      System.out.println("Third second largest number is:: "+arr[size-2]);
   }
}