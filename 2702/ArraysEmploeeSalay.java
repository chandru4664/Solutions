
public class ArraysEmploeeSalay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] empSalaries = {2500.00,35000.00,45000.00,50000.00,55000.00};
		double totalSalaries = 0.0;
		for(double salary : empSalaries)
		{
			totalSalaries = totalSalaries + salary;
		}
	    
        System.out.println("Total Salaries is :" + totalSalaries);
        System.out.println("Average of the Salary in Org is : " +totalSalaries/empSalaries.length);
	}

}
