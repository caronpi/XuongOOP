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
public class svNgonNgu extends SinhVien {

    private double diemNgonNguChinh;
    private double diemNgonNguPhu;

    public svNgonNgu() {
    }

    public svNgonNgu(String MaSV, String HoTen, int namSinh, String chuyenNganh, double diemPTCN, double diemTriet, double diemTA, double diemNgonNguChinh, double diemNgonNguPhu) {
        super(MaSV, HoTen, namSinh, chuyenNganh, diemPTCN, diemTriet, diemTA);
        this.diemNgonNguChinh = diemNgonNguChinh;
        this.diemNgonNguPhu = diemNgonNguPhu;
    }

    public double getDiemNgonNguChinh() {
        return diemNgonNguChinh;
    }

    public void setDiemNgonNguChinh(double diemNgonNguChinh) {
        this.diemNgonNguChinh = diemNgonNguChinh;
    }

    public double getDiemNgonNguPhu() {
        return diemNgonNguPhu;
    }

    public void setDiemNgonNguPhu(double diemNgonNguPhu) {
        this.diemNgonNguPhu = diemNgonNguPhu;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        String nganh = "Ngon ngu";
        super.setChuyenNganh(nganh);
        do {
            try {
                System.out.print("Nhap diem Ngon ngu chinh: ");
                diemNgonNguChinh = sc.nextDouble();
                sc.nextLine();
                if (diemNgonNguChinh < 0 || diemNgonNguChinh > 10) {
                    System.out.println("Diem Ngon ngu chinh tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemNgonNguChinh = -1;
            }
        } while (diemNgonNguChinh < 0 || diemNgonNguChinh > 10);
        do {
            try {
                System.out.print("Nhap diem Ngon ngu phu: ");
                diemNgonNguPhu = sc.nextDouble();
                sc.nextLine();
                if (diemNgonNguPhu < 0 || diemNgonNguPhu > 10) {
                    System.out.println("Diem Ngon ngu phu tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemNgonNguPhu = -1;
            }
        } while (diemNgonNguPhu < 0 || diemNgonNguPhu > 10);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" %-10.1f %-10.1f %-10.1f %-10s", diemNgonNguChinh, diemNgonNguPhu, diemTB(), xepLoai());
    }

    @Override
    public double diemTB() {
        return (super.getDiemPTCN() + super.getDiemTriet() + super.getDiemTA() + diemNgonNguChinh * 2 + diemNgonNguPhu * 2) / 7;
    }

}
