package Basic;
import java.util.Scanner;
/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:09 PM
 * Description: ...
 */
public class BaiTap21 {
    public class Array {
        public static void main(String[] args) {
            int m, n;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Amount of rows: ");
            m = scanner.nextInt();
            System.out.println("Amount of columns:  ");
            n = scanner.nextInt();
            int A[][] = new int[m][n];
            System.out.println("Input elements: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = scanner.nextInt();
                }
            }

            //find max
            int max = A[0][0];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (max < A[i][j]) {
                        max = A[i][j];
                    }
                }
            }
            System.out.println("Max element: " + max);
            //find min
            int min = A[0][0];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (min > A[i][j]) {
                        min = A[i][j];
                    }
                }
            }
            System.out.println("Min element: " + min);

            //find k
            int k;
            int pos_i = -1;
            int pos_j = -1;
            System.out.println("Input k = ");
            k = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] == k) {
                        pos_i = i;
                        pos_j = j;
                        break;
                    }
                }
            }
            System.out.println("Position of " + k + ": (" + pos_i + "," + pos_j + ")");
        }
    }
}
