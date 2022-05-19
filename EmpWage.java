package com.bridge;

public class EmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NUM_OF_WORKING_DAYS=20;

	public static void main (String[] args) {
		int empHrs = 0; 
		int totalEmpWage = 0;
		int empWage = 0;
		for (int i = 1; i <= NUM_OF_WORKING_DAYS; i++) {
			int empCheck =(int) Math.floor(Math.random() * 10 ) % 3;
			switch (empCheck){
			case IS_FULL_TIME:
				empHrs = 8;
				empWage = empHrs * EMP_RATE_PER_HR;
				System.out.println("Day : " + i + " Employee is Present." + " Emp Full Time Wage is: " + empWage);
				break;
			case IS_PART_TIME :
				empHrs = 4;
				empWage = empHrs * EMP_RATE_PER_HR;
				System.out.println("Day : " + i + " Employee is Present." + " Emp Part Time Wage is: " + empWage);
				break;
			default :
				empHrs = 0;
				System.out.println("Day : " + i + " Employee is Absent.");	
			}
			totalEmpWage += empWage;
		}	
		System.out.println("Total Emp Wage: " + totalEmpWage);	
	}
}
