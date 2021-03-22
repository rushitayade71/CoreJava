public class EmpWage {

	public static void main(String[] args) {
	double isfullTime=1;
	double employeeRateperHr=20;
	double employeeHr=8;
	double Dailyemployeewage;
	double empwage;
	double empCheck=Math.floor(Math.random() * 10) %2;

	if (empCheck == isfullTime)
		{
        	empwage=employeeHr*employeeRateperHr;
                System.out.println("Dailyemployeewage:" +empwage);
		}
	else
		{
                  System.out.println("Dailyemployeewage:" +0);
		}
        }
}

