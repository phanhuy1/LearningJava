import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * PACKAGE_NAME
 * Created by Main
 * Date 10/2/2022 - 12:15 AM
 * Description: ...
 */
public class Main {
    /**
     * main function
     * @param args parameters from terminal
     * */
    public static void main(String[] args) throws ParseException {

        System.out.println("Hello Phan Huy");
        int a = 100;
        String s_a = String.valueOf(a);
        System.out.println(s_a);

        Integer i_a = Integer.valueOf(a);
        String s_i_a = i_a.toString();
        System.out.println(s_i_a);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date sDate = sdf.parse("2022/10/02");
        String s_date = sdf.format(sDate);
        System.out.println(sDate.toString());

        System.out.println(s_date);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str);

    }
}
