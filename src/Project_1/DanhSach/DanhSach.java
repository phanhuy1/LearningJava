package Project_1.DanhSach;

import Project_1.HocSinh.HocSinh;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

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
    private ArrayList<HocSinh> hocSinhArrayList = null;
    /**
     *  Default constructor of class DanhSach
     *
     */
    public DanhSach() {
        this.hocSinhArrayList = new ArrayList<HocSinh>();
    }

    public boolean addStudent(int i, HocSinh student) {
        if (student == null || hocSinhArrayList.contains(student)) {
            return false;
        }
        hocSinhArrayList.add(i, student);
        return true;
    }

    public ArrayList<HocSinh> getHocSinhArrayList() {
        return hocSinhArrayList;
    }

    public HocSinh getStudent(int i) {
        return this.hocSinhArrayList.get(i);
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

}
