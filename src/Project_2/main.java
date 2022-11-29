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

    // Read slang Word from file
    public static void ReadSlang(String filename) throws IOException {
        list.clear();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        // Read line from input.txt file
        while ((line = reader.readLine()) != null) {
            // Solve the string
            slang a;
            if(line.contains("`")) {
                String[] info = line.split("`");
                a = new slang(info[0], info[1]);
                hashMap.put(info[0], info[1]);
            }
            else {
                a = new slang("", line);
                hashMap.put("", line);
            }
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
    // Edit Slang
    public static void EditSlang(slang edit){
        if(hashMap.containsKey(edit.getSlang()))
            hashMap.replace(edit.getSlang(),edit.getMeaning());
        for(slang i : list)
            if(i.getSlang().equalsIgnoreCase(edit.getSlang())) {
                i.setMeaning(edit.getMeaning());
                break;
            }
    }

    // Check exist
    public static boolean CheckSlang(slang a) {
        for (Map.Entry<String, String> set : hashMap.entrySet()) {
            if (set.getKey().equalsIgnoreCase(a.getSlang()))
                return true;
        }
        return false;
    }
    // Add Slang
    public static void AddSlang(slang add){
        list.add(add);
        hashMap.put(add.getSlang(),add.getMeaning());
    }

    // Remove
    public static void RemoveSlang(slang remove){
        if(!CheckSlang(remove))
            return;
        int i = 0;
        while(i < list.size()){
            if(list.get(i).getSlang().equalsIgnoreCase(remove.getSlang()))
                break;
            else
                i++;
        }
        list.remove(i);
        hashMap.remove(remove.getSlang(),remove.getMeaning());
    }

    // Reset
    public static void ResetSlang() throws  IOException{
        ReadSlang("D:\\slang.txt");
    }

    // Random
    public static slang RandomSlang(){
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }

    // Get list
    public static ArrayList<slang> GetSlangList(){
        return list;
    }

    // Save file
    public static void WriteSlang(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write("Slag`Meaning" + "\n");
        for(slang i : list){
            writer.write(i.getSlang() + '`' + i.getMeaning() + "\n");
        }
        writer.close();
    }
}
