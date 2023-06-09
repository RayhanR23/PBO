package hp;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();   //fitur menyalakan hp
        cp.chargeBattery(50);   //fitur charging hp
        cp.displayInfo();   //melihat informasi hp
        cp.addContact("John", 1234567890);  //menambahkan kontak
        cp.addContact("Jane", 987654320);
        cp.displayContacts();   //melihat kontak
        cp.removeContact("John");   //menghapus kontak
        cp.displayContacts();
        cp.volumeUp();  
        cp.volumeDown();
        System.out.println("Volume saat ini: " + cp.getVolume());
        cp.topUpPulsa(10000);   //fitur top up pulsa
        System.out.println("Sisa pulsa: " + cp.checkPulsa());   //melihat sisa pulsa
        cp.searchContact("Jane");   //mencari kontak
        cp.searchContact("John");
        cp.powerOff();  //mematikan hp
    }
}
