public class Scope {
    public static void main(String args[]) {
        int x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y is: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; y is out of scope -- Generates compile time error
        System.out.println("x is: " + x); // x is still within its scope
    }
}