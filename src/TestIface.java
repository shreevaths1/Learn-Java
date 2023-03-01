
interface CallBack {
	void callback(int param);
}

class Client implements CallBack {
	public void callback(int param) {
		System.out.println("callback() called with " + param);
	}

	void nonIfaceMeth() {
		System.out.print("classes that implement interfaces ");
		System.out.println("can also define their own members.");
	}
}

class AnotherClient implements CallBack {
	public void callback(int param) {
		System.out.println("Another implementation of callback().");
		System.out.println("p squared is: " + (param * param));
	}
}


abstract class Incomplete implements CallBack{
	void show() {
		System.out.print("This is Incomplete class. ");
		System.out.println("Doesn't implement CallBack.");
	}
}

class Complete extends Incomplete{
	public void callback(int param) {
		System.out.print("This is A's implementation ");
		System.out.println("of callback().");
	}
}

class TestIface{
	public static void main(String args[]) {
		Client c = new Client();
		c.callback(42);
		c.nonIfaceMeth();
		System.out.println();

		CallBack c1;
		c1 = new Client();
		c1.callback(42);

		// undefined method for type CallBack
		// c1.nonIfaceMeth();
		
		System.out.println();
		
		c1 = new AnotherClient();
		c1.callback(4);
		
		System.out.println();
		
		c1 = new Complete();
		c1.callback(78);
		
		System.out.println();
		
		Complete a = new Complete();
		a.show();
		
	}
}
