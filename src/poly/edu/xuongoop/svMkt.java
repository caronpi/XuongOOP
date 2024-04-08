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
public class svMkt extends SinhVien {

    private double diemMarketing;
    private double diemSale;

    public svMkt() {
    }

    public svMkt(String MaSV, String HoTen, int namSinh, String chuyenNganh, double diemPTCN, double diemTriet, double diemTA, double diemMarketing, double diemSale) {
        super(MaSV, HoTen, namSinh, chuyenNganh, diemPTCN, diemTriet, diemTA);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        String nganh = "Marketing";
        super.setChuyenNganh(nganh);
        do {
            try {
                System.out.print("Nhap diem Marketing: ");
                diemMarketing = sc.nextDouble();
                sc.nextLine();
                if (diemMarketing < 0 || diemMarketing > 10) {
                    System.out.println("Diem Marketing tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemMarketing = -1;
            }
        } while (diemMarketing < 0 || diemMarketing > 10);
        do {
            try {
                System.out.print("Nhap diem Sale: ");
                diemSale = sc.nextDouble();
                sc.nextLine();
                if (diemSale < 0 || diemSale > 10) {
                    System.out.println("Diem Sale tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemSale = -1;
            }
        } while (diemSale < 0 || diemSale > 10);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" %-10.1f %-10.1f %-10.1f %-10s", diemMarketing, diemSale, diemTB(), xepLoai());
    }

    @Override
    public double diemTB() {
        return (super.getDiemPTCN() + super.getDiemTriet() + super.getDiemTA() + diemMarketing * 2 + diemSale * 2) / 7;
    }

}
