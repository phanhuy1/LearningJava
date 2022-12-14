package Basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 10/31/2022 - 1:55 PM
 * Description: ...
 */
public class BaiTap11 {

    //main here
    /**
     * @param args is input from terminal
     */
    public static void main(String[] args) {
        //Declaration
        int sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input n: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        System.out.println(sum);
    }
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
