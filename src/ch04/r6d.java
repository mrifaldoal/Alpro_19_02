package ch04;

public class r6d {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        System.out.println("Angka kelipatan 3 adalah: ");

        for (int i =0; i < angka.length; i++){
            if(angka[i] % 3 == 0){
                System.out.print(angka[i]);
                System.out.println();

            }

        }

    }
}