package com.bridge;

public class EmpWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private  String company;
	private static int empRatePerHour;
	private static int numOfWorkingDays;
	private static int maxHoursPerMonth;
	private int totalEmpWage;

	public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public static void computeEmpWage() { 
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, empWage = 0;
		while (totalEmpHrs <= maxHoursPerMonth  && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
			if(totalEmpHrs>=96  && empCheck == IS_FULL_TIME) {
				System.out.println("Max working hour Reached. You can do only part time");
			}
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				empWage = empHrs * empRatePerHour ;
				System.out.println("Day : " + totalWorkingDays + " Employee is Present." +  " Emp Full Time Wage is: " + empWage + " and Working Hrs is : " + totalEmpHrs);
				break;
			case IS_PART_TIME:
				empHrs = 4;
				empWage = empHrs * empRatePerHour;
				System.out.println("Day : " + totalWorkingDays + " Employee is Present." + " Emp Part Time Wage is: " + empWage + " and Working Hrs is : " + totalEmpHrs);	
				break;
			default:
				empHrs = 0;
				System.out.println("Day : " + totalWorkingDays + " Employee is Absent." );
			}
			totalEmpHrs += empHrs;
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage: " + totalEmpWage);	 
	}

	@Override
	public String toString() {
		return "EmpWage [company=" + company + ", totalEmpWage=" + totalEmpWage  +"]";
	}
	public static void main (String[] args) {

		EmpWage reliance = new EmpWage("Reliance", 20, 20, 100);
		EmpWage jio = new EmpWage("jio", 15, 40, 200);
		EmpWage airtel = new EmpWage("Airtel", 10, 40, 200);	
		reliance.computeEmpWage();
		System.out.println(reliance);
		jio.computeEmpWage();
		System.out.println(jio);
		airtel.computeEmpWage();
		System.out.println(airtel);
	}
}