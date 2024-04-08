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
public class svIT extends SinhVien {

    private double diemJava;
    private double diemHTML;

    public svIT() {
    }

    public svIT(String MaSV, String HoTen, int namSinh, String chuyenNganh, double diemPTCN, double diemTriet, double diemTA, double diemJava, double diemHTML) {
        super(MaSV, HoTen, namSinh, chuyenNganh, diemPTCN, diemTriet, diemTA);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        String nganh = "IT";
        super.setChuyenNganh(nganh);
        do {
            try {
                System.out.print("Nhap diem Java: ");
                diemJava = sc.nextDouble();
                sc.nextLine();
                if (diemJava < 0 || diemJava > 10) {
                    System.out.println("Diem Java tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemJava = -1;
            }
        } while (diemJava < 0 || diemJava > 10);
        do {
            try {
                System.out.print("Nhap diem HTML: ");
                diemHTML = sc.nextDouble();
                sc.nextLine();
                if (diemHTML < 0 || diemHTML > 10) {
                    System.out.println("Diem HTML tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemHTML = -1;
            }
        } while (diemHTML < 0 || diemHTML > 10);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" %-10.1f %-10.1f %-10.1f %-10s", diemJava, diemHTML, diemTB(), xepLoai());
    }

    @Override
    public double diemTB() {
        return (super.getDiemPTCN() + super.getDiemTriet() + super.getDiemTA() + diemJava * 2 + diemHTML * 2) / 7;
    }

}
