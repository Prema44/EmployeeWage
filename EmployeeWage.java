package employeewage;

import java.util.ArrayList;

public class EmployeeWage implements IComputeEmpWage{
	
	public static final int full_time = 1;
	public static final int part_time = 2;
	
	private ArrayList<CompanyEmpWage> companyEmpWageList;

	public EmployeeWage() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
	}
	
	public void addCompanyEmpWage(String company,int empRate,int noOfWorkingDays,int hrsPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRate, noOfWorkingDays, hrsPerMonth);
		companyEmpWageList.add(companyEmpWage);
	}
	public void computeEmpWage() {
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			
			companyEmpWage.setTotal_EmpWage(this.computeEmpWage(companyEmpWage)); 
			System.out.println(companyEmpWage);
		}
	}
	
	public int getTotal_EmpWage(String company) {
		int totalWage = 0;
		for(int i = 0; i < companyEmpWageList.size();i++ ) {
			if(companyEmpWageList.get(i).company.equalsIgnoreCase(company)) {
				totalWage = companyEmpWageList.get(i).total_empwage;
				break;
			}
		}
		return totalWage;
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
		//variables
		
		int emp_hrs = 0;
		int total_emp_hrs = 0;
		int total_working_days = 0;
		int empWage = 0;
		ArrayList<Integer> dailyWage = new ArrayList<Integer>();
		while(total_emp_hrs < companyEmpWage.hrsPerMonth 
				&& total_working_days < companyEmpWage.noOfWorkingDays) {
			
			int empCheck = (int) Math.floor((Math.random() * 10))%3;
			switch(empCheck) {
				case full_time: emp_hrs = 8;
								total_working_days++;
						break;
				case part_time: emp_hrs = 4;
								total_working_days++;
						break;
				default: emp_hrs = 0;
						
			}
			total_emp_hrs += emp_hrs;
			System.out.println("Days : "+total_working_days+" Emp Hr : "+ emp_hrs);
			empWage = emp_hrs * companyEmpWage.empRate;
			dailyWage.add(empWage);
			}
		companyEmpWage.setDailyWage(dailyWage);
		return total_emp_hrs * companyEmpWage.empRate;
	}
	
	
	public static void main(String[] args) {
		WageComputation empWageBuilder = new WageComputation();
		empWageBuilder.addCompanyEmpWage("D-Mart",20,30,100);
		empWageBuilder.addCompanyEmpWage("Reliance",25,27,95);
		empWageBuilder.computeEmpWage();
		System.out.println("Total Employee Wage of Reliance company is : " + empWageBuilder.getTotal_EmpWage("Reliance"));
		}
}
