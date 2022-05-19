package com.bridge;

public class EmpWage {
	public static final int IS_FULL_TIME = 1;
	public static final int EMP_RATE_PER_HR = 20;

	public static void main (String[] args) {  
		int empHrs = 0; 
		int empWage = 0;
		int empCheck = (int)Math.floor(Math.random() * 10 ) % 2; 
		if(empCheck == IS_FULL_TIME) {	
			empHrs = 8;
			empWage = empHrs * EMP_RATE_PER_HR;
			System.out.println("Employee is Present." + " Employee Wage is : " + empWage);
		}
		else
		{
			System.out.println("Employee is Absent.");	
		}
	}
}

