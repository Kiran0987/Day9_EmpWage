package com.bridge;

public class EmpWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

	public static void main (String[] args) {
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int empWage = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
			if(totalEmpHrs>=96  && empCheck == IS_FULL_TIME) {
				System.out.println("Max working hour Reached. You can do only part time");
			}
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				empWage = empHrs * EMP_RATE_PER_HR;
				System.out.println("Day : " + totalWorkingDays + " Employee is Present." +  " Emp Full Time Wage is: " + empWage + " and Working Hrs is : " + totalEmpHrs);
				break;
			case IS_PART_TIME:
				empHrs = 4;
				empWage = empHrs * EMP_RATE_PER_HR;
				System.out.println("Day : " + totalWorkingDays + " Employee is Present." + " Emp Part Time Wage is: " + empWage + " and Working Hrs is : " + totalEmpHrs);	
				break;
			default:
				empHrs = 0;
				System.out.println("Day : " + totalWorkingDays + " Employee is Absent." );

			}
			totalEmpHrs += empHrs;
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
		System.out.println("Total Emp Wage: " + totalEmpWage);	 
	}
}