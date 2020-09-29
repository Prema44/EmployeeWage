package employeewage;

public class CompanyEmpWage {
	
	public final String company;
	public final int emp_rate_hour;
	public final int max_hrs_in_month;
	public final int no_of_working_days;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int emp_rate_hour, int no_of_working_days, int max_hrs_in_month)
	{
		this.company = company;
		this.emp_rate_hour = emp_rate_hour;
		this.no_of_working_days = no_of_working_days;
		this.max_hrs_in_month = max_hrs_in_month;
		totalEmpWage=0;
	}
	
	public void setTotalEmpWage ( int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
	}
	
	public String toString()
	{
		return "total Emp Wage for Company: " + company + " is " + totalEmpWage; 
	}
	
}



