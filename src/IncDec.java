public class IncDec {
    public static void main(String args[]) {
        int a = 1, b = 2, c, d;
        c = ++b; /*
                  * equivalent to
                  * b = b + 1;
                  * c = b;
                  */

        d = a++; /*
                  * equivalent to
                  * d = a;
                  * a = a + 1;
                  */

        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

}
