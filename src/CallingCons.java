/* 
 * in a class hierarchy , constructors
 * complete their execution in order of derivation.*/
class A4 {
	A4() {
		System.out.println("Inside A4's constructor.");
	}
}

class B4 extends A4 {
	B4() {
		System.out.println("Inside B4's constructor.");
	}
}

class C1 extends B4 {
	C1() {
		System.out.println("Inside C1's constructor.");
	}
}

class CallingCons {
	public static void main(String args[]) {
		C1 c1 = new C1();
	}
}
