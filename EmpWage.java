package com.bridgelabz.employeewageprogramme;

public class EmpWage 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee wage program");
		
		int IS_FULL_TIME=1;
		int wagePerHour=20;
		int fullDayHour=8;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) 
		{
			System.out.println("Employee is present");
			System.out.println("Employee daily wage=" +fullDayHour*wagePerHour);
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}


}
