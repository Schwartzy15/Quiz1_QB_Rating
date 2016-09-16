import java.util.Scanner;

public class QB_Rating {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of touchdowns: ");
		double TD = in.nextDouble();
		
		System.out.println("Enter number of total yards: ");
		double YDS = in.nextDouble();
		
		System.out.println("Enter number of interceptions: ");
		double INT = in.nextDouble();
		
		System.out.println("Enter number of completions: ");
		double COMP = in.nextDouble();
		
		System.out.println("Enter number of passes attempted: ");
		double ATT = in.nextDouble();
		
	double a = (((COMP/ATT) - 0.3) * 5);
	if (a>2.375)
		a=2.375;
	else if (a<0)
		a=0;
	
	double b = (((YDS/ATT) - 3) * 0.25);
	if (b>2.375)
		b=2.375;
	else if (b<0)
		b=0;
	
	double c = ((TD/ATT) * 20);
	if (c>2.375)
		c=2.375;
	else if (c<0)
		c=0;
	
	double d = (2.375 - ((INT/ATT) * 25));
	if (d>2.375)
		d=2.375;
	else if (d<0)
		d=0;
	
	double PR = (((a+b+c+d)/6)*100);
	
	System.out.printf("The QB's Passer Rating is: %.1f", PR);
	
	in.close();
	
	}

}
