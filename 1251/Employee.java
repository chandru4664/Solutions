package com.htc.coreexercise.beginers;

public class Employee {
	
	public Employee() {
		
		
	}
	
	//construction overloading
	public Employee(String empName, String empDepartment, int empBasicSal, int empDa, int empHra) {
		super();
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empBasicSal = empBasicSal;
		this.empDa = empDa;
		this.empHra = empHra;
	}


	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public int getEmpBasicSal() {
		return empBasicSal;
	}
	public void setEmpBasicSal(int empBasicSal) {
		this.empBasicSal = empBasicSal;
	}
	public int getEmpDa() {
		return empDa;
	}
	public void setEmpDa(int empDa) {
		this.empDa = empDa;
	}
	public int getEmpHra() {
		return empHra;
	}
	public void setEmpHra(int empHra) {
		this.empHra = empHra;
	}
	private String empName;
	private String empDepartment;
	private int empBasicSal;
	private int empDa;
	private int empHra;
	

}
