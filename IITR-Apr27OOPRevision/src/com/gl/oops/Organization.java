package com.gl.oops;

import java.util.Iterator;
import java.util.LinkedList;

public class Organization {

	LinkedList <Employee> employeeLL = new LinkedList<Employee>();
	public void addEmployee(Employee employee)
	{
		employeeLL.addFirst(employee);
	}
	public void removeEmployee(Employee employee)
	{
		Iterator <Employee> empIter = employeeLL.iterator();
		int index=0;
		while(empIter.hasNext())
		{
			Employee employ  = empIter.next();
			if(employ.getEmpId().equals(employee.getEmpId()))
			{
				index = employeeLL.indexOf(employ);
						break;
			}
		}
		employeeLL.remove(index);
	}
	public void viewEmployees()
	{
		Iterator <Employee> empIter = employeeLL.iterator();
		while(empIter.hasNext())
		{
			Employee e = empIter.next();
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organization organization = new Organization();
		organization.addEmployee(new Employee("E001","Kiran",1000,"Bangalore"));
		organization.addEmployee(new Employee("E002","Rajesh",3000,"Mangalore"));
		organization.addEmployee(new Employee("E003","Suman",2000,"Chennai"));
		organization.addEmployee(new Employee("E004","Mohan",4000,"Mumbai"));
		
		organization.viewEmployees();
		
		organization.removeEmployee(new Employee("E003","Suman",2000,"Chennai"));
		organization.viewEmployees();
		
	}

}
