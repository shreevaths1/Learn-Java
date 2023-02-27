import java.lang.Object;

class ThrowDemo {
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("caught inside demoproc method: " + e);
			throw e;
		}
	}

	public static void main(String args[]) {
		try {
			demoproc();
			// throw new NullPointerException("hello");
		} catch (NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
		System.out.println("All try/catch units terminated.");
	}
}
