public class EmpWage {

        public static final int isfullTime = 1;
        public static final int ispartTime = 2;
        public static final int employeeRateperHr = 20;
        public static final int NumWorkingDays = 2;

	public static void main(String[] args) {

	int EmpHr=0; 
	int totalEmpWage=0; 

        for (int totalworkinDays = 0; totalworkinDays < NumWorkingDays; totalworkinDays++)
                      {

        	double empCheck=Math.floor(Math.random() *10) %3;
                switch ((int) empCheck)
                        {
                case isfullTime:
                        EmpHr=8;
                break;

                case ispartTime:
                        EmpHr=4;
                break;

                default:
                        EmpHr=0;
                        }
                int EmpWage=(EmpHr*employeeRateperHr);
		totalEmpWage += EmpWage;
                System.out.println("Total Salary:" +EmpWage);
			}
	System.out.println("Total Employee Wage:" +totalEmpWage);
        }

}
