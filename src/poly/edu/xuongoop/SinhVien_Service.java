/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.xuongoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class SinhVien_Service {

    ArrayList<SinhVien> list = new ArrayList<>();

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Chon chuyen nganh: ");
            System.out.println("0. Thoat | 1. IT | 2. Marketing | 3. Ngon ngu | 4. Kinh te | 5. Co khi  ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    svIT it = new svIT();
                    it.nhap();
                    list.add(it);
                    break;

                case 2:
                    svMkt mk = new svMkt();
                    mk.nhap();
                    list.add(mk);
                    break;

                case 3:
                    svNgonNgu nn = new svNgonNgu();
                    nn.nhap();
                    list.add(nn);
                    break;

                case 4:
                    svKinhTe kt = new svKinhTe();
                    kt.nhap();
                    list.add(kt);
                    break;

                case 5:
                    svCoKhi ck = new svCoKhi();
                    ck.nhap();
                    list.add(ck);
                    break;

                default:
                    System.out.println("Ngoai chuong trinh!");
            }
            if (chon == 0) {
                break;
            }
        } while (true);
    }

    public void xuatDanhSach() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                    "MaSV", "HoTen", "NamSinh", "Nganh", "PTCN", "Triet", "TiengAnh", "C.Nganh 1", "C.Nganh 2", "DiemTB", "XepLoai");
            for (SinhVien sv : list) {
                xuat1(sv);
            }
        }
    }

    public void xuat1(SinhVien sv) {
        if (sv instanceof svIT) {
            ((svIT) sv).xuat();
        } else if (sv instanceof svMkt) {
            ((svMkt) sv).xuat();
        } else if (sv instanceof svNgonNgu) {
            ((svNgonNgu) sv).xuat();
        } else if (sv instanceof svKinhTe) {
            ((svKinhTe) sv).xuat();
        } else if (sv instanceof svCoKhi) {
            ((svCoKhi) sv).xuat();
        }
    }

    public void nhap1(SinhVien sv) {
        if (sv instanceof svIT) {
            ((svIT) sv).nhap();
        } else if (sv instanceof svMkt) {
            ((svMkt) sv).nhap();
        } else if (sv instanceof svNgonNgu) {
            ((svNgonNgu) sv).nhap();
        } else if (sv instanceof svKinhTe) {
            ((svKinhTe) sv).nhap();
        } else if (sv instanceof svCoKhi) {
            ((svCoKhi) sv).nhap();
        }
    }

    public void timSV() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ma SV can tim: ");
            String id = sc.nextLine();
            boolean flag = false;
            for (SinhVien sv : list) {
                if (sv.getMaSV().equalsIgnoreCase(id)) {
                    System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                    "MaSV", "HoTen", "NamSinh", "Nganh", "PTCN", "Triet", "TiengAnh", "C.Nganh 1", "C.Nganh 2", "DiemTB", "XepLoai");
                    xuat1(sv);
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("Khong tim thay sinh vien! ");
            }
        }
    }

    public void xoaSV() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ma SV can xoa: ");
            String id = sc.nextLine();
            boolean flag = false;
            for (SinhVien sv : list) {
                if (sv.getMaSV().equalsIgnoreCase(id)) {
                    list.remove(sv);
                    System.out.println("Da xoa sinh vien co ma SV: " + id);
                    xuatDanhSach();
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("Khong tim thay sinh vien! ");
            }
        }
    }

    public void capNhat() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ma nv can cap nhat:");
            String id = String.valueOf(sc.nextLine());
            boolean flag = false;
            for (SinhVien sv : list) {
                if (id.equalsIgnoreCase(sv.getMaSV())) {
                    if (sv instanceof svIT) {
                        ((svIT) sv).nhap();
                    } else if (sv instanceof svMkt) {
                        ((svMkt) sv).nhap();
                    } else if (sv instanceof svKinhTe) {
                        ((svKinhTe) sv).nhap();
                    } else if (sv instanceof svNgonNgu) {
                        ((svNgonNgu) sv).nhap();
                    } else if (sv instanceof svCoKhi) {
                        ((svCoKhi) sv).nhap();
                    }
                    xuatDanhSach();
                }
                flag = true;

            }
            if (flag == false) {
                System.out.println("Khong tim thay sinh vien ");
            }
        }
    }

    public void timDiem() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            Scanner sc = new Scanner(System.in);
            double start, end;
            do {
                do {
                    System.out.println("Nhap khoang diem bat dau:");
                    start = sc.nextDouble();
                } while (start < 0 || start > 10);
                do {
                    System.out.println("Nhap khoang diem ket thuc:");
                    end = sc.nextDouble();
                } while (end < 0 || end > 10);
                if (start > end) {
                    System.out.println("nhap lai");
                } else {
                    break;
                }
            } while (true);
            boolean flag = false;
            for (SinhVien sv : list) {
                if (sv.diemTB() >= start && sv.diemTB() <= end) {
                    System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                            "MaSV", "HoTen", "NamSinh", "Nganh", "Toan", "Triet", "TiengAnh", "Diem 1", "Diem 2", "DiemTB", "XepLoai");
                    break;
                }
            }
            for (SinhVien sv : list) {
                if (sv.diemTB() >= start && sv.diemTB() <= end) {
                    xuat1(sv);
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("Khong tim thay sinh vien ");
            }
        }
    }

    public void sapXepTen() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            Collections.sort(list, (sv1, sv2) -> sv1.getHoTen().compareTo(sv2.getHoTen()));
            xuatDanhSach();
        }
    }

    public void sapxepDiemTB() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            Collections.sort(list, (sv1, sv2) -> Double.compare(sv1.diemTB(), sv2.diemTB()));
            xuatDanhSach();
        }
    }

    public void soLuong() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            int soLuong;
            soLuong = list.size();
            System.out.println("So luong sinh vien: " + soLuong);
        }
    }

    

    public void SVDiemCaoNhat() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            System.out.println("Sinh vien co diem cao nhat");
            Collections.sort(list, (sv1, sv2) -> Double.compare(sv2.diemTB(), sv1.diemTB()));
            System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                    "MaSV", "HoTen", "NamSinh", "Nganh", "PTCN", "Triet", "TiengAnh", "C.Nganh 1", "C.Nganh 2", "DiemTB", "XepLoai");
            for (SinhVien sinhVien : list) {
                xuat1(sinhVien);
                break;
            }
        }
    }
    
    public void SVDiemThapNhat() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            System.out.println("Sinh vien co diem thap nhat");
            Collections.sort(list, (sv1, sv2) -> Double.compare( sv1.diemTB(), sv2.diemTB()));
            System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                    "MaSV", "HoTen", "NamSinh", "Nganh", "PTCN", "Triet", "TiengAnh", "C.Nganh 1", "C.Nganh 2", "DiemTB", "XepLoai");
            for (SinhVien sinhVien : list) {
                xuat1(sinhVien);
                break;
            }
        }
    }
    
    
    
    public void clear(){
        Scanner sc = new Scanner(System.in);
        String hoi = "";
        System.out.println("Ban co muon xoa toan bo sinh vien");
        try {
            System.out.println("1. Co | 0. Khong");
            hoi = sc.nextLine();
            if(hoi.equalsIgnoreCase("1")){
                list.clear();
                System.out.println("Da xoa toan bo sinh vien");
            } else {
                System.out.println("Khong xoa sinh vien");
            }
        } catch (Exception e) {
            System.out.println("Nhap loi");
            return;
        }
    }
}
