package Testing;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Testing
 * Created by Phan Huy
 * Date 10/8/2022 - 4:42 PM
 * Description: ...
 */
public class TestArray {
    /**
     * @param args is the inputs from terminal
     * main here
     */
    public static void main(String[] args) {
        int a[][] = inputArray();
        printArray(a);
    }
    /**
     * Init array from terminal
     * @return array[][]
     *
     */
    public static int[][] inputArray() {
        int[][] array = {
                {1, 2 , 3},
                {4, 5},
                {6, 7}
        };
        return array;
    }
    /**
     * print array/matrix
     * @param array integer[][]
     *
     */
    public static void printArray(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


