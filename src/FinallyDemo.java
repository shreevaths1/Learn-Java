class FinallyDemo {
	static void procA() {
			System.out.println("Inside procA().");
			throw new ArithmeticException();
	}
	
	static void procB() {
		try {
			System.out.println("Inside procB().");
			return;
		}
		finally {
			System.out.println("Inside procB's finally");
		}
	}
	
	static void procC() {
		try {
			System.out.println("Inside procC()");
		}
		finally {
			System.out.println("Insise procC's finally.");
		}
	}
	
	public static void main(String args[]) {
		try {
			procA();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Inside procA's finally.");
		}
		
		procB();
		procC();
	}
}