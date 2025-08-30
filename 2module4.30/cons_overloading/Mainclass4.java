class Amazon
{

     Amazon() 
    {
        System.out.println("Shopping");
    }
    Amazon(double price)
    {
        System.out.println("Shoping");
        System.out.println("Music");
        System.out.println("Prime Video");
    }
    
}

public class Mainclass4{
    public static void main(String[] args) {
        
        Amazon a1= new Amazon();
        System.out.println("----------------------------------");
        Amazon a2= new Amazon(1499.0);
    }
    
}
