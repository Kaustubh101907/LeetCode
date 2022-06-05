package BitwiseOperators;

// Que Link:

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int ans = 0;
        for (int i = 0 ; i < arr.length; i++) {
            ans ^= arr[i];
        }
        for (int i = 0; i <arr.length; i++) {
            if (ans == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
