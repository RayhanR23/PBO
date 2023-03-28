import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Latihan_2 {
    public static void main (String [] args)
    {
        char ulang;
        float D,a,b,c,x1,x2;
        Scanner inp = new Scanner(System.in);
        System.out.println ("Penentuan Rumus ABC");
        do{
            System.out.print ("Masukkan nilai A :");
            a = inp.nextInt();
            System.out.print ("Masukkan nilai B :");
            b = inp.nextInt();
            System.out.print ("Masukkan nilai C :");
            c = inp.nextInt();
            
            D = (b*b) - 4*a*c;

            System.out.println ("Nilai Determinan : " + D);
            if (D > 0)
            {
                x1 = (float) (-b + sqrt(D))/(2*a);
                x2 = (float) (-b - sqrt(D))/(2*a);

                System.out.println ("Nilai Persamaan Kuadrat  adalah");
                System.out.println ("X1 : " + x1 + "\nX2 : "  + x2);
            }else if (D == 0)
            {
                x1 = x2 = -b/2*a;
                System.out.println ("Nilai Persamaan Kuadrat  adalah");
                System.out.println ("X1 : " + x1 + "\nX2 : "  + x2);
            }else if ( D < 0)
            {
                System.out.println ("Nilai Persamaan Kuadrat  Tidak Real / Imajiner");                
            }

            System.out.println ("Ingin coba lagi [Y/T] ? :");
            ulang = inp.next().charAt(0);
            }while ((ulang != 'T')  && (ulang != 't'));
        }
}
