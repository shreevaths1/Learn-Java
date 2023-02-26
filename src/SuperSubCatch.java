/*
 * class SuperSubCatch {
	public static void main(String args[]) {
		try {
			int d=0;
			int a=42/d;
		}
		catch(Exception e) {
			System.out.println("Generic Exception catch.");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception catch.");
		}
	}
}
*/

//to solve above problem:
class SuperSubCatch {
	public static void main(String args[]) {
		try {
			int d = 0;
			int a = 42 / d;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception catch.");
		} catch (Exception e) {
			System.out.println("Generic Exception catch.");
		}
	}
}