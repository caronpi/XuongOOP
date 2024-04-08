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
public class svCoKhi extends SinhVien {

    private double diemDienTu;
    private double diemCoHoc;

    public svCoKhi() {
    }

    public svCoKhi(String MaSV, String HoTen, int namSinh, String chuyenNganh, double diemPTCN, double diemTriet, double diemTA, double diemDienTu, double diemCoHoc) {
        super(MaSV, HoTen, namSinh, chuyenNganh, diemPTCN, diemTriet, diemTA);
        this.diemDienTu = diemDienTu;
        this.diemCoHoc = diemCoHoc;
    }

    public double getDiemDienTu() {
        return diemDienTu;
    }

    public void setDiemDienTu(double diemDienTu) {
        this.diemDienTu = diemDienTu;
    }

    public double getDiemCoHoc() {
        return diemCoHoc;
    }

    public void setDiemCoHoc(double diemCoHoc) {
        this.diemCoHoc = diemCoHoc;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        String nganh = "Co Khi";
        super.setChuyenNganh(nganh);
        do {
            try {
                System.out.print("Nhap diem Dien tu: ");
                diemDienTu = sc.nextDouble();
                sc.nextLine();
                if (diemDienTu < 0 || diemDienTu > 10) {
                    System.out.println("Diem Dien tu tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemDienTu = -1;
            }
        } while (diemDienTu < 0 || diemDienTu > 10);
        do {
            try {
                System.out.print("Nhap diem Diem co hoc: ");
                diemCoHoc = sc.nextDouble();
                sc.nextLine();
                if (diemCoHoc < 0 || diemCoHoc > 10) {
                    System.out.println("Diem Diem co hoc tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemCoHoc = -1;
            }
        } while (diemCoHoc < 0 || diemCoHoc > 10);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" %-10.1f %-10.1f %-10.1f %-10s", diemDienTu, diemCoHoc, diemTB(), xepLoai());
    }

    @Override
    public double diemTB() {
        return (super.getDiemPTCN() + super.getDiemTriet() + super.getDiemTA() + diemDienTu * 2 + diemCoHoc * 2) / 7;
    }

}
