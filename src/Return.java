public class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Before the return statement.");
        if (t)
            return;
        System.out.println("This won't execute.");

        /*
         * The same code above if you don't use the variable
         * boolean t = true; but instead:-
         * System.out.println("Before the return statement.");
         * if(true) return;
         * System.out.println("This won't execute.");
         *
         * Then the above is Dead Code.
         */
    }
}
