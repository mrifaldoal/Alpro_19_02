package ch04;

public class r6j {
    public static void main(String[] args) {
     
        int[] angka={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
     
        for (int z =0; z<angka.length -1; z++){
            System.out.print(angka[z]+ ",");
        }   
        System.out.println(" ");
        System.out.println("selisih 1 ( 82 -12)");
        int hasil = angka[0]-angka[1];
        System.out.println(hasil); 
        System.out.println("selisih 2 (48-20)");
        int hasil1 = angka[7]-angka[8];
        System.out.println(hasil1);
       System.out.println("selisih 3 (8-32)");
        int hasil2 = angka[10]-angka[11];
        System.out.println(hasil2);
        
     
            }
        
        }
