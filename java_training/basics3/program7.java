class program7{

	public static void main(String[] args){
		
		
		/*int side=6;
		int area= side*side;
		int perimeiter=4*side;
		
		System.out.println("area"+area);
		System.out.println("preimeter"+perimeiter);*/
		
		/* double price=7300.0;
		double discountpercetage=0.2;
		double totaldiscount=price*discountpercetage;
		 price=price-totaldiscount;
		System.out.println("price:"+price);
		System.out.println("totaldiscount:"+totaldiscount);*/
		
		double p=10000.0;
		int r=2;
		double t=11.5;
		double si=(p*r*t)/100;
		
		System.out.println("si of this :"+si);
		
		double totalrepayment= p+si;
		double emi=totalrepayment/(t*12);
		
		System.out.println(totalrepayment);
		System.out.println(emi);
		
		
		
	}
}