
public class MathsOperations {
	
	public void add() {
		System.out.println("----Add----");
	}
	
	public void sum(int i ,int j ) {
		int k = i + j ;
		System.out.println("sum = " + k );
	}
	
	public int getNumber() {
		System.out.println("---getNumber---");
		return 101;
	}
	
    public int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }

    public static void main (String[] args) {
		MathsOperations mobj = new MathsOperations();
		
		mobj.add();
		
		int a = 10 , b = 20;
		mobj.sum(a,b);
		
		int no = mobj.getNumber();
		System.out.println("number = " + no);
		
		no = mobj.max(a, b);
		System.out.println(no);
		
	}

}
