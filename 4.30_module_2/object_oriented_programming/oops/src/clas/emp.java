package clas;
class Employee
{
	int eid;
	double ctc;
	void work() {
		System.out.println(eid+" is working the ctc is "+ctc);
	}
}
public class emp {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eid=101;
		e1.ctc=3734000.33;
		e1.work();
		
		Employee e2 = new Employee();
		e2.eid=102;
		e2.ctc=378373000;
		e2.work();
		
		Employee e3 = new Employee();
		e3.eid=103;
		e3.ctc=800000;
		e3.work();
	}
	

}
