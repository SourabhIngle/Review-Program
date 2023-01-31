public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] array = {899, 8, 19, 7,66, 6, 15};

        int max = 0;
        int secondMax = 0;

        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                secondMax = max;
                max = array[i];
            }
            if (array[i] < max && array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println("Largest number " +max);
        System.out.println("Second Largest number "+secondMax);
    }
}
