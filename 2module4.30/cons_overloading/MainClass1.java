class city
{
    city(int a)
    {
        System.out.println("new york");
    }
    city(double d)
    {
         System.out.println("London");
    }
    city(String s)
    {
        System.out.println("paris");
    }
}
public class MainClass1{
    public static void main(String[] args) {
        city c1=new city("abc");
        city c2=new city(5.5);
        city c3=new city(3);

    }
}