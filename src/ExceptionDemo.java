class MyException extends Exception {
	int detail;

	MyException(int detail) {
		this.detail = detail;
	}

	public String toString() {
		return "Exception [" + detail + "]";
	}
}

class ExceptionDemo {
	static void compute(int a) throws MyException {
		System.out.println("called compute (" + a + ")");
		if (a > 10)
			throw new MyException(a);
		System.out.println("Normal Exit.");
	}

	public static void main(String args[]) {
		try {
			compute(5);
			compute(20);
		} catch (MyException e) {
			System.out.println("Caught: " + e);
		}
	}
}
