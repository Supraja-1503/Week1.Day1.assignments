package week1.day1.assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int range = 8;
		int firstNo = 0;
		int secNo = 1;
		
		System.out.println("Fibonacci Series");
		System.out.println(" " +firstNo);
		System.out.println(" " +secNo);
		
		for(int i=1;i<=range;i++)

		{
			int sum = firstNo + secNo;
			firstNo = secNo;
			secNo = sum;
			System.out.print(" " +sum);
		}
		
	}

}