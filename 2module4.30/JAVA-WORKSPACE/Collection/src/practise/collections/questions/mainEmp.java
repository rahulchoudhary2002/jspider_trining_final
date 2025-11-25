package practise.collections.questions;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEmp {
	public static void main(String[] args) {

		ArrayList<employee> al = new ArrayList<employee>();
		al.add(new employee(1, "Priya", 1043));
		al.add(new employee(2, "riya", 9004));
		al.add(new employee(3, "Rahul", 15000));

		Iterator i = al.iterator();
		
//		while (i.hasNext()) {
//			employee e = (employee) i.next();
//			if (e.sal > 4000) {
//				System.out.println(e);
//			}
//
//		}
		while (i.hasNext()) {
			employee e = (employee) i.next();
			if (e.id== 1) {
				i.remove();
				System.out.println(e);
			}
//			System.out.println(al);

		}
		
		
		
		
		

	}
}