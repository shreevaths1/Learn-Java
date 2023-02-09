public class IfSample {
    public static void main(String args[]) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y)
            System.out.println("x is less than y");
        x = x * 2;

        if (x == y)
            System.out.println("x now equals y");
        x = x * 2;

        if (x > y)
            System.out.println("x is now greater than y");

        // You wont see the below being output
        if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("Now, x is not equal to y.");
        }
    }
}
