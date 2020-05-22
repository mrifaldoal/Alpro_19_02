package ch04;

public class r6c {

    public static void main(String[] args) {
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        System.out.println("Bilangan Ganjil adalah: ");

        for(int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 != 0) {
                System.out.println(angka[i]);
            }
        }
    }
}
