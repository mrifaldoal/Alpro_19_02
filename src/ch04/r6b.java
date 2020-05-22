package ch04;

public class r6b {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int cari = 20;
        for (int i = 0; i < angka.length; i++){
            if(angka[i] == cari ){
                System.out.println("Angka " + cari + " ditemukan di indeks " + i);
            }

        }
    }
}