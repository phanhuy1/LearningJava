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
public class BaiTap09 {
    /**
     * Here is the main function
     * @param args is the arguments from terminal
     * */
    public static void main(String[] args) {
        //Declaration
        int n;
        float sum = 1;
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.println("Please input n (n > 6): ");
        do {
            n = scanner.nextInt();
            if (n <= 6) {
                System.out.println("Please input again with n > 6 : ");
            }
        } while (n <= 6);
        //Calculate
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("Result: " + sum);
    }
}
