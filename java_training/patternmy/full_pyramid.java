class full_pyramid{
	public static void main(String[] args){
		int n=5;
		
		/*
		                       
							       *
                                  **
                                 ***
                                ****
                               *****
							   
							   then we should space before and after * then we can print like this pattern
     *
    *  *
   *  *  *
  *  *  *  *
 *  *  *  *  *					   
							   
		*/					   
							   
		for(int i=0;i<5;i++){
			  for (int j=0;j<5-i-1; j=j+1)
			  {
				System.out.print(" ");
			   }
				//stars 
				for (int j=0;j<i+1; j=j+1){
					
					System.out.print("*");
				}
				
			System.out.println("");
			
		}
	}
}