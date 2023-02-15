abstract class D1{
	
	abstract void callme();
	void callmetoo() {
		System.out.println("This is a concrete method.");
	}
}

class E1 extends D1{
	void callme() {
		System.out.println("This is E1's implementation of callme method.");
	}
}

class AbstractDemo {
	public static void main(String args[]) {
		//You cannot instantiate an abstract class!
		//D1 d1 = new D1(); 
		
		E1 e1 = new E1();
		e1.callme();
		e1.callmetoo();
	}
}
