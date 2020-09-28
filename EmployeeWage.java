package employeewage;

public class EmployeeWage{
	
		public static final int is_part_time = 1;
		public static final int is_full_time = 2;
		
		private int numOfCompany = 0;
		private CompanyEmpWage[] companyEmpWageArray;
		
		public EmployeeWage()
		{
			companyEmpWageArray = new CompanyEmpWage[5];
		}
		
		private void addCompanyEmpWage(String company, int emp_rate_hour, int no_of_working_days, int max_hr_in_month)
		{
			companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, emp_rate_hour, no_of_working_days, max_hr_in_month);
			numOfCompany++;
		}
		
		private void computeEmpWage()
		{
			for(int i = 0; i < numOfCompany; i++)
			{
				companyEmpWageArray[i].setTotalEmpWage( this.computeEmpWage ( companyEmpWageArray[i]));
				System.out.println(companyEmpWageArray[i]);
			}
		}
		
		private int computeEmpWage( CompanyEmpWage companyEmpWage)
		{
            int empHrs = 0, totalEmpHrs = 0, totalWrokingDays = 0;
			
			while(totalEmpHrs <= companyEmpWage.max_hrs_in_month && totalWrokingDays < companyEmpWage.no_of_working_days)
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
			return totalEmpHrs * companyEmpWage.emp_rate_hour;
		}
		
		public static void main(String[] args) {
			
			EmployeeWage empWageBuilder = new EmployeeWage();
			empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
			empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
			empWageBuilder.computeEmpWage();
			
		}
}
