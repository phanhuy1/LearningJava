package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 10/31/2022 - 2:05 PM
 * Description: ...
 */
public class BaiTap07 {
    public static void main(String[] args) {
        //Declaration
        float sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        //Check input with n >= 1;
        System.out.println("Please Input n (n >= 1): ");
        do {
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("Please input again with n >= 1");
            }
        } while (n < 1);
        //Calculate
        for (float i = 1; i <= n; i++){
            sum += i / (i + 1);
        }
        System.out.println("Result S(" + n + ") = "+ sum);
    }
}
