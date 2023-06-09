package hp;

import java.lang.Math;
import java.util.ArrayList;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;
    private ArrayList<Contact> contacts;
    private int pulsa;

    public Cellphone(String merk, String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);
        contacts = new ArrayList<>();
        this.pulsa = 0;
    }

    public void addContact(String nama, Integer nomor) {     //fitur menyimpan kontak baru
        Contact contact = new Contact(nama, nomor);
        contacts.add(contact);
        System.out.println("Kontak berhasil ditambahkan");
    }

    public void displayContacts() {     //fitur menampilkan daftar kontak
        System.out.println("Daftar Kontak:");
        for (Contact contact : contacts) {
            System.out.println("Nama: " + contact.getNama());
            System.out.println("Nomor: " + contact.getNomor());
            System.out.println();
        }
    }

    public void removeContact(String nama) {        //fitur menghapus kontak
        for (Contact contact : contacts) {
            if (contact.getNama().equals(nama)) {
                contacts.remove(contact);
                System.out.println("Kontak berhasil dihapus");
                return;
            }
        }
        System.out.println("Kontak dengan nama " + nama + " tidak ditemukan");
    }

    public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        if (batteryLevel <= 0) {
            this.status = 0;
            System.out.println("Ponsel mati karena baterai habis");
        } 
        else if (batteryLevel > 0) {
            this.status = 0;
            System.out.println("Ponsel dimatikan");
        }
    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown(){
        this.volume--;
    }

    public int getVolume(){
        return this.volume;
    }

    public void displayInfo() {     //fitur menampilkan informasi ponsel
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + type);
        System.out.println("Tingkat Baterai: " + batteryLevel);
    }

    public void chargeBattery(int i) {       //fitur mengisi baterai ponsel
        batteryLevel += i;
        /*if (batteryLevel > MAX_BATT_LEVEL) {
            batteryLevel = MAX_BATT_LEVEL;
        }*/
        System.out.println("Baterai ponsel terisi sebesar " + i + "%. Tingkat baterai sekarang: " + i + "%");
    }
  
    public void topUpPulsa(int amount) {     //fitur top up pulsa
        pulsa += amount;
        System.out.println("Pulsa berhasil ditambahkan sebesar " + amount);
    }

    public int checkPulsa() {     //fitur melihat sisa pulsa
        return pulsa;
    }

    public void searchContact(String nama) {     //fitur mencari kontak berdasarkan nama
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Kontak dengan nama " + nama + " ditemukan. Nomor: " + contact.getNomor());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kontak dengan nama " + nama + " tidak ditemukan");
        }
    }
}
