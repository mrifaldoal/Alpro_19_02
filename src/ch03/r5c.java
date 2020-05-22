package ch03;

import java.util.Scanner;

public class r5c{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int bil, hasil, pembagi;
        System.out.println("masukkan bilangan: ");
        bil = sc.nextInt();

        pembagi = 3;
        hasil = bil / pembagi;

        System.out.println( bil + " : " + pembagi + " = " + hasil);
    }
}
