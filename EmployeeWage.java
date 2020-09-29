package employeewage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeWage implements IComputeEmpWage{
	
		public static final int is_part_time = 1;
		public static final int is_full_time = 2;
		
		private int numOfCompany = 0;
		
		private LinkedList<CompanyEmpWage> companyEmpWageList ;
		private Map<String , CompanyEmpWage> companyToEmpWageMap;
		
		public EmployeeWage()
		{
			companyEmpWageList = new LinkedList<>();
			companyToEmpWageMap = new HashMap<>();
			
		}
		
		public void addCompanyEmpWage(String company, int emp_rate_hour, int no_of_working_days, int max_hr_in_month)
		{
			CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, emp_rate_hour, no_of_working_days, max_hr_in_month);
			companyEmpWageList.add( companyEmpWage);
			companyToEmpWageMap.put(company, companyEmpWage);
			
		}
		
		public void computeEmpWage()
		{
			for(int i = 0; i < companyEmpWageList.size(); i++)
			{
				CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
				companyEmpWage.setTotalEmpWage( this.computeEmpWage(companyEmpWage));
				System.out.println(companyEmpWage);
			}
		}
		
		public int getTotalWage( String company)
		{
			return companyToEmpWageMap.get(company).totalEmpWage;
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
			
			IComputeEmpWage empWageBuilder = new EmployeeWage();
			empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
			empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
			empWageBuilder.computeEmpWage();
			
		}
}
