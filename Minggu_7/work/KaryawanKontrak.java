package work;

public class KaryawanKontrak extends Karyawan {
    double upahHarian;
    int jumlahHariMasuk;

    public KaryawanKontrak(String nama, String jabatan, double upahHarian, int jumlahHariMasuk) {
        super(nama, jabatan, 0, 0);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public double getTotalUpah() {
        double tunjanganAnak = getTunjangan();
        double totalUpah = upahHarian * jumlahHariMasuk + tunjanganAnak;
        return totalUpah;
    }

    public static void main(String[] args) {
        KaryawanKontrak karyawan = new KaryawanKontrak("Jamal", "Karyawan Kontrak", 200000, 20);
        karyawan.setTunjangan(100000);
        double totalUpah = karyawan.getTotalUpah();
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Jabatan: " + karyawan.getJabatan());
        System.out.println("Total Upah: " + totalUpah);
    }
}