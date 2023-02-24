package stackIFace;

class IFTest3 {
	public static void main(String args[]) {
		IntStack stack;
		FixedStack mystack1 = new FixedStack(5);
		DynStack mystack2 = new DynStack(8);

		stack = mystack1;
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}

		stack = mystack2;
		for (int i = 0; i < 12; i++) {
			stack.push(i);
		}

		System.out.println("mystack1 contents: ");
		stack=mystack1;
		for(int i=0;i<5;i++) {
			System.out.println(stack.pop());
		}
		
		System.out.println();
		System.out.println("mystack2 contents: ");
		stack=mystack2;
		for(int i=0;i<12;i++) {
			System.out.println(stack.pop());
		}
		
	}
}
