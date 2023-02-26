class MultiCatch {
	public static void main(String args[]) {
		int a = args.length;
		try {
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Division by zero: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
		System.out.println("This is after all try/catch blocks.");
	}
}
