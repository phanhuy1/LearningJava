package Basic;

import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:12 PM
 * Description: ...
 */
public class BaiTap31 {
    /**
     *
     * @param args is inputs from terminal
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        System.out.println("Please Input string: ");
        line = scanner.nextLine();
        if(check0nly(line)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
    public static Boolean check0nly(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
