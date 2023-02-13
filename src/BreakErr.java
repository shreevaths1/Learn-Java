public class BreakErr {
    public static void main(String args[]) {
        one: for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
        }

        /*
         * The below code generates compile time
         * error,since to break out block 'one' it
         * must enclose the break statement.
         *
         *
         * for(int j=0;j<100;j++){
         * if(j==10){
         * break one;
         * }
         * System.out.print(j+" ");
         * }
         * System.out.println();
         */
    }
}
