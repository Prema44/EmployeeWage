package employeewage;

public class EmployeeWage {
	public static void main(String[] args)
	{
		int is_full_time=1;
		int empcheck=(int) Math.floor(Math.random()*10)%2;
		if(empcheck==is_full_time)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("employee is absent");
		}
	}

}
