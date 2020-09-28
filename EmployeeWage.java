package employeewage;

public class EmployeeWage {
	
		public static final int is_part_time = 1;
		public static final int is_full_time = 2;
		
		private final String company;
		private final int emp_rate_hour;
		private final int no_of_working_days;
		private final int max_hrs_in_month;
		private int totalEmpWage;
		
		public EmployeeWage(String company, int emp_rate_hour, int no_of_working_days, int max_hrs_in_month)
		{
			this.company=company;
			this.emp_rate_hour=emp_rate_hour;
			this.no_of_working_days = no_of_working_days;
			this.max_hrs_in_month=max_hrs_in_month;
		}
		public void computeEmpWage()
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
			int totalEmpWage = totalEmpHrs * emp_rate_hour;
			System.out.println("total emp wage for company " +  company + " is " + totalEmpWage);
		}
	

	public static void main(String[] args) {
		
		EmployeeWage dmart = new EmployeeWage("DMart", 20, 2, 10);
		EmployeeWage reliance = new EmployeeWage("Reliance", 10, 4, 20);
		dmart.computeEmpWage();
		reliance.computeEmpWage();
		
		
	}
}
