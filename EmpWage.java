public class EmpWage {

        public static void main(String[] args) {
        double isfullTime=1;
        double ispartTime=2;
        double employeeRateperHr=20;
        double fullTimeemployeeHr=8;
        double partTimeemployeeHr=4;
        double empwage;
        double empCheck=Math.floor(Math.random() * 10) %3;

        if	(empCheck == isfullTime)
                {
                empwage=fullTimeemployeeHr*employeeRateperHr;
                System.out.println("fullTimeEmpwage:" +empwage); 
		}
        else if     (empCheck == ispartTime)
		{
                empwage=partTimeemployeeHr*employeeRateperHr;
                System.out.println("partTimeEmpwage:" +empwage );
		}
        else
                {
                System.out.println("Employee is absent" );
                }
        }
}

