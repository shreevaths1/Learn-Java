class UseSuper {
	public static void main(String args[]) {
		B2 subOb = new B2();
		subOb.set(1, 2);
		subOb.show();
	}
}

class A2 {
	int i;
}

class B2 extends A2 {
	int i;

	void set(int a, int b) {
		super.i = a;
		i = b;
	}

	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}