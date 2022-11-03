package Basic;

import java.util.*;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:10 PM
 * Description: ...
 */
public class BaiTap25 {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<Integer>(
                Arrays.asList(1, 2, 4, 5, 6)
        );
        int n;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a target: ");
        n = scanner.nextInt();
        System.out.print(findIndex(arrInt, n));

    }

    public static int findIndex(ArrayList<Integer> arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                return i;
            }
            else {
                count = 1;
            }
        }
        if(count != 0) {
            arr.add(target);
            Collections.sort(arr);
        }
        return arr.indexOf(target);
    }
}
