class SOftwareEngineer
{

     SOftwareEngineer(int a, String b) 
    {
        System.out.println("Developer");
    }
    SOftwareEngineer(String b , int a)
    {
         System.out.println("Test Engineer");
    
    }
}


public class MainClass3 {
    public static void main(String[] args) {
        SOftwareEngineer sw1 = new SOftwareEngineer(10,"java");
        SOftwareEngineer sw2Engineer = new SOftwareEngineer("java",10);
    }
}
