/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author TuAnh
 */
public class DSSP {

    private String tennv;
    private double gia, thuenk;

    public DSSP() {
    }

    public DSSP(String tennv, double gia, double thuenk) {
        this.tennv = tennv;
        this.gia = gia;
        this.thuenk = thuenk;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getThuenk() {
        return thuenk;
    }

    public void setThuenk(double thuenk) {
        this.thuenk = thuenk;
    }

    @Override
    public String toString() {
        return "DSSP{" + "tennv=" + tennv + ", gia=" + gia + ", thuenk=" + thuenk + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập tên nhân viên :");
        tennv = sc.nextLine();
        System.out.print("mời bạn nhập giá tiền:");
        gia = sc.nextDouble();
        sc.nextLine();
        System.out.println("mời bạn nhập thuenk");
        thuenk = sc.nextDouble();

    }

    public void xuat() {
        System.out.println("Ten"+"\t"+"gia"+"\t"+"thuenk");
        System.out.println(tennv + "\t" + gia + "\t" + thuenk);
//        System.out.printf("\t%s %s %f\n",this.tennv,this.manv);

    }

}
