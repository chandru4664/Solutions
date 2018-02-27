
public class EmployeeAllBenefit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            double[] empBasics = {15000.00,20000.00,25000.00,30000.00,35000.00};
            double[] empDA = {1000.00,1500.00,2000.00,2500.00,3000.00};
            double[] empHRA = {2000.00,2500.00,3000.00,3500.00,4000.00};
            double[] totalSalaryofEmp = new double[5];
            
            double basicTotal = 0.00; double daTotal = 0.00; double hraTotal = 0.00;
            
            for(int i=0;i<5;i++)
            {
            	basicTotal = basicTotal + empBasics[i];
            	daTotal = daTotal + empDA[i];
            	hraTotal = hraTotal + empHRA[i];
            	totalSalaryofEmp[i] = empBasics[i]+empDA[i]+empHRA[i];
            }
            
            System.out.println("Basic Total of all: "+basicTotal +" Average of basic " +basicTotal /empBasics.length);
            System.out.println("DA Total of all: "+daTotal +" Average of DA " +daTotal /empDA.length);
            System.out.println("HRA Total of all: "+hraTotal +" Average of DA " +hraTotal /empHRA.length);
            
            for(int i=0;i<totalSalaryofEmp.length;i++)
            {
            System.out.println("Total Salaries of Employee "+ (i+1) +"  : "+totalSalaryofEmp[i]);
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	}

}
