import java.util.Scanner;

public class soda {
	public static void main(String args[]) {
		
		tuna ob = new tuna();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String soda = input.nextLine();
		
		ob.setName(soda);
		ob.printing();
		
		
	}

}
