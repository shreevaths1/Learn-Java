class CommandLine {
	public static void main(String args[]) {
		if(args.length == 0) {
			System.out.println("No Arguments!");
		}
		else {
			System.out.println("No. of arguments = "+args.length);
			for (int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "] = " + args[i]);
			}
		}
		
	}
}
