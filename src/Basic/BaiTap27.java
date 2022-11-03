package Basic;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:11 PM
 * Description: ...
 */
public class BaiTap27 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50, 10, 40};
        checkSingle(arr, arr.length);
    }
    public static void checkSingle(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j] && j != i) {
                    count = 0;
                    break;
                }
                else {
                    count = 1;
                }
            }
            if(count != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
