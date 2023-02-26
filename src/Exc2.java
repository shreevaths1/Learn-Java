class Exc2 {
	public static void main(String args[]) {
		int a,d;
		
		try {
			d=0;
			a=10/d;
			System.out.println("This wont be printed");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero.");
		}
		System.out.println("After catch statement.");
	}
}
