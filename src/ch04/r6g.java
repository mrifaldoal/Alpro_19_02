package ch04;

public class r6g {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};


        System.out.println("Angka kelipatan 5 yang sebelumnya juga kelipatan 5 adalah: ");

        for (int i = 0; i < angka.length; i++) {
            if(angka[i] % 5 == 0){
                if(angka[i - 1] % 5 == 0)
                    System.out.println(angka[i] + " ");

            }

        }
        System.out.println();
    }
}