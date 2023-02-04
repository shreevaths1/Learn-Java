public class BoolTest {
    public static void main(String args[]) {
        boolean b;

        b = true;
        if (b)
            System.out.println("b has the value: " + b);

        b = false;
        if (b)
            System.out.println("This is not executed");

        System.out.println("10 > 9 is " + (10 > 9));
        /*
         * extra paranthesis around 10 < 9 is required
         * since '+' has higher precedence than '<'
         */
    }
}
