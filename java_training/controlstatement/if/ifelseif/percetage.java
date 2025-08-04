

public class percetage {
    public static void main(String[] args) {
        double per=100;
        if (per>=85 ){
            System.out.println("distention");
        }else if (per>=70 && per<85)
        {
             System.out.println("first");
            }
            else if (per>=60 && per<70)
        {
             System.out.println("scond");
            }else if(per>=35 && per<60){
                System.out.println("pass");

            }else{
                System.out.println("fail");
            }
    }
}
