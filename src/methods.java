import java.util.*;

public class methods {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Amount to convert: ");
		double amt = x.nextDouble();
		
		System.out.print(usd_to_ksh(amt));
		
	}
	
	
	public static double usd_to_ksh(double usd) {	
		
		double kshs = usd * 100;
		return kshs;
		
	}
	
}
