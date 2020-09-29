package employeewage;

import java.util.ArrayList;

public class CompanyEmpWage {
	
	public final String company;
	public final int empRate;
	public final int noOfWorkingDays;
	public final int hrsPerMonth;
	public int total_empwage;
	
	
	public ArrayList<Integer> dailyWage = new ArrayList<Integer>();
	
	public CompanyEmpWage(String company,int empRate,int noOfWorkingDays,int hrsPerMonth) {
		this.company = company;
		this.empRate = empRate;
		this.noOfWorkingDays = noOfWorkingDays;
		this.hrsPerMonth = hrsPerMonth;
	}
	public int setTotal_EmpWage(int totalempwage) {
		total_empwage = totalempwage;
		return total_empwage;
	}
	public void setDailyWage(ArrayList<Integer> dailyWage) {
		this.dailyWage = dailyWage;
	}
	public String toString() {
		System.out.println("Daily Wage for "+company +" company is: ");
		for(int i = 0; i < dailyWage.size(); i++ ) {
			System.out.print(dailyWage.get(i) + " ");
		}
		return "\nTotal Employee Wage for"+ company +" company is "+ total_empwage;
	}
	
}



