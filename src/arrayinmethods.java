
public class arrayinmethods {
	public static void main(String args[]) {
		int soda[]= {3, 5, 6, 7, 4, 8};
		
		//call the method
		change(soda);
		
		for(int x:soda)
			System.out.println(x);
	}
	
	public static void change(int x[]) {
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;
	}

}
