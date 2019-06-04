
public class forstate {
	public static void main(String args[]) {
		int soda[]= {4, 7, 5, 9, 2, 3};
		int total=0;
		
		//Enhanced for statement
		//x is a variable to store array values as the loop occurs
		//soda is the name of the subject array
		for(int x: soda) {
			total+=x;
			
		}
		System.out.println(total);
	}

}
