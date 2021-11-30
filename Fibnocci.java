import java.util.Scanner;

public class Fibnocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter:");
		int n = sc.nextInt();
		int a =1;
		int b = 1;
		System.out.print(a+","+b+",");
		for (int i = 2; i < n; i++) {
			int c = a + b;
			 a = b;
			 b = c;
			 System.out.print(c+",");
			 
			
			
		}
		
		
	}

}
