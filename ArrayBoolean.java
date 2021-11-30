import java.util.Scanner;

public class ArrayBoolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("------");
		int b[] = new int[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println(getSolution(a,b));

	}

	private static boolean getSolution(int[] a, int[] b) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] == a[j])
				{
					count1++;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i] == b[j])
				{
					count2++;
				}
			}
		}
		if(count1 == 3 || count2 == 3)
		{
			return (count1 == count2);
		}
		return false;	
	}

}
