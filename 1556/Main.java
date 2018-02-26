package oops.inheritance;



public class Main {
	public static void main(String[]argss){
	     Schoolstaff s=new Schoolstaff(4,60000,"Ram",20);
	    System.out.println(s.salary);
	    System.out.println(s.name);
		Schoolstaff []staffs=new Schoolstaff[2];
		staffs[0]=new Principal(1,50000,"John",15);
		staffs[1]=new Teacher(2,30000,"Punitha",10);
		Salary salary=new Salary(staffs);
			
		System.out.println(salary.getSchoolstaffsalary(2));
	   
		 
	    
	}
}
