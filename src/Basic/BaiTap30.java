package Basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:12 PM
 * Description: ...
 */
public class BaiTap30 {
    /**
     *
     */
    public static void main(String[] args) {
        String[] viDu1 = { "cat", "flag", "green", "country", "w3resource" };
        String[] viDu2 = { "cat", "dog", "red", "is" };
        System.out.println(longString(viDu1).toString());
        System.out.println(longString(viDu2).toString());
    }
    public static ArrayList<String> longString(String[] str) {
        ArrayList<String> temp = new ArrayList<String>();
        int maxLen = str[0].length();
        for (int i = 0; i < str.length; i++) {
            if(maxLen < str[i].length()) {
                maxLen = str[i].length();
            }
        }
        for (int i = 0; i < str.length; i++) {
            if(str[i].length() == maxLen) {
                temp.add(str[i]);
            }
        }
        return temp;
    }
}
