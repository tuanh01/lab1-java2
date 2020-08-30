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
public class main {

    public static void main(String[] args) {
     DSSP ds=new DSSP();
      Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số lượng ? : ");
        int z = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < z; i++) {
            System.out.println("");
            System.out.println("mời bạn nhập nhân viên số : " + (i + 1));
        
     ds.nhap();
       ds.xuat();   
           }
    
    }
    
}
