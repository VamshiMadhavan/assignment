import java.util.*;

public class geometricprogress {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int n = 5;
		int r=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				 r += Math.pow(2,j)*b;				
			}
			int r1 = a + r;
			System.out.print(r1+",");
			r =  0;	
		}
	}

	
	

}
//12+