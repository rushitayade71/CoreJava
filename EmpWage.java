public class EmpWage 
	{
	public static void main(String[] args) 
		{
		int isfullTime = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
	if (empCheck == isfullTime)
			{
			System.out.println("Employee is present");
			}
	else
			{
			System.out.println("Employee is absent");
			}
}
	}
