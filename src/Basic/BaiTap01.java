package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * Created by BaiTap01
 * Date 10/2/2022 - 12:38 PM
 * Description: ...
 */
public class BaiTap01 {
    /**
     * Main function here;
     * */
    public static void main(String[] args) {
        //Declare
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int n;

        System.out.println("Pls input n: ");
        //Input int from keyboard and check
        do {
            n = scanner.nextInt();
            if (n < 3 || n > 50) {
                System.out.println("Just input (3 < n < 50): ");
            }
        } while (n < 3 || n > 50);
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println(s);
    }
}
