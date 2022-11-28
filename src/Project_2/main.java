package Project_2;

import java.io.*;
import java.util.*;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_2
 * Created by Phan Huy
 * Description: ...
 */
public class main {
    static HashMap<String,String> hashMap = new HashMap<String,String>();
    static ArrayList<slang> reset = new ArrayList<slang>();
    static ArrayList<slang> list = new ArrayList<slang>();
    static Scanner scan = new Scanner(System.in);

    // Read Slang Word from file
    public static void ReadSlang(String filename) throws IOException {
        list.clear();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        // Read line from input.txt file
        while ((line = reader.readLine()) != null) {
            // Solve the string
            String[] info = line.split("`");
            slang a = new slang(info[0], info[1]);
            hashMap.put(info[0],info[1]);
            list.add(a);
            reset.add(a);
        }
        reader.close();
    }

    // Search Slang word
    public static String SearchSlangWord(String slangWord) {
        for (Map.Entry<String, String> set :
                hashMap.entrySet()) {
            if(set.getKey().equalsIgnoreCase(slangWord)){
                return set.getValue();
            }
        }
        return null;
    }

    // Search Meaning
    public static ArrayList<String> SearchMeaning(String input){
        ArrayList<String> slang = new ArrayList<String>();
        for (Map.Entry<String, String> set :
                hashMap.entrySet()) {
            if(set.getValue().contains(input)){
                slang.add(set.getKey());
            }
        }
        return slang;
    }
}
