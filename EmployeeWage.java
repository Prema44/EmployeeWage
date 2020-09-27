package employeewage;

public class EmployeeWage {
	public static void main(String[] args)
	{
		int is_full_time=1;
		int is_part_time=2;
		int emp_rate_per_hour=20;
		int emp_wage=0;
		int emp_hours=0;
		int num_of_working_days=20;
		int totalempwage=0;
		int max_hrs_in_month=100;
		int total_emp_hours = 0;
		int total_working_days=0;
		while(total_emp_hours < max_hrs_in_month && total_working_days < num_of_working_days )
		{
			total_working_days++;
			int empcheck=(int) Math.floor(Math.random()*10)%3;
			switch(empcheck)
			{
			case 1:
				emp_hours=8;
				break;
			case 2:
				emp_hours=4;
				break;
			default:
				emp_hours=0;
			}
		total_emp_hours+=emp_hours;
		System.out.println("Day# "+total_working_days+" emp hours: "+emp_hours);
		}
		totalempwage=total_emp_hours*emp_rate_per_hour;
		System.out.println("Total emp wage :"+ totalempwage);
	}

}
