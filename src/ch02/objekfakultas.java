package ch02;

public class objekfakultas {
    public static void main (String[]args){
        fakultas f1 = new fakultas();
       fakultas f2= new fakultas();
       
        
        f1.nama ="Sains Teknologi";
        f1.jumlahmahasiswa=2354;
        
        f2.nama ="Psikolog";
        f2.jumlahmahasiswa=1202;
        
        System.out.println("Fakultas" + f1.getNama() + ":" + f1.getJumlahmahasiswa());
        System.out.println("Fakultas" + f2.getNama() + ":" + f2.getJumlahmahasiswa());
           }
}
