class Iphone
{
    Iphone(int a)
    {
        System.out.println("Iphone");
    }
     Iphone(double d)
    {
        System.out.println("Iphone-pro");
    }
     Iphone(String s)
    {
        System.out.println("Iphone-pro-max");
    }
}




public class Mainclass7{
    public static void main(String[] args) {
       
        
            Iphone n1=new Iphone(15);
            System.out.println("------------------------------------------------");
            Iphone n2=new Iphone(4.45);
            System.out.println("------------------------------------------------");
            Iphone n3= new Iphone("abc");
            System.out.println("------------------------------------------------");
    }
    
    
}

