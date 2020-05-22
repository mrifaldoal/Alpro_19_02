package ch03;

import java.util.Scanner;



public class r5a {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("MAsukkan nilai x");
        int x = input.nextInt();
        System.out.println("Masukkan nilai y");
        int y = input.nextInt();    
        
        if(x>y){
            System.out.println("Maka nilai x la tertinggi");
        
        }else {
            System.out.println("maka nilai y tertinggi");
        }
        
        
    }
    
}
