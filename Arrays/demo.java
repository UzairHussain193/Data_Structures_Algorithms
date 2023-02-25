public class demo {
    public static void main(String[] args) {
        int tmp;
        int[] arr = { 15, 7, 3, 99, 65, 101 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr.length - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}