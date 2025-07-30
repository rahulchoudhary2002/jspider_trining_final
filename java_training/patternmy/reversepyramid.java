class reversepyramid{
	public static void main(String[] args){
		
		/*
		* * * *
         * * *
          * *
           *
		            */
					//this is reversepyramid example

		
		for(int i=0;i<4;i++){
			
			for (int j=0; j<i; j=j+1){
				System.out.print(" ");
			}
		
			
		
			for (int j=0; j<4-i;j++){
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		
	}
	
	
	
}