package Project_1.DanhSach;

import Project_1.HocSinh.HocSinh;

/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Project_1.DanhSach
 * Created by Phan Huy
 * Date 10/10/2022 - 3:39 PM
 * Description: ...
 */
public class DanhSach {
    /**
     * In class DanhSach
     * df is default number of students
     */
    static int countStu = 0; // count students numbers
    private HocSinh hs[] = null;

    /**
     *  Default constructor of class DanhSach
     *
     */
    public DanhSach() {
        this.hs = new HocSinh[50]; // default constructor will make class DanhSach have 50 HocSinh
    }

    /**
     * Constructor with parameter
     * @param nStu is the parameter of number students
     */
    public DanhSach(int nStu) {
        this.hs = new HocSinh[nStu];
    }

    /**
     * Copy constructor of class DanhSach
     * @param ds is the parameter
     */
    public DanhSach(DanhSach ds) {
        this.hs = ds.hs;
    }
    public int getNumStu() {
        return 1;
    }
}
