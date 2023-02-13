class Outer1 {
	int outer_x = 20;
	Inner1 inner1 = new Inner1();
	// Inner2 inner2 = new Inner2(); generates error since Inner2 is not a member
	// class Outer

	void test1() {

		inner1.display1();
	}

	class Inner1 {
		int y = 10;

		void display1() {
			System.out.println("display1: outer_x = " + outer_x);
			System.out.println();
		}
	}

	void test2() {
		for (int i = 0; i < 5; i++) {
			class Inner2 {

				void display2() {
					System.out.println("display: outer_x= " + outer_x);
				}
			}
			Inner2 j = new Inner2();
			j.display2();
		}
	}

	void show_y() {
		// System.out.println("y = "+y); enclosing class cannot access inner class'
		// members.

		System.out.println("y = " + inner1.y); /* Here you access inner class' members through object. */
		System.out.println();
	}
}

class InnerClassDemo {
	public static void main(String args[]) {
		Outer1 outer = new Outer1();
		outer.test1();
		outer.show_y();
		outer.test2();
	}
}
