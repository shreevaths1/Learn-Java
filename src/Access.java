class Access {
	public static void main(String args[]) {
		B1 subOb = new B1();
		subOb.setij(4, 5);
		subOb.sum();

		A1 superOb = new A1();
		superOb.setij(4, 5);

		// System.out.println("superOb.j = "+superOb.j);
		superOb.showij();
	}
}

class A1 {
	int i;
	private int j;

	void setij(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void showij() {
		System.out.println("i and j = " + i + " " + j);
	}
}

class B1 extends A1 {
	void sum() {
		// System.out.println("i + j = "+(i+j));
		/*
		 * the variable 'j' is not visible here since it is private member of class A.
		 */
	}
}