class TestStack3 {
	public static void main(String args[]) {
		Stack3 mystack1 = new Stack3(10);
		Stack3 mystack2 = new Stack3(5);

		for(int i=0;i<10;i++) {
			mystack1.push(i);
		}
		for(int i=10;i<15;i++) {
			mystack2.push(i);
		}

		System.out.println("mystack1 contents:");
		for(int i=0;i<10;i++) {
			System.out.println("	"+mystack1.pop());
		}
		System.out.println();

		System.out.println("mystack2 contents:");
		for(int i=0;i<5;i++) {
			System.out.println("	"+mystack2.pop());
		}
	}
}

class Stack3{
	private int tos;
	private int stck[];

	Stack3(int size) {
		tos=-1;
		stck = new int[size];
	}

	void push(int item) {
		if(tos==stck.length - 1) {
			System.out.println("Stack Overflow.");
		}
		else {
			stck[++tos]=item;
		}
	}

	int pop() {
		if(tos==-1) {
			System.out.println("Stack Underflow.");
			return 0;
		}
		else {
			return stck[tos--];
		}
	}
}