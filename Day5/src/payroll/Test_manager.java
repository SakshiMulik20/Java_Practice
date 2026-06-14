package payroll;

public class Test_manager {

    public static void main(String[] args) {

        Manager mobj = new Manager();
        mobj.assignTask();
        mobj.calcSalary();
        mobj.display();

        Manager mgr2 = new Manager(111, "anu", 20000 , 3000);
        mgr2.assignTask();
        mgr2.display();
    }

}