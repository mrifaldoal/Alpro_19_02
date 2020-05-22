package ch06;

public class r10b {
   

  public static void main(String[] args) {
       int []angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
	   System.out.println("algoritma insertion short dari array diatas adalah =");
        for (int  i = 1;  i < angka.length;  i++) {
            for (int j = i; j >= 1; j--) {
                
                if(angka[j] > angka[j-1]){
                    break;
                }
                    int temp = angka[j];
                    angka[j]=angka [j-1];
                    angka[j-1]=temp;
                }                
            }
              for(int i = 0; i<angka.length; i ++){
           
            System.out.print(  angka[i] +" ");

        }
        
        }
    }
    
    

    
