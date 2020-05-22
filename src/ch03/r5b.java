package ch03;

import java.util.Scanner;


public class r5b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai x");
        int x = input.nextInt();
        System.out.println("Masukkan nilai y");
        int y = input.nextInt();
        System.out.println("Masukkan nilai z");
        int z = input.nextInt();
        
        if(x>y && x>z){
            System.out.println("Maka nilai x la paling tinggi");
        }else if (y>x && y>z){
            System.out.println("maka nilai y paling tinggi");
            
        }else{
            System.out.println("Maka nilai z paling tinggi");
        }
    }
    
}
