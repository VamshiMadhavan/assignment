import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = (b*b) - (4*a*c);
		double q1;
		double q2;
		if(d>0)
		{
			 q1 = - b + Math.sqrt(d)/(2*a);
			 q2 = - b - Math.sqrt(d)/(2*a);
			 System.out.format("Firstroot is %.2f"+q2);
			 System.out.format("Firstroot is %.2f"+q2);
		}
		else if(d == 0)
		{
			 q1 = - b /(2*a);
			 q2 = - b /(2*a);
			 System.out.format("Firstroot is %.2f"+q1);
			 System.out.format("Firstroot is %.2f"+q2);
			
		}
		else
		{
			double real = -b/(2*a);
			double img = Math.sqrt(-d)/(2*a);
			 System.out.printf("Firstroot is %.2f + %.2f"+real);
			 System.out.printf("Firstroot is %.2f - %.2fi"+img);
		}
		
	}

}
