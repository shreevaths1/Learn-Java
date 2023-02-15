class D{
	void callme() {
		System.out.println("Inside D's callme method.");
	}
}

class E extends D{
	void callme() {
		System.out.println("Inside E's callme method.");
	}
}

class F extends D{
	void callme() {
		System.out.println("Inside F's callme method.");
	}
}

class Dispatch {
	public static void main(String args[]) {
		D d = new D();
		E e = new E();
		F f = new F();
		D r;
		
		r=d;
		r.callme(); //type of object being referred to is D
		
		r=e;
		r.callme();	//type of object being referred to is E
		
		r=f;
		r.callme(); //type of object being referred to is F
	}
}