package com.htc.coreexercise.beginers;

public class EmployeeSalary {

	public static void main(String[] args) {

		int totalBasicSalary=0;
		int totalDa=0;
		int totalHra=0;
		
		Employee[] emp = new Employee[5]; // emp is an array of object Employee size 5
		emp[0]= new Employee("Sumesh", "HR", 1500, 700, 300); // instantiating the object which will trigger the overloaded constructor of the Employee class
		emp[1]= new Employee("Manesh", "Training", 2000, 300, 200);
		emp[2]= new Employee("Sathish", "Projects", 8000, 100, 100);
		emp[3]= new Employee("Ramesh", "RM", 4000, 400, 300);
		emp[4]= new Employee("Umesh", "Admin", 5000, 120, 600);
		
		for(int i=0;i<5;i++) {
		totalBasicSalary=totalBasicSalary+emp[i].getEmpBasicSal();
		totalDa=totalDa+emp[i].getEmpDa();
		totalHra = totalHra+emp[i].getEmpHra();
		System.out.println("The total Salary of " + emp[i].getEmpName() +" working in the "+ emp[i].getEmpDepartment()+ " department is " + (emp[i].getEmpBasicSal()+emp[i].getEmpDa()+emp[i].getEmpHra()));
		}
		
		System.out.println("==================================================================");
		System.out.println("Average Basic Salary of Employees = " + (totalBasicSalary/5));
		System.out.println("Average DA of Employees = " + (totalDa/5));
		System.out.println("Average HRA of Employees = " + (totalHra/5));
		System.out.println("==================================================================");
		System.out.println("Total Basic Salary of Employees = " + totalBasicSalary);
		System.out.println("Total DA of Employees = " + totalDa);
		System.out.println("Total HRA of Employees = " + totalHra);
		System.out.println("==================================================================");
		System.out.println("Total Monthly Salary expences/cost to the Company = " + (totalBasicSalary+totalDa+totalHra));
		System.out.println("==================================================================");
	
	}

}
