package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * Package: Basic
 * Created by Phan Huy
 * Date 10/31/2022 - 12:14 PM
 * Description: ...
 */
public class BaiTap15
{
    //main here
    /**
     * @param args is input from terminal
     */
    public static void main(String[] args) {
        //Declaration
        double sum = 0;
        double n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input n: ");
        n = scanner.nextDouble();
        for (double i = 1; i <= n; i++) {
            sum += 1/sumInt(i);
        }
        System.out.println(sum);
    }
    public static double sumInt(double n) {
        if (n == 1) return 1;
        return n + sumInt(n - 1);
    }
}
