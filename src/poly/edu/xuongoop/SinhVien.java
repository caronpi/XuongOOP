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
public abstract class SinhVien {
    private String MaSV;
    private String HoTen;
    private int namSinh ;
    private String chuyenNganh;
    private double diemPTCN;
    private double diemTriet;
    private double diemTA;

    
    
    public SinhVien() {
    }

    public SinhVien(String MaSV, String HoTen, int namSinh, String chuyenNganh, double diemPTCN, double diemTriet, double diemTA) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.chuyenNganh = chuyenNganh;
        this.namSinh = namSinh;
        this.diemPTCN = diemPTCN;
        this.diemTriet = diemTriet;
        this.diemTA = diemTA;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemPTCN() {
        return diemPTCN;
    }

    public void setDiemPTCN(double diemPTCN) {
        this.diemPTCN = diemPTCN;
    }

    public double getDiemTriet() {
        return diemTriet;
    }

    public void setDiemTriet(double diemTriet) {
        this.diemTriet = diemTriet;
    }

    public double getDiemTA() {
        return diemTA;
    }

    public void setDiemTA(double diemTA) {
        this.diemTA = diemTA;
    }
    
    public abstract double diemTB();
    
    public String xepLoai(){
        if(diemTB() >= 9.5 && diemTB() <=10){
            return "Xuat Sac";
        } else if (diemTB() >= 8 && diemTB() < 9.5) {
            return "Gioi";
        } else if (diemTB() >=6.5 && diemTB() < 8) {
            return "Kha";
        } else if (diemTB() >= 5 && diemTB() < 6.5) {
            return "Trung Binh";
        } else if (diemTB() >= 2.5 && diemTB() <5) {
            return "Yeu";
        }else if (diemTB()>=0 && diemTB() <2.5) {
            return "Kem";
        }
        return "Khong xep loai";
    } 
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma Sinh Vien: ");
        MaSV = sc.nextLine();
        System.out.print("Nhap ho & ten: ");
        HoTen = sc.nextLine();
        do {            
            try {
                System.out.print("Nhap nam sinh: ");
                namSinh = sc.nextInt();
                sc.nextLine();
                if(namSinh <= 1950 || namSinh >=2024){
                    System.out.println("Nam sinh phai tu 1950 -> 2024!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
            }
        } while (namSinh <= 1950 || namSinh >2024);
        do {            
            try {
                System.out.print("Nhap diem PTCN: ");
                diemPTCN = sc.nextDouble();
                sc.nextLine();
                if(diemPTCN < 0 || diemPTCN >10){
                    System.out.println("Diem PTCN tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemPTCN = -1;
            }
        } while (diemPTCN < 0 || diemPTCN >10);
        do {            
            try {
                System.out.print("Nhap diem Triet: ");
                diemTriet = sc.nextDouble();
                sc.nextLine();
                if(diemTriet < 0 || diemTriet >10){
                    System.out.println("Diem Triet tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemTriet = -1;
            }
        } while (diemTriet < 0 || diemTriet >10);
        do {            
            try {
                System.out.print("Nhap diem TA: ");
                diemTA = sc.nextDouble();
                sc.nextLine();
                if(diemTA < 0 || diemTA >10){
                    System.out.println("Diem TA tu 0 -> 10!");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
                sc.nextLine();
                diemTA = -1;
            }
        } while (diemTA < 0 || diemTA >10);
    }
    
    public void xuat(){
        System.out.printf("\n%-10s %-20s %-10d %-10s %-10.1f %-10.1f %-10.1f"
                            ,MaSV,HoTen,namSinh,chuyenNganh,diemPTCN,diemTriet,diemTA
        );
    }
}
