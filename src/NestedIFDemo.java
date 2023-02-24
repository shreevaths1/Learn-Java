class C {
	interface In {
		boolean isNotNegative(int x);
	}
}

class CB implements C.In {
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}
}

class NestedIFDemo {
	public static void main(String args[]) {
		C.In ob = new CB();
		if(ob.isNotNegative(23)) {
			System.out.println("23 is not negative.");
		}
		
		if(ob.isNotNegative(-56)) {
			System.out.println("This won't be displayed.");
		}
	}
}
