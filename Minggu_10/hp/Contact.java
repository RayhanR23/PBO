package hp;

public class Contact {
    String nama;
    Integer nomor;

    public Contact(String nama, Integer nomor2)
    {
        this.nama = nama;
        this.nomor = nomor2;
    }

    String getNama()
    {
        return this.nama;
    }

    Integer getNomor()
    {
        return this.nomor;
    }

}