package ch04;

public class r6e {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        String cari = "2";

        System.out.println("Angka yang mempunyai angka 2 adalah: ");

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 10 == 2 || angka[i] / 10 == 2) {
                System.out.println(angka[i] + " ");

            }

        }
        System.out.println();
    }
}