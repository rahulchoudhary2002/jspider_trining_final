class Neon
{
    Neon(int a)
    {
        System.out.println("Neon-petrol");
    }
     Neon(double d)
    {
        System.out.println("Neon-diesel");
    }
     Neon(String s)
    {
        System.out.println("Neon-electric");
    }
}




public class MainClass6 {
    public static void main(String[] args) {
       
        
            Neon n1=new Neon(15);
            System.out.println("------------------------------------------------");
            Neon n2=new Neon(4.45);
            System.out.println("------------------------------------------------");
            Neon n3= new Neon("abc");
    }
    
    
}
