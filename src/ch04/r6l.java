package ch04;

public class r6l {
    public static void main(String[] args) {
     
        int [] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int hasil = 0;

        System.out.println("Angka dengan angka setelahnya yang hasil penjumlahannya adalah bilangan genap: ");

        for (int i = 0; i < angka.length-1; i++){
			hasil = angka[i] + angka[i + 1];
            if (hasil % 2 == 0) {
   				System.out.println("Angka " + angka[i] + " Dan " + angka[i+1] + " hasilnya adalah: " + hasil);
				System.out.println();
                
                
            }

		}
        
	}
        
}