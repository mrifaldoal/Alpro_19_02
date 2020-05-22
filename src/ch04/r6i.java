package ch04;

public class r6i {

    public static void main(String[] args) {
     
        int[] angka={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        int total = 0;
        System.out.println("slisih bilangan dengan angka seterusnya = ");
       
        for (int z =0; z<angka.length -1; z++){
            if(total % 1 == 0){
                total = angka[z] - angka[z +1];
            
        }
            System.out.println("bilangan sebelumnya ialah = " + angka[z]);
            System.out.println("bilangan sesudahnya ialah = " + angka[z + 1]);
            System.out.println("selisih bilangannya ialah = " + total);
           
           
            }
        
        }
}

         