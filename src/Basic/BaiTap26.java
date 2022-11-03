package Basic;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:11 PM
 * Description: ...
 */
public class BaiTap26 {
    public static void main(String[] args) {
        Integer[] arrInt = {10, 2, 38, 23, 38, 23, 21};
        if((arrInt.length) % 2 == 0) {
            System.out.print(arrInt[(arrInt.length)/2]+ ", " + arrInt[((arrInt.length) / 2) - 1]);
        }
        else {
            System.out.print(arrInt[(arrInt.length) / 2]);
        }
    }
}
