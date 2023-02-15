class Animal {
	final void callme() {
		System.out.println("Inside Animal's callme method.");
	}

	void show() {
		System.out.println("Inside Animal's show method.");
	}
}

class Dog extends Animal {
	void show() {
		System.out.println("Inside Dog's show method.");
	}
}

class Test1 {
	public static void main(String args[]) {
		Dog d = new Dog();
		
		Animal a1 = new Dog();
		Animal a2 = new Dog();
		
		System.out.println(d);
		System.out.println(a1.equals(a2) + "\n");

		a1.show(); // resolved at run-time.
		d.show(); // resolved at compile-time
		a1.callme();// resolved at compile-time
	}
}