class A {
	int i, j;

	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int k;

	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i + j + k = " + (i + j + k));
	}
}

class SimpleInheritance {
	public static void main(String args[]) {
		A superOb = new A();
		System.out.println("Contents of Super Class A:");
		superOb.i = 10;
		superOb.j = 20;
		superOb.showij();
		System.out.println();

		B subOb = new B();
		System.out.println("Contents of Sub Class B:");
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		subOb.showij();
		subOb.showk();
		System.out.println();

		System.out.print("Sum of i , j , and k: ");
		subOb.sum();

		/* Super class has no knowledge of child class' members */
		// superOb.sum();
		// superOb.showk();

	}
}