public class CyclicallyRotate {
    public static void main(String[] args) {


        int[][] array = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};

        for (int[] a : array) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        int count =0;
        while (count<2) {
            int temp = array[0][0];
            array[0][0] = array[1][0];
            array[1][0] = array[2][0];
            array[2][0] = array[2][1];
            array[2][1] = array[2][2];
            array[2][2] = array[1][2];
            array[1][2] = array[0][2];
            array[0][2] = array[0][1];
            array[0][1] = temp;
            count++;
        }
        System.out.println("After rotation 2 times");
            for (int[] row : array) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
        }
    }