package code_review;
import java.util.*;
public class QuanLyDiemSinhVien {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuong = sc.nextInt();
        sc.nextLine(); 

        sinhvien[] danhSachSinhVien = new sinhvien[soLuong];

        nhapDanhSachSinhVien(danhSachSinhVien);

        
        System.out.println("Thông tin và xếp loại điểm của sinh viên:");
        xuatds(danhSachSinhVien);
    }

    public static void nhapDanhSachSinhVien(sinhvien[] danhSachSinhVien) {
        for (int i = 0; i < danhSachSinhVien.length; i++) {
            System.out.print("Nhập thông tin cho sinh viên thứ " + (i) + ":");
            danhSachSinhVien[i] = nhap();
        }
    }

    public static sinhvien nhap() {
        System.out.print("Nhập tên sinh viên: ");
        String ten = sc.nextLine();
        System.out.print("Nhập điểm môn toán của sinh viên: ");
        int diemtoan = sc.nextInt();
        System.out.print("Nhập điểm môn anh của sinh viên: ");
        int diemanh = sc.nextInt();
        System.out.print("Nhập điểm môn lý của sinh viên: ");
        int diemly = sc.nextInt();
        sc.nextLine(); 
        return new sinhvien(ten, diemtoan,diemly,diemanh);
    }

    public static void xuatds(sinhvien[] danhSachSinhVien) {
        for (sinhvien sv : danhSachSinhVien) {
        	xuat(sv);
        }
    }

    public static void xuat(sinhvien sv) {
        System.out.print("Tên sinh viên: " + sv.getDiemAnh());
        System.out.println("Điểm môn toán :"+sv.getten());
        System.out.print("Điểm môn anh: " + sv.getDiemToan());
        System.out.print("Điểm môn lý: " + sv.getDiemToan());
        System.out.println("điểm trung bình :"+sv.tinhDiemTrungBinh());
        System.out.print("Xếp loại: " + xeploaidiem(sv.tinhDiemTrungBinh()));
        System.out.println();
    }

    public static String xeploaidiem(double diem) {
        if (diem >= 1 && diem <= 4) {
            return "khá";
        } else if (diem >= 5 && diem <= 7) {
            return "giỏi";
        } else {
            return "trung bình";
        }
    }
}

class sinhvien {
    private String ten;
    private int diemtoan;
    private int diemanh;
    private int diemly;

    public sinhvien(String ten, int diem, int diemly, int diemanh) {
        this.ten = ten;
        this.diemtoan = diemtoan;
        this.diemanh = diemanh;
        this.diemly=diemly;
    }

    public String getten() {
        return ten;
    }

    public String getTen() {
        return ten;
    }

    public double getDiemToan() {
        return diemtoan;
    }

    public double getDiemAnh() {
        return diemanh;
    }

    public double getDiemLy() {
        return diemly;
    }

    public double tinhDiemTrungBinh() {
        return (diemtoan + diemanh + diemly) / 3;
    }
}