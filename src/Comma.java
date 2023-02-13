public class Comma {
    public static void main(String args[]) {
        /*
         * int b = 4;
         *
         * for(int a = 1;a<b;a++){
         * System.out.println("a = "+a);
         * System.out.println("b = "+b);
         * b--;
         * }
         */

        for (int a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a= " + a);
            System.out.println("b =" + b);
        }
    }
}
