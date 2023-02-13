class Outer {
	int outer_x = 20;
	Inner1 inner1 = new Inner1();
	// Inner2 inner2 = new Inner2(); generates error since Inner2 is not a member
	// class Outer

	void test() {

		inner1.display1();
	}


	class Inner1 {
		int y = 10;

		void display1() {
			System.out.println("display1: outer_x = " + outer_x);
		}
	}


	void show_y() {
		// System.out.println("y = "+y); enclosing class cannot access inner class'
		// members.

		System.out.println("y = " + inner1.y); /* Here you access inner class' members through object. */
	}
}

class InnerClassDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
		outer.show_y();
	}
}
