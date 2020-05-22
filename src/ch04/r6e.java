package ch04;

public class r6e{

    public static void main(String[] args) {
     
        int[] angka={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        String a = "2";
        System.out.println("bilangan diatas yang memilki anggka 2 =");
        
        for (int z =0; z<angka.length; z++){
            if(String.valueOf(angka[z]).startsWith(a) || String.valueOf(angka[z]).endsWith(a)){
                System.out.print(angka[z]+ " ");
           
            }
        
        }
         
        System.out.println();
                
    }

}    
    

