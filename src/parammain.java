import java.util.Scanner;

public class parammain {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		params ob = new params();
		
		System.out.println("Enter your name: ");
		
		String soda = input.nextLine();
		
		ob.sms(soda);
		
	}

}
