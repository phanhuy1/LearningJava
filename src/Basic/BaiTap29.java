package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:11 PM
 * Description: ...
 */
public class BaiTap29 {
    /**
     * Nhan xet n = 1 -> 1 cach, n = 2 -> 2 cach, n = 3 -> 3 cach, n = 4 -> 5 cach, n = 5 -> 8 cach => Fibonacci
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Input n: ");
        n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n < 0) {
            return 0;
        }else if(n == 2 || n == 1) {
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
