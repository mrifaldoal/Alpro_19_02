package ch04;

public class r6f {

  
  public static void main(String[] args) {
     
        int[] angka={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
       
        System.out.println("bilangan diatas yang diapit angka genap = ");
        
        for (int z =0; z<angka.length; z++){
            if(angka[z] % 2!=0){
                if(angka[z]>3){
                System.out.print(angka[z]+" ");
           
            }
        
        }
         
      
        }
    }
}


    

