class Outer2{
	int outer_x = 100;
	
	void test2() {
		for(int i=0;i<5;i++) {
			class Inner2{
				
				void display2() {
					System.out.println("display: outer_x= "+outer_x);
				}
			}
			Inner2 j = new Inner2();
			j.display2();
		}
	}
}

class InnerClassDemo2 {
	public static void main(String args[]) {
		Outer2 ob = new Outer2();
		ob.test2();
	}
}
