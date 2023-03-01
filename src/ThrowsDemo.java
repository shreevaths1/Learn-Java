class ThrowsDemo {
	static void throwsOne() throws IllegalAccessException {
		System.out.println("Inside throwOne method.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwsOne();
		} catch (IllegalAccessException e) {
			System.out.println("Caught: " + e);
		}
	}
}

/*
 * the throws clause is not required if the method handles that exception.
 * 
 * class ThrowsDemo { 
 * 	static void throwsOne() { 
 * 		try {
			  System.out.println("Inside throwOne method."); 
			  throw new IllegalAccessException("demo"); 
		} 
		catch(IllegalAccessException e) {
			  System.out.println(e.getMessage()); 
			  } 
	}
			  
 * public static void main(String args[]) { 
 * 			throwsOne(); 
 * 	} 
 *}
 * 
 */