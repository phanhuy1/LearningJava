package Project_1.HocSinh;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_1.HocSinh
 * Created by Phan Huy
 * Date 10/10/2022 - 2:47 PM
 * Description: ...
 */
public class HocSinh {
    /**
     * Declaration of Hoc Sinh attributes
     */
    private String stuId;
    private String stuName;
    private Float gpa;
    private BufferedImage img;
    //private String img;
    private String stuAddr;
    private String notes;

    /**
     * Default constructor of HocSinh
     */
    public HocSinh() {

        this.stuId = null;
        this.stuName = null;
        this.gpa = 0f;
        this.img = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        this.stuAddr = null;
        this.notes = null;
    }

    /**
     * Constructor with parameters
     * @param id this is id parameter
     * @param name this is name parameter
     * @param gpa this is gpa parameter
     * @param img this is img parameter
     * @param addr this is addr parameter
     * @param notes this is notes parameter
     */
    public HocSinh(String id, String name, float gpa, BufferedImage img, String addr, String notes) {
        this.stuId = id;
        this.stuName = name;
        this.gpa = gpa;
        this.img = img;
        this.stuAddr = addr;
        this.notes = notes;
    }

    /**
     * Copy constructor
     * @param hs is HocSinh Object
     */
    public HocSinh(HocSinh hs) {
        this.stuId = hs.stuId;
        this.stuName = hs.stuName;
        this.gpa = hs.gpa;
        this.img = hs.img;
        this.stuAddr = hs.stuAddr;
        this.notes = hs.notes;
    }

    /**
     * Getter of student ID
     * @return String stuId
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * Setter of student ID
     * @param stuId is the parameter
     */
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    /**
     * Getter of student name
     * @return String stuName
     */
    public String getStuName() {
        return stuName;
    }
    /**
     * Setter of student Name
     * @param stuName is the parameter
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    /**
     * Getter of student GPA
     * @return float gpa
     */
    public float getGpa() {
        return gpa;
    }
    /**
     * Setter of student GPA
     * @param gpa is the parameter
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    /**
     * Getter of student Image
     * @return String information of student image
     */
    public BufferedImage getImg() {
        return img;
    }
    /**
     * Setter of student Image
     * @param img is the parameter
     */
    public void setImg(BufferedImage img) {
        this.img = img;
    }
    /**
     * Getter of student address
     * @return String stuAddr
     */
    public String getStuAddr() {
        return stuAddr;
    }
    /**
     * Setter of student address
     * @param stuAddr is the parameter
     */
    public void setStuAddr(String stuAddr) {
        this.stuAddr = stuAddr;
    }
    /**
     * Getter of student notes
     * @return String notes
     */
    public String getNotes() {
        return notes;
    }
    /**
     * Setter of student notes
     * @param notes is the parameter
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }



    /**
     * Add Student
     */

    public void inputStudent() throws IOException {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Input student information!");
        System.out.print("Student ID: ");
        this.stuId = scanner.nextLine();
        System.out.print("Student Name: ");
        this.stuName = scanner.nextLine();
        System.out.print("GPA: ");
        try {
            this.gpa = Float.parseFloat(scanner.nextLine());
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.print("Input name of Image: ");
        File fin = new File(scanner.nextLine());
        this.img = ImageIO.read(fin);
        System.out.print("Address: ");
        this.stuAddr = scanner.nextLine();
        System.out.print("Notes: ");
        this.notes = scanner.nextLine();
        return;
    }
    public void inputStudent(HocSinh a) {
        this.gpa = a.gpa;
        this.img = a.img;
        this.notes = a.notes;
        this.stuId = a.stuId;
        this.stuAddr = a.stuAddr;
        this.stuName = a.stuName;
    }
    @Override
    public String toString() {
        return(this.stuId + " " + this.stuName + " " + this.gpa + " " + this.img.toString() + " " + this.stuAddr + " "
    + this.notes);
    }

    public void toStringCsv(File fin) {
        Scanner scanner = new Scanner(System.in);
        try {
            StringBuilder sb = new StringBuilder();
            FileInputStream Fin;
            BufferedReader reader = null;
            try {
                Fin = new FileInputStream(fin);
                reader = new BufferedReader(new InputStreamReader(Fin));
            }
            catch (FileNotFoundException exc) {
                System.out.println("File not found");
                return;
            }
            String info=" ";
            info = reader.readLine();
            String tmp[];
            tmp = info.split(",");
            if (tmp[0] == "Student ID") {
                sb.append("Student ID,");
                sb.append("Name,");
                sb.append("GPA,");
                sb.append("IMG,");
                sb.append("Address,");
                sb.append("Notes,");
                sb.append("\n");
            }
            sb.append(this.stuId).append(",");
            sb.append(this.stuName).append(",");
            sb.append(this.gpa).append(",");
            sb.append(this.img.toString()).append(",");
            sb.append(this.stuAddr).append(",");
            sb.append(this.notes).append(",\n");
            PrintWriter writer = new PrintWriter(fin);
            writer.write(sb.toString());
            writer.close();
            System.out.println("Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
