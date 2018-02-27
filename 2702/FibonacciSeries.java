import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the count of numbers needed");
		int count = scan.nextInt();
		System.out.println("Here is the fibonacci serires for "+count+ " numbers");
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=0;i<count;i++)
		{
			
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
