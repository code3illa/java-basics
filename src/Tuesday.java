import java.util.Scanner;

public class Tuesday {
	public static void main(String args[]) {
		
		anotherclass ob = new anotherclass();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String myname = input.nextLine();
		
		ob.setName(myname);
		ob.outputName();
		
		
	}

}
