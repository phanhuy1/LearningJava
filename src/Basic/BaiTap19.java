package Basic;
import java.util.Scanner;
/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:09 PM
 * Description: ...
 */
public class BaiTap19 {
    public static void main(String[] args) {

        double s = 0;
        int n;
        double x;
        Scanner scan;
        System.out.println("Input x = ");
        scan = new Scanner(System.in);
        x = scan.nextInt();
        do {
            System.out.println("Input n = ");
            n = scan.nextInt();
        }while(n <= 0);
        int m = 1;
        for(double i = 2; i <= 2*n; i += 2) {
            m *= i*(i-1);
            s += i/m;
        }
        s = s*x +1;
        System.out.println("S(x,n) = " + s);
        scan.close();
    }
}
