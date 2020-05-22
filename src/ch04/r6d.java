package ch04;

public class r6d {

  
    public static void main(String[] args) {
     
        int[] angka={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
       
        System.out.println("bilangan diatas yang memiliki kelipatan 3 =");
        
        for (int z =0; z<angka.length; z++){
            if(angka[z] % 3 == 0){
                System.out.print(angka[z]+" ");
           
            }
        
        }
         
      
    }
}
    