package ch04;

public class r6b {

  
    public static void main(String[] args) {
     
        int[] bil={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int pencari=  9;
        
        for (int z =0;z<bil.length; z++){
            if(bil[z]== pencari){
                System.out.println(" angka "  +  pencari + " ditemukan di indeks " + z);
            }
        
        }
         
        
                
    }

    
    
}
