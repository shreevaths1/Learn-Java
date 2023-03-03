package backtrackEx;

class BackTracking {
    // Time Complexity: O(N*N!)
    // N! possible permutations
    // each permutation is found N steps
    static void printString(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printString(newStr, perm + currChr, idx + 1);
        }
    }

    public static void main(String args[]) {
        String str = "ABC";
        printString(str, "", 0);
    }
}