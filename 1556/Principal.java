package oops.inheritance;

public class Principal extends Schoolstaff {
	Principal(int e, int s, String n, int j) {
		super(e, s, n, j);

	}
	public int getprincipalemployeeID(){
		return employeeID;
		
	}
	public int getprincipalsalary(){
		return salary;
		}
	public String getprincipalname(){
		return name;
		
		
	}
	public int getexperience(){
		return experience;
		
		
		
		
	}

}
