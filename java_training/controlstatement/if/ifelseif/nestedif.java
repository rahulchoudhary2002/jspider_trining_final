

public class nestedif {
    public static void main(String[] args) {
        int a=19;
        if (a%2==0)
        {
            if(a<10){
                System.out.println("pani puri");
            }else{
                System.err.println("masala puri");
            }

        }else {
            if(a<10){
                System.err.println("bhel pui");
            }else{
                System.err.println("sev puri");
            }
        }
    }
}
