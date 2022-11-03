package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/1/2022 - 4:01 PM
 * Description: ...
 */
public class BaiTap16 {
    //main here
    /**
     * @param args is input from terminal
     */
    public static void main(String[] args) {
        //Declaration
        double sum = 0;
        double n;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input x: ");
        x = scanner.nextDouble();
        System.out.print("Please input n: ");
        n = scanner.nextDouble();
        for (double i = 1; i <= n; i++) {
            sum += (x * i)/sumInt(i);
        }
        System.out.println(sum);
    }
    public static double sumInt(double n) {
        if (n == 1) return 1;
        return n + sumInt(n - 1);
    }
}
