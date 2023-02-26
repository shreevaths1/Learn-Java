class NestTry {
	public static void main(String args[]) {
		int a, b;
		int c[];
		try {
			a = args.length;
			b = 42 / a;
			System.out.println("a = " + a);

			try {
				if (a == 1) {
					b = 42 / (a - a);
				}
				if (a == 2) {
					c = new int[1];
					c[42] = 1;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index oob: " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero: " + e);
		}
	}
}
