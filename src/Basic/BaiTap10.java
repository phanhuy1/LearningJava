package Basic;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 10/2/2022 - 2:05 PM
 * Description: ...
 */
public class BaiTap10 {
    /**
     * Main function is here!
     * @param args is the argument from terminal
     * */
    public static void main(String[] args) {
        //Declaration
        float x, n;
        double res;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input x = ");
        x = scanner.nextFloat();
        System.out.print("Please input n = ");
        n = scanner.nextFloat();
        res = Math.pow(x, n);
        System.out.print(res);
    }
}
