import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = new int[] {1, 10, 5, 16, 18, 21, 44, 56, 87, 3};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            }

        }
        System.out.println(Arrays.toString(arr));
        int[] arrPart = Arrays.copyOfRange(arr, 2, 7);
        System.out.println(Arrays.toString(arrPart));

    }
}