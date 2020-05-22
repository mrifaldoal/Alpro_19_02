package ch04;

public class r6i {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int hasil = 0;

        System.out.println("Selisih angka sebelum dan sesudahnya adalah: ");

        for (int i = 0; i < angka.length-1; i++) {
            
			if (hasil % 1 == 0) {
                hasil = angka[i] - angka[i + 1];
            }

            System.out.println("Angka sebelumnya: " + angka[i]);
            System.out.println("Angka sesudahnya: " + angka[i + 1]);
            System.out.println("Selisih angka adalah: " + hasil);
            System.out.println();

        }
    }
}