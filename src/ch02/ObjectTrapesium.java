package ch02;

public class ObjectTrapesium {
    public static void main(String[] args) {
        Trapesium trapesium = new Trapesium();
        trapesium.alasbawah = 25;
        trapesium.alasatas = 18;
        trapesium.tinggi = 12;
        System.out.println("Luas = " + trapesium.luas());
    }
}