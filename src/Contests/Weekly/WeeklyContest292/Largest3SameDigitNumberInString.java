package Contests.Weekly.WeeklyContest292;

public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        String n = "6777133339";
        System.out.println(largestGoodInteger(n));
    }

    private static String largestGoodInteger(String n) {
        char[] arr = n.toCharArray();
        int max = -1;
        for (int i = 0 ; i < arr.length -2; i++) {
            if (arr[i] == arr[i+1] && arr[i+1] == arr[i+2]) {
                max = Math.max(max,arr[i]);
            }
        }
        if (max == -1)
            return "";
        max = max -48;
        String str = "";
        for (int i = 0 ; i < 3; i++) {
            str += max;
        }
        return str;
    }
}
