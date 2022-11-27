package Project_1.QLHS;

import Project_1.DanhSach.DanhSach;
import java.io.*;
import java.util.Scanner;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_1.QLHS
 * Created by Phan Huy
 * Date 10/29/2022 - 2:45 PM
 * Description: ...
 */
public class QuanLyHS {
    /**
     * Main here
     * @param args is the input from terminal
     */
    public static void main(String[] args) throws IOException {
        DanhSach listHs = new DanhSach();
        DanhSach listHs_2 = new DanhSach();
        while (userMenu(listHs)) {}

    }

    /**
     * Menu with parameter DanhSach
     * @param listHs is the student list
     * @return true or false
     * @throws IOException for file cant find or out of time
     */
    public static boolean userMenu(DanhSach listHs) throws IOException {
        int opt;
        System.out.println("Students management system!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add student to the list");
        System.out.println("2. Update student information");
        System.out.println("3. Delete a student");
        System.out.println("4. View student list");
        System.out.println("5. Save student list into file (*.inp)");
        System.out.println("6. Load student from file to list (*.inp)");
        System.out.println("7. Export student list to file (CSV)");
        System.out.println("8. Import student list from file (CSV)");
        System.out.println("0. Exit()");
        System.out.print("Choose an option to do: ");
        opt = scanner.nextInt();
        switch (opt) {
            case 1:
                clearScreen();
                listHs.displayStudentList(0);
                int n;
                System.out.print("Input number students to add to list:");
                n = scanner.nextInt();
                listHs.nStudentToList(n);
                listHs.displayStudentList(0);
                break;
            case 2:
                clearScreen();
                listHs.displayStudentList(0);
                listHs.updateStudentInfo();
                listHs.displayStudentList(0);
                break;
            case 3:
                clearScreen();
                listHs.displayStudentList(0);
                listHs.removeStudent();
                listHs.displayStudentList(0);
                break;
            case 4:
                clearScreen();
                listHs.displayStudentList(0);
                System.out.print("Choose 1 for GPA Ascending and 2 for ID");
                n = scanner.nextInt();
                listHs.displayStudentList(n);
                break;
            case 5:
                System.out.println("Input an name or path of file to write: ");
                File fileName = new File(scanner.nextLine());
                listHs.writeFile();
                break;
            case 6:
                DanhSach listTmp = new DanhSach();
                System.out.println("Input an name or path of file to read into list: ");
                listTmp.readFile();
                listTmp.displayStudentList(0);
                break;
            case 7:
                clearScreen();
                listHs.displayStudentList(0);
                listHs.toCsvFile();
                break;
            case 8:
                listTmp = new DanhSach();
                listTmp.displayStudentList(0);
                listTmp.readCsvToList();
                listTmp.displayStudentList(0);
                break;
            default:
                return false;
        }
        return true;
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


