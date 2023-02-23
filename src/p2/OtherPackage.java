package p2;


class OtherPackage {
	OtherPackage() {
		p1.Protected p = new p1.Protected();
		System.out.println("other package , non-subclass constructor.");

		// class or package only
		// System.out.println("n = "+p.n);

		// class only
		// System.out.println("n_pri = "+p.n_pri);

		// class,package or other package subclass only
		// System.out.println("n_pro = "+p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
