package ch05;

import java.util.Scanner;

public class r73lcs {
    public static int LcsLenght(String a, String b, int x, int y){

        if (x == 0 || y == 0) {
            return 0;
        }
        if (a.charAt(x - 1) == b.charAt(y - 1)){
            return LcsLenght(a, b , x-1, y-1)+1;
        }
        return Integer.max(LcsLenght(a, b, x, y-1), LcsLenght(a, b, x - 1, y));
        }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     String a;
     String b;

        System.out.print("Masukkan Kata A = ");
        a = sc.nextLine();
        System.out.print("Masukkan Kata B = ");
        b = sc.nextLine();

        System.out.println("Karakter Yang Sama Yaitu "+LcsLenght(a, b, a.length(), b.length()));
    }
}