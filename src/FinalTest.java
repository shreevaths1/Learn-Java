class FinalDemo {
	final double PI = 3.14;
	final double EXP = 2.71;
	final int FILE_NEW = 1;
	final int FILE_SAVE = 3;
	final int FILE_SAVEAS;

	FinalDemo() {
		/*
		 * You can initialize final variables using constructors if you haven't
		 * initialized them while declaration.
		 */
		FILE_SAVEAS = 4;
	}

	void meth(final int X) {
		// Parameter X can't be changed within the method

		// X = 6;
		final int Y = 8; // local variable Y can't be assigned more than once
		System.out.println("final int X: " + X);
		System.out.println("final int Y: " + Y);
		// Y = 10;
	}

}

class FinalTest {
	public static void main(String args[]) {
		FinalDemo ob = new FinalDemo();
		System.out.println("final double PI = " + ob.PI);
		System.out.println("final double EXP = " + ob.EXP);
		System.out.println("final int FILE_NEW = " + ob.FILE_NEW);
		System.out.println("final int FILE_SAVE = " + ob.FILE_SAVE);
		System.out.println("final int FILE_SAVEAS = " + ob.FILE_SAVEAS);

		ob.meth(45);

	}
}
