package employeewage;

public class EmployeeWage {
	public static void main(String[] args)
	{
		int is_full_time=1;
		int is_part_time=2;
		int emp_rate_per_hour=20;
		int emp_wage=0;
		int emp_hours=0;
		int empcheck=(int) Math.floor(Math.random()*10)%3;
		if(empcheck==is_full_time || empcheck==is_part_time)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("employee is absent");
		}
		if(empcheck==is_full_time)
		{
			emp_hours=8;
		}
		else if (empcheck==is_part_time)
		{
			emp_hours=4;
		}
		
		emp_wage=emp_hours*emp_rate_per_hour;
		System.out.println("Emp Wage: "+emp_wage);
	}

}
