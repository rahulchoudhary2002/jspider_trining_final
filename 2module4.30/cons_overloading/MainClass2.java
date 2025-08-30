class Biriyani
{  Biriyani(int a)
    {
    System.out.println("vegetable Biriyani");
    }

    public Biriyani(int a , int b) 
    {
        System.out.println("chicken Biriyani");
    }
     public Biriyani(int a , int b, int c) 
    {
        System.out.println("chicken Biriyani");
    }
    
}

public class MainClass2 {
    public static void main(String[] args) {
        Biriyani b1 =new Biriyani(14,13);
        Biriyani b2 = new Biriyani(10);
        Biriyani b3= new Biriyani(10,12,14);
    }
    
}
