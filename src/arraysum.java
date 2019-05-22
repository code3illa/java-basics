public class arraysum {
	public static void main(String args[]) {
		int soda[]= {23, 21, 25, 30, 26, 28};
		int sum=0;
		
		for(int counter=0;counter<soda.length;counter++) {
			sum+=soda[counter];
			
		}
		System.out.println("The sum is: " +sum);
	}

}
