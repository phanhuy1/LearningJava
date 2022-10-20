package Project_1.HocSinh;

import Project_1.DanhSach.DanhSach;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_1.HocSinh
 * Created by Phan Huy
 * Date 10/10/2022 - 2:47 PM
 * Description: ...
 */

/**
 * @class HocSinh
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
     * @param id
     * @param name
     * @param gpa
     * @param img
     * @param addr
     * @param notes
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
        Scanner scanner = new Scanner(System.in, "utf8");
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
    }
    @Override
    public String toString() {
        return(this.stuId + " " + this.stuName + " " + this.gpa + " " + this.img.toString() + " " + this.stuAddr + " "
    + this.notes);
    }

    public void toStringCsv(File fin) {
        Scanner scanner = new Scanner(System.in);
        try {
            PrintWriter writer = new PrintWriter(fin);
            StringBuilder sb = new StringBuilder();
            sb.append("Student ID,");
            sb.append("Name,");
            sb.append("");
            sb.append("\n");
            sb.append(this.stuId);
            sb.append(this.stuName);
            writer.write(sb.toString());
            writer.close();
            System.out.println("Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
