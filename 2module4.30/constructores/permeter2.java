class Employee
{
    int eid;
    double ctc;

    public Employee(int i, double d) {
        eid=i;
        ctc=d;
    }
    
}

public class permeter2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,4.5);
        System.out.println("eid" +e1.eid);
        System.out.println("ctc" +e1.ctc);

        Employee e2 = new Employee(102,5.5);
        System.out.println("eid" +e2.eid);
        System.out.println("ctc" +e2.ctc);

        Employee e3 = new Employee(103,9.5);
        System.out.println("eid" +e3.eid);
         System.out.println("ctc" +e3.ctc);  
    }

}
