

public class nested2 {
    public static void main(String[] args) {
        double accBal=10000.0;
         int  amt=13;
         if(amt <= accBal)
         {
            if (amt%100==0)
            {
            System.out.println("withdreawl success");
            }else
            {
            System.out.println("invalid denominatio");
            }
        }else
        {
            System.out.println("insufficent balance");
        }
    }
}
