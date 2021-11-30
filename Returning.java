import java.util.Scanner;

public class Returning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		getArray(a);
		
		
	}

	public static void  getArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
			
		}
		
			
		
		
		
	}


