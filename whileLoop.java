import java.util.Iterator;

public class whileLoop {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("The odd numbers are");
		while(n!=50)
		{
			System.out.print(n+1 +" ");
			n+=2;
		}
		System.out.println(" ");
		System.out.println("The even numbers are");
		int m = 0;
		while(m!=50)
		{
			System.out.print(m +" ");
			m+=2;
		}
	}
}
