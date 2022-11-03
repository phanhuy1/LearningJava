package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/1/2022 - 4:44 PM
 * Description: ...
 */
public class BaiTap17 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Please input n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        sum += BaiTap11.factorial(n);
        System.out.println(sum);
    }
}
