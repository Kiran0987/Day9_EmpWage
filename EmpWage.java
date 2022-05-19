package com.bridge;

public class EmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;

	public static void main (String[] args) {
		int empHrs = 0; 
		int empWage = 0;

		int empCheck = (int)Math.floor(Math.random() * 10 ) % 3;

		if(empCheck == IS_FULL_TIME) {
			empHrs = 8;
			empWage = EMP_RATE_PER_HR * empHrs;
			System.out.println("Employee is present." + " Emp Full Time Wage is : " + empWage);
		}

		else if (empCheck == IS_PART_TIME) {
			empHrs = 4;
			empWage = EMP_RATE_PER_HR * empHrs;
			System.out.println("Employee is present." + " Emp Part Time Wage is : " + empWage);
		}
		else
		{
			System.out.println("Employee is Absent.");	
		}
	}
}
