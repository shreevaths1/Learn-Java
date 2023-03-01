interface A3{
	void meth1();
	void meth2();
}

interface B3 extends A3{
	void meth3();
}

class MyClass implements B3{
	public void meth1() {
		System.out.println("Inside meth1().");
	}
	public void meth2() {
		System.out.println("Inside meth2().");
	}
	public void meth3() {
		System.out.println("Inside meth3().");
	}
}

class IFExtend {
	public static void main(String args[]) {
		B3 c = new MyClass();
		// it depends on type of reference, not
		// on the type of object.
		c.meth1();
		c.meth2();
		c.meth3();
	}
}
