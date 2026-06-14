package my.inherit;

public class Parent_Class {
	
	public void parentFunction() {
		System.out.println("This is parent function");
	}
	
	private void parentPrivateFunction() {
		System.out.println("This is parent private function");
		
	}
	
	protected void parentProtectedFunction() {
		System.out.println("This is protected function");
	
	}

	void parentvoidFunction() {
		System.out.println("Default function");
	}
	
	//overloading
	public void add(int i , int j ) {
		System.out.println(i+j);
	}
	
	public void add(int i , int j , int k ) {
		System.out.println(i+j+k);
	}
}
