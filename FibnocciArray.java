import java.util.Scanner;

public class FibnocciArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f[] = new int[n];
		f[0] = 0;
	    f[1] = 1;
	    f[2] = 1;
		System.out.print(f[0]+",");
		for (int i = 0; i< f.length; i++) {
			f[i] = f[0] + f[2];
			f[1] = f[2];
			f[2] = f[i];
			System.out.print(f[i]+",");
		}
		
	}

}
