package Basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:11 PM
 * Description: ...
 */
public class BaiTap28 {
    /**
     *
     * @param args is inputs from terminal
     */
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 4, 3, 5, 7};
        removeDuplicate(arr, arr.length);
    }

    /**
     * trans array to set to remove duplicate and trans set back to array :#
     * @param intArr array input
     * @param n number of elements
     */
    public static void removeDuplicate(Integer[] intArr, int n) {
        Set<Integer> setInt = new HashSet<>(Arrays.asList(intArr));
        intArr = setInt.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArr));
    }
}
