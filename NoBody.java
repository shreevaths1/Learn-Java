public class NoBody {
    public static void main(String args[]) {
        // The target of a loop can be empty
        int i = 100;
        int j = 200;

        while (++i < --j)
            ; // a null statement (one that consists only a semicolon)

        System.out.println("Midpoint is " + i);
    }
    /*
     * In professionally written Java code,
     * body of loops are empty when the
     * controlling expression can handle
     * all of the details itself.
     */
}
