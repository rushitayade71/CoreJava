public class EmpWage {

        public static final int isfullTime = 1;
        public static final int ispartTime = 2;
        public static final int employeeRateperHr = 20;
        public static final int NumWorkingDays = 20;
	public static final int MaxHrInMonth = 10;

	public static int computeEmpWage (String company, int empRatePerHr, int numOfWorkingDays, int maxHrPerMonth) {
	int EmpHr=0; 
	int totalEmpHr=0; 
	int totalworkinDays=0;

        while (totalEmpHr <= MaxHrInMonth && totalworkinDays < NumWorkingDays)
                      {
		totalworkinDays++;

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
		totalEmpHr += EmpHr;
                System.out.println("Total Working days:" +totalworkinDays + "Employee Hr:" +EmpHr);
			}
	int TotalEmpWage=(totalEmpHr*employeeRateperHr);
	System.out.println("Total Employee Wage of Company:" +company + "is :" +TotalEmpWage);

	return TotalEmpWage;
	}
	public static void main(String[] args)
	{
	computeEmpWage("D-Mart", 20,2,10);
	computeEmpWage("Reliance", 10,4,20);

        }

}
