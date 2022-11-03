package Project_1.QLHS;

import Project_1.DanhSach.DanhSach;
import Project_1.HocSinh.HocSinh;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_1.QLHS
 * Created by Phan Huy
 * Date 10/10/2022 - 2:45 PM
 * Description: ...
 */
public class quanlyhs {
    /**
     * Main here
     * @param args is the input from terminal
     */
    public static void main(String[] args) throws IOException {
        HocSinh a = new HocSinh();
        DanhSach listHs = new DanhSach();
        for(int i = 0; i < 2; i++) {
            a.inputStudent();
            listHs.getHocSinhArrayList().add(a);
        }
        for(int i = 0; i < 2; i++) {
            System.out.println(listHs.getStudent(i).toString());
        }
        //File input = new File("D:\\Desktop\\hocsinh.csv");
        //a.toStringCsv(input);
        /*
        BufferedImage img = null;
        File fin  = null;
        try {
            fin = new File("src\\Project_1\\Images\\testimage.jpg");
            img = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
            img = ImageIO.read(fin);
            System.out.println("Reading complt");
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
        try {
            File input = new File("D:\\Desktop\\hocsinh.csv");
            String temp = img.toString();
            PrintWriter writer = new PrintWriter(input);
            StringBuilder sb = new StringBuilder();
            sb.append("image");
            sb.append("\n");
            sb.append(img.toString());
            writer.write(sb.toString());
            writer.close();
            System.out.println("Writing complete.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }*/

    }

}


