package sf.com.sortarray;

public class AverageSalary {

	public static void main(String[] args) {
     
		int[] salary = {10000,20000,30000,40000,50000};
		float average=0;
		for(int i=0;i<salary.length;i++){
			average=average+salary[i];
		}
		System.out.println(average/salary.length);
	}

}
