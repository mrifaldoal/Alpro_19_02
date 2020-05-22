package ch04;

public class r6m {
    public static void main(String[] args) {
     
        int[] angka={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
     
        for (int z =0; z<angka.length ; z++){
            System.out.print(angka[z]+ ",");
        }   
        System.out.println(" ");
        System.out.println("menghitung jumlah anga selisih padda poin i");
       int hasil = angka[0]-angka[1];
        System.out.println(hasil);
        int hasil1 = angka[7]-angka[8];
        System.out.println(hasil1);
        int hasil2 = angka[10]-angka[11];
        System.out.println(hasil2);
        int hasil3 = hasil+hasil1+hasil2;
        System.out.println(hasil3);
     
            }
        
        }

