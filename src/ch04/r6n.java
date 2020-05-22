package ch04;

public class r6n {

    public static void main(String[] args) {
        int [] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int hasil = 0;



        for (int i = 0; i < angka.length; i++){
            System.out.print("Hasil jumlah " + angka[i] + " dengan angka-angka sebelumnya: ");

            System.out.println(angka[i] + hasil);
            hasil = hasil + angka[i];


        }

    }

}