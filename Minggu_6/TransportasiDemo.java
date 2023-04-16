import Transportasi.*;
public class TransportasiDemo {
    public static void main (String[]args){
        Kendaraan mobil = new Kendaraan();
        Kendaraan motor = new Kendaraan();
        Kendaraan sepeda = new Kendaraan();
        motor.warna = "Hitam";
        motor.merk = "Yamaha Mio";
        motor.roda = 2;
        motor.infoKendaraan();
        mobil.warna = "Merah";
        mobil.merk = "Toyota Inova";
        mobil.roda = 4;
        mobil.infoKendaraan();
        mobil.berjalan ("Depan");
        mobil.berhenti();        
        mobil.kecepatan = 20;
        sepeda.kecepatan = 5;
        System.out.println ("Kecepatan awal "+mobil.kecepatan);
        int kecepatan = mobil.kecepatanSekarang (10,"lambat");
        System.out.println ("Kecepatan kendaraan adalah "+kecepatan);
        mobil.mundur();
        System.out.println ("Kecepatan sekarang setelah mundur "+mobil.kecepatan);
    }
}
