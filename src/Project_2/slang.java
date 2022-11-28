package Project_2;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_2
 * Created by Phan Huy
 * Date 11/27/2022 - 9:18 PM
 * Description: ...
 */
public class slang {
    //Declare attribute for class slang
    String slang;
    String meaning;

    //Default constructor of slang
    public slang(){
        this.slang = null;
        this.meaning = null;
    }

    //Constructor with parameters
    public slang(String slang, String meaning) {
        this.slang = slang;
        this.meaning = meaning;
    }

    //Copy constructor with parameter is a slang obj
    public slang(slang sl){
        this.slang = sl.slang;
        this.meaning = sl.meaning;
    }

    //getter of slang attribute
    public String getSlang(){
        return this.slang;
    }

    //getter of meaning attribute
    public String getMeaning(){
        return this.meaning;
    }

    //setter of slang attribute & meaning attribute

    public void setSlang(String slang){
        this.slang = slang;
    }

    public void setMeaning(String meaning){
        this.meaning = meaning;
    }
}
