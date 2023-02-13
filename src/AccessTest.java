class Test3 {
	int a;
	public int b;
	private int c;

	void setc(int i) {
		c = i;
	}

	int getc() {
		return c;
	}
}

class AccessTest {
	public static void main(String args[]) {
		Test3 ob = new Test3();

		ob.a = 2;
		ob.b = 3;
		// ob.c = 4; /*This is not visible*/
		ob.setc(4);

		// System.out.println(ob.c); /*This is not visible*/
		System.out.println("a, b and c = " + ob.a + " " + ob.b + " and " + ob.getc());
	}
}