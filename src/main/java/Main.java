import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 5, 4, 7, 8, 9, 1, 2, 3, 4, 5, 6, 9, 8, 7};
        int[] arr1 = {1, 1, 4, 1, 4, 1, 4, 1};
        System.out.println(Arrays.toString(sliceArrayAfterLast4(arr)));

        System.out.println(checkArrayForContents1And4(arr1));
    }

    public static int[] sliceArrayAfterLast4(int[] arr) {
        boolean status = false;
        int[] copyArr = new int[0];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                copyArr = Arrays.copyOfRange(arr, i + 1, arr.length);
                status = true;
                break;
            } else {
                continue;
            }
        }
        if (!status) {
            throw new RuntimeException("Массив не содержит ни одной 4ки");
        }
        return copyArr;
    }

    public static boolean checkArrayForContents1And4(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
        }
        return true;
    }
}
