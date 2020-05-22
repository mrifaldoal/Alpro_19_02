package ch04;

public class r6m {
    public static void main(String[] args) {
     
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int hasil;
        int hasil1;
        int hasil2;
        int totalhasil;

        for (int i = 0; i < angka.length ; i++){
            System.out.print(angka[i]+ ",");
        }
        
		System.out.println();
        System.out.println("Angka selisih pada poin I: ");
        hasil = angka[0] - angka[1];
        System.out.println(hasil);
        
		hasil1 = angka[7] - angka[8];
        System.out.println(hasil1);
        
		hasil2 = angka[10] - angka[11];
        System.out.println(hasil2);
        System.out.println();
        
		totalhasil = hasil + hasil1 + hasil2;
        System.out.println("Jumlah angka selisih: " + totalhasil);

	}
        
}

