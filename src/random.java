import java.util.Random;

public class random {
	public static void main(String args []) {
		
		Random dice = new Random();
		int num;
		
		for(int counter=1; counter<=10;counter++) {
			num = 1+dice.nextInt(6);
			System.out.println(num);
		}
		
	}

}
