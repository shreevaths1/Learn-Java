public class ForEach2 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };

        for (int i : nums) {
            System.out.println("i is " + i);
            sum += i;
            if (i == 5) {
                break;
            }
        }
        System.out.println("sum of first 5 elements of nums[] is " + sum);
    }
}
