package Contests.BiWeekly.BiWeeklyContest79;

// not correct

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        String n = "1210";
        System.out.println(digitCount(n));

    }

    private static boolean digitCount(String n) {
        int[] count = new int[n.length()];
        for (int i = 0 ; i < n.length(); i++) {
            int j = n.charAt(i) - 48;
            if (j > n.length()-1) {
                return false;
            }
            count[j]++;
        }
        return true;
    }
}
