public class MoveAllNegativeNumbers {
    public static void main(String[] args) {

        int[] arr = {-1, -5, -3, -2, -4, 8, 9, 10, 7, 5};

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        int temp;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
