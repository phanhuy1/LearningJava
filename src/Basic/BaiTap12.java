package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 10/31/2022 - 12:07 PM
 * Description: ...
 */
public class BaiTap12 {

    //main here
    /**
     * @param args is input from terminal
     */
    public static void main(String[] args) {
        //Declaration
        int sum = 0;
        int n;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input X: ");
        x = scanner.nextDouble();
        System.out.print("Please input n: ");
        n = scanner.nextInt();
        for (double i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println(sum);
    }
}
