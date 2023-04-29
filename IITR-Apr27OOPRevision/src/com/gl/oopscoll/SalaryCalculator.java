package com.gl.oopscoll;

public class SalaryCalculator {

	public double calculateSalary(double basic,double hra,double cca ,double allowances)
	{
		double grossSalary = basic + hra + cca + allowances;
		return grossSalary;
	}
	public double calculateSalary(double basic,double hra,double cca ,double allowances,double deductions)
	{
		double nettSalary = (basic + hra + cca + allowances) - deductions;
		return nettSalary;
	}
	public double calculateSalary(double gross,double deductions)
	{
		double nettSalary =  (gross - deductions);
		return nettSalary;
	}
	/*public void calculateSalary(double gross,double deductions)
	{
		double nettSalary =  (gross - deductions);
		return nettSalary;
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalaryCalculator sCal = new SalaryCalculator();
		double grossSalary1 = sCal.calculateSalary(1000, 200, 200, 250); // BINDING
		System.out.println("The Gross Salary "+grossSalary1);
		
		double nettSalary = sCal.calculateSalary(1000, 250, 250, 245, 345);
		System.out.println("The Nett Salary is "+nettSalary);
		
		double nettSalary1 = sCal.calculateSalary(grossSalary1, 350);
		System.out.println("The Nett Salary is "+nettSalary1);

	}

}
