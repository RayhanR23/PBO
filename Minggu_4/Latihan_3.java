import java.util.Scanner;
public class Latihan_3 {
    public static void main (String [] args)
    {
        int detik,menit,jam,hari;
        char ulang;
        Scanner inp = new Scanner(System.in);

        do{

        System.out.print ("Masukkan jumlah detik yang ingin dikonversi : ");
        detik = inp.nextInt();

        menit = detik / 60;
        jam = detik / 3600;
        hari = detik / 86400;

        System.out.println ("Detik : " + detik);
        System.out.println ("Menit : " + menit);
        System.out.println ("Jam : " + jam);
        System.out.println ("Hari : " + hari);

        System.out.println ("Ingin ulang lagi [Y/T] ? ");
        ulang = inp.next().charAt(0);
        }while ((ulang != 'T')  && (ulang != 't'));
    }
}
