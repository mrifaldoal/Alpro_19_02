package ch02;

public class objekjurusan {
    public static void main (String[]args){
        jurusan j1 = new jurusan();
        jurusan j2= new jurusan();
        jurusan j3 = new jurusan();
        
        j1.nama ="Teknik Informatika";
        j1.akreditasi="A";
        j1.jumlahmahasiswa=1200;
        
        j2.nama ="Sistem Informasi";
        j2.akreditasi="A";
        j2.jumlahmahasiswa=1090;
        
        j3.nama ="Teknik Elekto";
        j3.akreditasi="A";
        j3.jumlahmahasiswa=750;
        
        System.out.println("Jurusan 1");
        System.out.println("Nama : " +j1.getNama());
        System.out.println("akreditasi :" + j1.getAkreditasi());
        System.out.println("jumlah :" +j1.getJumlahmahasiswa());
        
        System.out.println("Jurusan 2");
        System.out.println("Nama : " +j2.getNama());
        System.out.println("akreditasi :" + j2.getAkreditasi());
        System.out.println("jumlah :" +j2.getJumlahmahasiswa());
        
        System.out.println("Jurusan 3");
        System.out.println("Nama : " +j3.getNama());
        System.out.println("akreditasi :" + j3.getAkreditasi());
        System.out.println("jumlah :" +j3.getJumlahmahasiswa());
           }
}

