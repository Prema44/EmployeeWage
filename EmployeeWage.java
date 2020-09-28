package employeewage;

public class EmployeeWage {
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	
	public static int computeEmpWage(String company, int emp_rate_hour, int no_of_working_days, int max_hrs_in_month)
	{
		int empHrs = 0, totalEmpHrs = 0, totalWrokingDays = 0;
		
		while(totalEmpHrs <= max_hrs_in_month && totalWrokingDays < no_of_working_days)
		{
			totalWrokingDays++;
			int empcheck = (int) Math.floor(Math.random() * 10) %3;
			switch (empcheck)
			{
			case is_part_time:
				empHrs = 4;
				break;
			case is_full_time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day# " + totalWrokingDays + " Emp Hour : " + empHrs);
		}
		int totalEmpWage = totalEmpHrs + emp_rate_hour;
		System.out.println(" Total Emp Wage for company : " + company + " is : " + totalEmpWage);
		return totalEmpWage;
	}
	
	public static void main(String[] args) {
		computeEmpWage("DMart", 20, 2, 10);
		computeEmpWage("Reliance", 10, 4, 20);
	}
}	
	
