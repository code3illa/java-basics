
public class multiarray {
	public static void main(String args[]) {
		int array1[][]= {{8, 9, 10, 11}, {12, 13, 14, 15}};
		int array2[][]= {{30, 31, 32, 33}, {43}, {4, 5, 6}};	
		
		System.out.println("This is the 1st Array");
		display(array1);
		
		System.out.println("This is the 2nd Array");
		display(array2);
	}
	
	public static void display(int x[][]) {
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[row].length;col++) {
				System.out.print(x[row][col]+"\t");				
			}
			System.out.println();
		}
	}

}
