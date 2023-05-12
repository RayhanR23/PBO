package UTS_13781;

public class MahasiswaLulus extends Mahasiswa{
    int tahunWisuda;
    float ipk;

    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }

    public boolean ikutWisuda() {
        return true;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda : "+ tahunWisuda);
        System.out.println("IPK : "+ ipk);
        System.out.println("Tipe Mahasiswa = Mahasiswa Lulus");
    }
}
