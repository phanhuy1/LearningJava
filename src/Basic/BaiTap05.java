package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 10/31/2022 - 2:05 PM
 * Description: Bai05 Tính S(n) =1+ + + ... +
 * Trong đó n nhập từ người dùng, n >= 2
 */
public class BaiTap05 {
    //Main class here
    public static void main(String[] args) {
        //Declaration
        float sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        //Input n
        System.out.println("Please input (n >= 2): ");
        do {
            n = scanner.nextInt();
            if (n < 2) {
                System.out.println("Please input n >= 2: ");
            }
        } while (n < 2);
        //Calculate
        for (float i = 0; i <= n; i++){
            sum += 1/(2*i + 1);
        }
        System.out.format("Result: %f", sum);
    }
}
