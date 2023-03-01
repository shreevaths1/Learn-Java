class ChainExcDemo {
	static void demoproc() {
		NullPointerException n = new NullPointerException("top Layer exception.");
		n.initCause(new ArithmeticException("cause Exception."));
		throw n;
	}

	public static void main(String args[]) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Caught: " + e);
			System.out.println("Original Cause: " + e.getCause());
		}
	}
}
