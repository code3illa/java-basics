
public class varlengtharg {
	public static void main(String args[]) {
		System.out.println(average(3, 5, 7, 9, 3, 2));
		
	}
	
	//Flexible number of arguments ...
	public static int average(int...nums) {
		int total=0;
		for(int x:nums)
			total+=x;
		
		return total/nums.length;
	}

}
