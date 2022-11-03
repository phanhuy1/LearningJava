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
public class BaiTap08 {
    /**
     * @param args is the argument from terminal
     * */
    public static void main(String[] args) {
        //Declaration
        int n;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.println("Please input n (n > 5)");
        do {
            n = scanner.nextInt();
            if(n <= 5) {
                System.out.println("Please input again with n > 5: ");
            }
        } while (n <= 5);
        //Calculate
        for (float i = 1; i <= n; i++)  {
            sum += (2*i + 1) / (2*i + 2);
        }
        System.out.println("Result S(" + n + ") = " + sum);
    }
}
