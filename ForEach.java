public class ForEach {
    public static void main(String args[]) {
        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i : nums) {
            System.out.println("i is " + i);
            sum += i;
        }
        System.out.println("sum of elements of nums[] is " + sum);

        /*
         * The above code using traditional
         * for loop:-
         * int i;
         * for(int x=0;x<10;x++){
         * i = nums[x];
         * System.out.println("i is "+i);
         * sum += i;
         * }
         */
    }
}
