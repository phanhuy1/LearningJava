package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Created by Phan Huy
 * Date 10/2/2022 - 1:05 PM
 * Description: Tính S(n) = 12 + 22 + 32 + ... + n2
 * Trong đó n nhập từ người dùng, n >= 5 và n <=20
 */
public class BaiTap02 {
    //Main function here
    public static void main(String[] args) {
        //Declare variables
        int n; // Input variable
        int sum = 0; //S(n)
        Scanner scanner = new Scanner(System.in); //Console input declaration
        // Input
        System.out.println("Please Input n value (5 <= n <= 20): ");
        do {
            n = scanner.nextInt();
            if (n < 5 || n > 20) {
                System.out.println("Please Input again (5 <= n <= 20): ");
            }
        } while (n < 5 || n > 20);
        //Calculate
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        //Print out
        System.out.format("Result S(%d) = %d", n, sum);
    }
}
