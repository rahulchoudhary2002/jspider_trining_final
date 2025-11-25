package practise.collections.questions;

import java.util.ArrayList;
import java.util.Iterator;

public class employee {

	int id;
	String name;
	int sal;
	
	public employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal=sal;

	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", age=" + sal + "]";
	}


}
