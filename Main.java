import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("------");
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("------");
		int b[] = new int[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int count1 = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]== a[i+1])
			{
				count1++;
			}
		}
		int count2 = 0;
		for (int i = 0; i < b.length; i++) {
			if(b[i]== b[i+1])
			{
				count2++;
			}
		}
		if(count1 == count2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("flase");
		}
	}

}
