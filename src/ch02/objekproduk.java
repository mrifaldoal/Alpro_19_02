package ch02;

import java.util.Date;


public class objekproduk {
      public static void main (String[]args){
      produk x1 = new produk();
      x1.barcode = "42332223";
      x1.nama = "pepsodent";
      x1.tanggalkadaluarsa = new Date (2021,7,2);
      x1.harga= 8200;
      
      produk x2 = new produk();
      x2.barcode = "5122211121";
      x2.nama = "katkit";
      x2.tanggalkadaluarsa = new Date (2021,1,21);
      x2.harga= 14500;
      
        System.out.println(x1.nama + "(" + x1.barcode + ")");
        System.out.println("Harga : RP" + x1.harga);
        System.out.println("Exp :" + x1.tanggalkadaluarsa.toString());
        System.out.println("===============================");  
         System.out.println(x2.nama + "(" + x2.barcode + ")");
        System.out.println("Harga : RP" + x2.harga);
        System.out.println("Exp :" + x2.tanggalkadaluarsa.toString());     
           }
}