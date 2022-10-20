package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Created by Phan Huy
 * Date 10/2/2022 - 1:17 PM
 * Description: Tính S(n) =1+ + + ... +
 * Trong đó n nhập từ người dùng, n >= 7
 */
public class BaiTap03 {
    //Main function here
    public static void main(String[] args) {
        //Declare variables
        int n;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input n (n > = 7): ");
        do {
            n = scanner.nextInt();
            if (n < 7) {
                System.out.println("Please try again with n >= 7: ");
            }
        } while (n < 7);
        //Calculate
        for (float i = 1; i <= n; i++){
            sum += 1/i;
        }
        System.out.println("Result S(" + n + ") = "+ sum);
    }
}
