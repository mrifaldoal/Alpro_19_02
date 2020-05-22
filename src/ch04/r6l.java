package ch04;

public class r6l {
    public static void main(String[] args) {
     
        int[] angka={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
	int hasil = 0;

	System.out.println("jumlah angka dengan angka setelahnya yang hasil penjumlahan nya bernilai genap =");
     
        for (int z =0; z<angka.length -1; z++){
		hasil = angka[z] + angka [z + 1];
			if (hasil % 2 == 0) {
            System.out.println("angka" + angka[z]+ "dan" + angka[z + 1] + "hasilnya adalah = " + hasil);
		System.out.println();
        }   
        
        
            }
        
        }
}