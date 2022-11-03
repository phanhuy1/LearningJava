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
public class BaiTap23 {
    class find_max {
        static int vt;

        static int find_max_sum(int a[], int n) {
            int temp = 0, maxsum = 0;
            for (int i = 0; i < n; i++) {
                if (temp + a[i] < 0)
                    temp = 0;
                else
                    temp += a[i];
                if (temp > maxsum) {
                    maxsum = temp;
                    vt = i;
                }
            }
            return maxsum;
        }

        public static void main(String args[]) {
            int a[] = {-7, 0, 1, -11, 5, -3, 8, -2, 5};
            int n = 9;
            int sum = find_max_sum(a, n);
            System.out.println(sum);

            while (sum > 0) {
                System.out.println(a[vt] + " ");
                sum -= a[vt];
                vt--;
            }
        }
    }
}
