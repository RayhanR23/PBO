import java.util.Scanner;

class Penjualan {
    
    String kode,nama;
    int jumlah,totalBarang = 0;
    float harga,totalHarga = 0;

    public void setData (String kode,String nama,float harga,int jumlah)
        {
            System.out.println ("Kode Barang : "+kode+"  Nama Barang : "+nama+"  Harga Barang : "+harga+"  Jumlah Barang : "+jumlah);                    

        }
    
    public void totalPembelian ()
        {
            totalHarga += harga;
            totalBarang += jumlah;

            System.out.println("Total harga : "+totalHarga);
            System.out.println("Total Barang : "+totalBarang);
           

        }
    
    public  void getBonus ()
    {
        
        if ((totalHarga >= 500000)&&(totalBarang >5))
        {
            System.out.println ("Selamat anda mendapatkan bonus Setrika!!!");            
        }else if ((totalHarga >= 100000)&&(totalBarang >3))
        {
            System.out.println ("Selamat anda mendapatkan bonus Payung!!!");            
        }else if ((totalHarga >= 50000)||(totalBarang >2))
        {
            System.out.println ("Selamat anda mendapatkan bonus Pulpen!!!");            
        }else {
            System.out.println ("Anda tidak mendapatkan bonus apapun");            
        }
    }

    public void cetakNota ()
    {
        System.out.println("Total barang yang dipesan adalah "+ totalBarang + " dengan keterangan barang sebagai berikut");
        System.out.println("Barang : "+ nama);
        System.out.println("Dengan Total Harga :" + totalHarga);
        
    }    
 }
public class Latihan_1 {
    public static void main (String[]args)
    {
        char ulang;
        float totalHarga;
        int totalBarang;

        Scanner inp = new Scanner(System.in);
        Penjualan baju = new Penjualan();
        Penjualan celana = new Penjualan();
        Penjualan jaket = new Penjualan();
        Penjualan topi = new Penjualan();

        baju.kode = "A001";
        baju.nama = "Polo T-Shirt";
        baju.harga = 75000;
        baju.jumlah = 1;
        baju.setData(baju.kode,baju.nama,baju.harga,baju.jumlah);

        celana.kode = "B001";
        celana.nama = "Levis jeans";
        celana.harga = 100000;
        celana.jumlah = 1;
        celana.setData(celana.kode,celana.nama,celana.harga,celana.jumlah);

        jaket.kode = "C001";
        jaket.nama = "Aeger Hoodie";
        jaket.harga = 125000;
        jaket.jumlah = 1;
        jaket.setData(jaket.kode,jaket.nama,jaket.harga,jaket.jumlah);

        
        topi.kode = "D001";
        topi.nama = "Yankee with no brim";
        topi.harga = 20000;
        topi.jumlah = 1;
        topi.setData(topi.kode,topi.nama,topi.harga,topi.jumlah);
        
        do
        {
            int pilihan;
            do{ 
            System.out.print ("Silahkan untuk memilih barang yang ingin dibeli (pilih 5 jika sudah selesai) : ");
            pilihan = inp.nextInt();              
                switch (pilihan){

                    case 1 : baju.setData(baju.kode,baju.nama,baju.harga,baju.jumlah); baju.totalPembelian(); break;
                    case 2 : celana.setData(celana.kode,celana.nama,celana.harga,celana.jumlah);celana.totalPembelian();break;
                    case 3 :jaket.setData(jaket.kode,jaket.nama,jaket.harga,jaket.jumlah); jaket.totalPembelian();break;
                    case 4 : topi.setData(topi.kode,topi.nama,topi.harga,topi.jumlah); topi.totalPembelian();break;
                    case 5 : System.out.println ("Selesai memesan");break;
                }
            }while (pilihan !=5);  

            totalHarga =  baju.totalHarga+celana.totalHarga+jaket.totalHarga+topi.totalHarga;
            totalBarang = baju.totalBarang+celana.totalBarang+jaket.totalBarang+topi.totalBarang;
            System.out.println ("Total Harga : "+totalHarga);
            System.out.println ("Total Barang : "+totalBarang);

            if ((totalHarga >= 500000)&&(totalBarang >5))
        {
            System.out.println ("Selamat anda mendapatkan bonus Setrika!!!");            
        }else if ((totalHarga >= 100000)&&(totalBarang >3))
        {
            System.out.println ("Selamat anda mendapatkan bonus Payung!!!");            
        }else if ((totalHarga >= 50000)||(totalBarang >2))
        {
            System.out.println ("Selamat anda mendapatkan bonus Pulpen!!!");            
        }else {
            System.out.println ("Anda tidak mendapatkan bonus apapun");            
        }
            
            System.out.println("Apakah and ingin mengulang [Y/T]:");
            ulang = inp.next().charAt(0);
        }while ((ulang != 'T')  && (ulang != 't'));
    }
}
