public class Search {
    public static void main(String args[]) {
        int val = 5;
        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        boolean found = false;

        for (int x : nums) {
            if (val == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Value found!");
        }
    }
}
