/*Methods with different type signatures 
 * are simply overloaded , they aren't overridden.*/
class A6 {
	int i, j;

	A6(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void show() {
		System.out.println("i j = " + i + " " + j);
	}

}

class B6 extends A6 {
	int k;

	B6(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}

	void show(String msg) {
		System.out.println(msg + k);
	}
}

class Override1 {
	public static void main(String args[]) {
		B6 subOB = new B6(1, 2, 3);
		subOB.show();
		subOB.show("This is k: ");
	}
}
