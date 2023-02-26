//stack trace of exception message
//static method subroutine() 
//then static method main()
class Exc1 {
	static void subroutine() {
		int d = 0;
		int a = 10/d;
	}
	public static void main(String args[]) {
		subroutine();
	}
}