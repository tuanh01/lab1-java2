/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author TuAnh
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        product pr = new product();
        pr.select();
        pr.phuongthuc();
        pr.insert();
        pr.update();
        //gọi phương thức static bang 2 cách không cần tạo đối tượng
        //product.phuongthuc();
    }
    
}
