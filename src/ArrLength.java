class ArrLength {
	public static void main(String args[]) {
		int a1[] = new int[10];
		int a2[] = { 3, 5, 6, 7, 1, 8, 99, 44, -10 };
		int a3[] = { 4, 3, 2, 1 };

		System.out.println("Length of array 1: " + a1.length);
		/*
		 * length is an instance variable of Array class, not a method."
		 */
		System.out.println("Length of array 2: " + a2.length);
		System.out.println("Length of array 3: " + a3.length);
	}
}
