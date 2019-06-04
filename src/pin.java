import java.util.*;

public class pin {
	public static void main(String args[]) {
		int pin=2000, entry=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter PIN: ");
		int userpin = input.nextInt();
		
	
		while(entry<3) {
			System.out.println("Enter PIN: ");
			if(userpin != pin) {
				System.out.println("INCORRECT PIN!");
			}
			else {
				System.out.println("CORRECT PIN!");
			}
			
		}
	}

}
