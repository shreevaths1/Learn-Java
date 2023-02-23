package p1;

//we declare it public since we have to access this class in package p2
public class Protected {
	int n = 1;
	private int n_pri = 2;
	protected int n_pro = 3;
	public int n_pub = 4;

	// if you don't declare this constructor
	// public you get message as "implicit
	// super constructor not visible while declaring
	// Protected2 constructor.
	public Protected() {
		System.out.println("base constrcutor.");
		System.out.println("n = " + n);
		System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}