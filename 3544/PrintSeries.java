package sf.com.sortarray;

public class PrintSeries {

	public static void main(String[] args) {
		int i = 1, c, f = 1;
		for (c = 1; c <= 4; c++) {
			   if (f % 2 == 0) {
			    System.out.print(-i + " ");
			   } else {
			    System.out.print(i + " ");
			   }
			   i += 2;
			   f++;
	}
	}
}
