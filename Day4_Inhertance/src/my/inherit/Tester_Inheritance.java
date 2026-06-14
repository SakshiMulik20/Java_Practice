package my.inherit;

public class Tester_Inheritance {
	
	public static void main(String[] args) {
		
		Parent_Class pobj = new Parent_Class();
		pobj.parentFunction();
		pobj.parentProtectedFunction();
		pobj.parentvoidFunction();
		
		//overloading concept
		pobj.add(20, 10);
		pobj.add(1, 2, 3);
		
		Child_Class cobj= new Child_Class();
		cobj.childFunctionz();
		cobj.parentFunction();
		cobj.parentProtectedFunction();
		cobj.parentvoidFunction();
		
	}

}
