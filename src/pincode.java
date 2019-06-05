import java.util.Scanner;

public class pincode {
	public static void main(String args []) {
		int pin=3000, entry=0, userpin=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTER YOUR PIN: ");
		
		
		while(userpin != pin && entry<3) {
			userpin = input.nextInt();
			entry ++;
			if(userpin != pin && entry<3) {
				System.out.println("INCORRECT PIN! TRY AGAIN!");
				}
			else if(userpin == pin && entry<=3) {
				System.out.println("WELCOME!");
			}
			else {
				System.out.println("PIN BLOCKED");
			}
				
			
		}
	}
}
