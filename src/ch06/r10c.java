package ch05;


public class r10c {
  

  public static void main(String[] args) {
       int []angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("algoritma selection short dari array diatas adalah =");
        for (int  i = 0;  i < angka.length-1;  i++) {
            int max = i;
            for (int j = i; j < angka.length; j++) {
                if(angka[j] < angka[max]){
                    max = j;
                }
                 
            }
            
                    int temp = angka[i];
                    angka[i]=angka [max];
                    angka[max]=temp;
                    
                }
                for(int i = 0; i<angka.length; i++){
            
            System.out.print( angka[i] +" ");
            }
             
        }
       
        }

    

