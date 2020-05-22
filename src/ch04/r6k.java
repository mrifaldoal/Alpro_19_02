package ch04;

public class r6k {
    public static void main(String[] args) {
     
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
     
        for (int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+ ",");
        }   
        System.out.println();
        System.out.println("Angka yang setelahnya lebih besar adalah: ");
        System.out.println(angka[1] + " setelahnya " + angka[2]);
        System.out.println(angka[4] + " setelahnya " + angka[5]);
        System.out.println(angka[6] + " setelahnya " + angka[7]);
        System.out.println(angka[8] + " setelahnya " + angka[9]);
        System.out.println(angka[10] + " setelahnya " + angka[11]);
     
	}
}

