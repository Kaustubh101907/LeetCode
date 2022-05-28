package BitwiseOperators;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},
                {1,0,1},
                {0,0,0}
        };
    }

    private int[][] flipAndInvertImage(int[][] arr) {
        for (int[] row : arr) {
            // reverse this array
            for (int i = 0; i < (arr[0].length +1) /2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length -i -1] ^ 1;
                row[arr[0].length -i -1] = temp;
            }
        }
        return arr;
    }
}
