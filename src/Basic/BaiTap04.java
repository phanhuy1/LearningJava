package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 10/31/2022 - 2:02 PM
 * Description: ...
 */
public class BaiTap04 {
    public static void main(String[] args) {
        //Declare variables
        int n;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input n (n > 9): ");
        do {
            n = scanner.nextInt();
            if (n <= 9) {
                System.out.println("Please try again with n > 9: ");
            }
        } while (n <= 9);
        //Calculate
        for (float i = 1; i <= n; i++){
            sum += 1/(2*i);
        }
        System.out.println("Result S(" + n + ") = "+ sum);
    }
}
