package Project_1.DanhSach;

import Project_1.HocSinh.HocSinh;

import java.io.*;
import java.util.*;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_1.DanhSach
 * Created by Phan Huy
 * Date 10/29/2022 - 3:39 PM
 * Description: ...
 */
public class DanhSach {
    /**
     * In class DanhSach
     * df is default number of students
     */
    static int countStu = 0; // count students numbers
    private ArrayList<HocSinh> hocSinhArrayList = null;
    /**
     *  Default constructor of class DanhSach
     *
     */
    public DanhSach() {
        this.hocSinhArrayList = new ArrayList<HocSinh>();
    }

    public boolean addStudent(int i) throws IOException {
        HocSinh student = new HocSinh();
        student.inputStudent();
        if (student == null || hocSinhArrayList.contains(student)) {
            System.out.println("Student already exist or student's null!!");
            return false;
        }
        countStu += 1;
        this.hocSinhArrayList.add(i, student);
        System.out.println("Add student No." + i + " to the list...");
        return true;
    }

    public ArrayList<HocSinh> getHocSinhArrayList() {
        return this.hocSinhArrayList;
    }

    public String getStudent(int i) {
        if(i < this.hocSinhArrayList.size()) {
            return this.hocSinhArrayList.get(i).toString();
        }
        else {
            return "Your index is out of bounds";
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        assert this.hocSinhArrayList != null; //null exception
        for (HocSinh hocSinh : this.hocSinhArrayList) {
            sb.append(hocSinh.toString());
        }
        return sb.toString();
    }
    /**
     * Copy constructor of class DanhSach
     * @param ds is the parameter
     */
    public DanhSach(DanhSach ds) {
        this.hocSinhArrayList = ds.hocSinhArrayList;
    }
    public int getNumStu() {
        return countStu;
    }

    public void nStudentToList(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            addStudent(i);
        }
    }
    public void updateStudentInfo() throws IOException {
        int i;
        System.out.println("Update student Information!");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input correctly index of exist student to update:");
            i = scanner.nextInt();
            System.out.println(this.hocSinhArrayList.size());
        } while (i  < 0 || i > this.hocSinhArrayList.size());
        this.hocSinhArrayList.get(i - 1).inputStudent();
    }

    public void removeStudent() {
        int i;
        System.out.println("Remove student from a list!");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input correctly index of exist student to remove:");
            i = scanner.nextInt();
        } while (i < 0 || i > this.hocSinhArrayList.size());
        this.hocSinhArrayList.remove(i - 1);
        System.out.println("Student removed...");
    }
    public void sortListGPA() {
        Collections.sort(hocSinhArrayList, Comparator.comparingDouble(HocSinh::getGpa));
    }

    public void sortListId() {
        Collections.sort(hocSinhArrayList, Comparator.comparingDouble(HocSinh::getStuId));
    }
    public void displayStudentList(int i) {
        if(this.hocSinhArrayList.size() == 0 || this.hocSinhArrayList == null) {
            System.out.println("No students in this list");
            return;
        }
        if (i == 0){
            for(int j = 0; j < this.hocSinhArrayList.size(); j++) {
                System.out.println(this.getStudent(j));
            }
        }
        else if(i == 1) {
            sortListGPA();
            for(int j = 0; j < this.hocSinhArrayList.size(); j++) {
                System.out.println(this.getStudent(j));
            }
        }
        else {
            sortListId();
            for(int j = 0; j < this.hocSinhArrayList.size(); j++) {
                System.out.println(this.getStudent(j));
            }
        }
    }

    public void writeFile() {
        try {
            System.out.println("Input name of file: ");
            Scanner scanner = new Scanner(System.in);
            File fName = new File(scanner.nextLine());
            FileWriter fWriter =new FileWriter(fName);
            for(int i = 0; i < this.hocSinhArrayList.size(); i++) {
                String tmp = this.hocSinhArrayList.get(i).toString();
                fWriter.write(tmp + "\n");
            }
            fWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFile() throws FileNotFoundException {
        Scanner kBoard = new Scanner(System.in);
        File fName = new File(kBoard.nextLine());
        Scanner scanner = new Scanner(fName);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tmp = line.split(", ");
            HocSinh hS = new HocSinh();
            hS.setStuId(tmp[0]);
            hS.setStuName(tmp[1]);
            hS.setGpa(Float.parseFloat(tmp[2]));
            hS.setImg(tmp[3]);
            hS.setStuAddr(tmp[4]);
            hS.setNotes(tmp[5]);
            this.hocSinhArrayList.add(hS);
            System.out.println(line);
        }
    }

    public void toCsvFile() {
        System.out.println("Output to csv File!");
        Scanner scanner = new Scanner(System.in);
        try {
            StringBuilder sb = new StringBuilder();
            FileInputStream Fin;
            BufferedReader reader = null;
            System.out.println("Input name of csv file (example: hocsinh.csv)");
            File fin = new File(scanner.nextLine());
            FileOutputStream fOut = new FileOutputStream(fin);
            fOut.close();
            try {
                Fin = new FileInputStream(fin);
                reader = new BufferedReader(new InputStreamReader(Fin));
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                return;
            }
            sb.append("Student ID,");
            sb.append("Name,");
            sb.append("GPA,");
            sb.append("IMG,");
            sb.append("Address,");
            sb.append("Notes");
            sb.append("\n");
            for (int i = 0; i < this.hocSinhArrayList.size(); i++) {
                sb.append(this.hocSinhArrayList.get(i).getStuId()).append(",");
                sb.append(this.hocSinhArrayList.get(i).getStuName()).append(",");
                sb.append(this.hocSinhArrayList.get(i).getGpa()).append(",");
                sb.append(this.hocSinhArrayList.get(i).getImg()).append(",");
                sb.append(this.hocSinhArrayList.get(i).getStuAddr()).append(",");
                sb.append(this.hocSinhArrayList.get(i).getNotes()).append("\n");
            }
            PrintWriter writer = new PrintWriter(fin);
            writer.write(sb.toString());
            writer.close();
            System.out.println("Write to csv completed...");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readCsvToList() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a name of csv file (example: 'hocsinh.csv'): ");
        Scanner sc = new Scanner(new File(scanner.nextLine()));
        String line = null;
        while(sc.hasNext()){
            line = sc.nextLine();
            String[] tmp = line.split(",");
            if(!Objects.equals(tmp[0], "Student ID")) {
                System.out.println(tmp[0]);
                System.out.println(line);
                HocSinh hS = new HocSinh();
                hS.setStuId(tmp[0]);
                hS.setStuName(tmp[1]);
                hS.setGpa(Float.parseFloat(tmp[2]));
                hS.setImg(tmp[3]);
                hS.setStuAddr(tmp[4]);
                hS.setNotes(tmp[5]);
                this.hocSinhArrayList.add(hS);
            }
        }
    }
}
