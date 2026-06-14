package mit.code.tester;

import mit.code.payroll.*;

public class Tester_employee {
	public static void main(String[] args) {
		
		Manager m = new Manager("sakshi" , "Sakshi@gmail.com" , 20000 , 10000 , "CSE");
		m.Calc_salary();
		System.out.println(m);

	}

}
