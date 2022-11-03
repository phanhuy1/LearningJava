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
public class BaiTap06 {
    /**
     * @param args input from terminal
     * */
    public static void main(String[] args) {
        //Declare variables
        int n;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input n (n > 6): ");
        do {
            n = scanner.nextInt();
            if (n <= 6) {
                System.out.println("Please try again with n > 6: ");
            }
        } while (n <= 6);
        //Calculate
        for (float i = 1; i <= n; i++){
            sum += 1/ (i * (1 + i));
        }
        System.out.println("Result S(" + n + ") = "+ sum);
    }
}
