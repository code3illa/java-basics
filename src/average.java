import java.util.Scanner;

public class average {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int total = 0, grade, average, counter = 0;
		
		while(counter < 10) {
			System.out.println("Enter Any Number: ");
			grade = input.nextInt();
			total = total + grade;
			counter ++;
		}
		
		average = total/10;
		System.out.println("Your Average is : " + average);
	}

}
