package ch04;

public class r6f {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};


        System.out.println("Angka ganjil yang diapit angka genap adalah: ");

        for (int i = 0; i < angka.length; i++) {
            if(angka[i] % 2 != 0){
                if(angka[i] > 3){
                }
                System.out.println(angka[i]);
            }

        }
        System.out.println();
    }
}