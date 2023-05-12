package UTS_13781;

public class MahasiswaAktif extends Mahasiswa{

public MahasiswaAktif(String nim, String nama, int semester, int usia, String[] krs)
{
    super(nim, nama, semester, usia, krs);
}

public void infoMahasiswa()
{
    super.infoMahasiswa();
    System.out.println("Tipe Mahasiswa = Mahasiswa Aktif");
}
}
