public class compintrest {
	public static void main(String args[]) {
		double amount, principle =1000, rate=.01;
		
		for(int day=1; day<=20; day++) {
			amount = principle*Math.pow(1+rate, day);
			System.out.println(day + "  "+ amount);
		}
	}

}
