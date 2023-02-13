class UseStatic {
	static int a = 2, b;
	int y;

	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// y = 20; /*Can only directly access static variables of its class*/
		// this.a = x; /*Cannot use 'this' inside static methods*/
		// meth2(); /*Can only call other static methods of its class.*/
	}

	void meth2() {
		System.out.println("");
	}

	static {
		System.out.println("Static block initializes value of b = a * 4");
		b = a * 4;
	}

	public static void main(String args[]) {
		meth(42);
	}
}
