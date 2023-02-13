/*Improvement on
 * Stack.java */
class Stack2 {
	private int tos;
	private int stck[] = new int[10];

	Stack2() {
		tos = -1;
	}

	void push(int item) {
		if (tos == 9) {
			System.out.println("Stack Overflow.");
		} else {
			stck[++tos] = item;
		}
	}

	int pop() {
		if (tos == -1) {
			System.out.print("Stack Underflow. ");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}

class TestStack2 {
	public static void main(String args[]) {
		Stack2 mystack1 = new Stack2();
		Stack2 mystack2 = new Stack2();

		for (int i = 0; i < 10; i++) {
			mystack1.push(i);
		}
		System.out.println();

		for (int i = 10; i < 21; i++) {
			mystack2.push(i);
		}
		System.out.println();

		System.out.println("Stack in mystack1");
		for (int i = 0; i < 10; i++) {
			System.out.println("	" + mystack1.pop());
		}
		System.out.println();

		System.out.println("Stack in mystack2");
		for (int i = 0; i < 11; i++) {
			System.out.println("	" + mystack2.pop());
		}
		System.out.println();

		/*
		 * The below statements are invalid due to
		 * private access of 'tos' and 'stck[]'
		 *
		 * mystack1.tos = 1;
		 * mystack2.stck[3] = 100;
		 */
	}
}
