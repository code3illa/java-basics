import java.util.Scanner;

public class scanner {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double fnum, snum, ans;
		
		System.out.println("Enter 1st Number: ");
		fnum = input.nextDouble();
		System.out.println("Enter 2nd Number: ");
		snum = input.nextDouble();
		
		ans = fnum + snum;
		
		System.out.println("The sum is: " + ans);
	}
}
