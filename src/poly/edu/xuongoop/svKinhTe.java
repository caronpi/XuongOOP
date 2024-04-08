/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.xuongoop;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class svKinhTe extends SinhVien {

    private double diemKinhTe;
    private double diemKinhDoanh;

    public svKinhTe() {
    }

    public svKinhTe(String MaSV, String HoTen, int namSinh, String chuyenNganh, double diemPTCN, double diemTriet, double diemTA, double diemKinhTe, double diemKinhDoanh) {
        super(MaSV, HoTen, namSinh, chuyenNganh, diemPTCN, diemTriet, diemTA);
        this.diemKinhTe = diemKinhTe;
        this.diemKinhDoanh = diemKinhDoanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        String nganh = "Kinh te";
        super.setChuyenNganh(nganh);
        do {
            try {
                System.out.print("Nhap diem Kinh te: ");
                diemKinhTe = sc.nextDouble();
                sc.nextLine();
                if (diemKinhTe < 0 || diemKinhTe > 10) {
                    System.out.println("Diem Kinh te tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemKinhTe = -1;
            }
        } while (diemKinhTe < 0 || diemKinhTe > 10);
        do {
            try {
                System.out.print("Nhap diem Kinh doanh: ");
                diemKinhDoanh = sc.nextDouble();
                sc.nextLine();
                if (diemKinhDoanh < 0 || diemKinhDoanh > 10) {
                    System.out.println("Diem Kinh doanh tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemKinhDoanh = -1;
            }
        } while (diemKinhDoanh < 0 || diemKinhDoanh > 10);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" %-10.1f %-10.1f %-10.1f %-10s", diemKinhTe, diemKinhDoanh, diemTB(), xepLoai());
    }

    @Override
    public double diemTB() {
        return (super.getDiemPTCN() + super.getDiemTriet() + super.getDiemTA() + diemKinhTe * 2 + diemKinhDoanh * 2) / 7;

    }

}
