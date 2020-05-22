package ch04;

public class r6j {
    public static void main(String[] args) {
     
        int[] angka={82,12,41,38,19,26,9,48,20,55,8,32,3};
		int hasil;
		int hasil1;
		int hasil2;
     
        for (int i = 0; i < angka.length -1; i++){
            System.out.print(angka[i]+ ",");
        }   
        
		System.out.println();
        System.out.println("selisih angka pertama, 82 dan 12");
        hasil = angka[0] - angka[1];
        System.out.println(hasil);
		System.out.println();
        
		System.out.println("selisih angka kedua, 48 dan 20");
        hasil1 = angka[7] - angka[8];
        System.out.println(hasil1);
		System.out.println();
        
		System.out.println("selisih angka ketiga, 8 dan 32");
        hasil2 = angka[10] - angka[11];
        System.out.println(hasil2);
        
     
	}
        
}
