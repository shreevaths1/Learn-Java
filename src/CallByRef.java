class CallByRef {
	public static void main(String args[]) {
		Test4 ob = new Test4(4, 8);

		System.out.print("Values of ob.a and ob.b ");
		System.out.println("before calling meth(): " + ob.a + " " + ob.b);

		ob.meth(ob);
		System.out.print("Values of ob.a and ob.b ");
		System.out.println("before calling meth(): " + ob.a + " " + ob.b);
	}
}

class Test4 {
	int a, b;

	Test4(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void meth(Test4 ob) {
		ob.a *= 2;
		ob.b /= 6;
	}
}