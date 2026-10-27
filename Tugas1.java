import java.util.Scanner;
public class Tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTiket, totalTiket=0, hrgTiket=50000;
        double total=0, pendapatanKotorHarian=0;

        do {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk menghentikan program dan melihat penjualan harian) : ");
            jmlTiket = sc.nextInt();

            if (jmlTiket<0){
                continue;
            }

            if (jmlTiket>10){
                total = (jmlTiket*hrgTiket)*0.85;
                pendapatanKotorHarian += total;
                totalTiket += jmlTiket;
            } else if (jmlTiket>4){
                total = (jmlTiket*hrgTiket)*0.90;
                pendapatanKotorHarian += total;
                totalTiket += jmlTiket;
            } else {
                total = jmlTiket*hrgTiket;
                pendapatanKotorHarian += total;
                totalTiket += jmlTiket;
            }

        System.out.println("\nPesan tiket berjumlah : " + jmlTiket);
        System.out.println("Total : Rp" + total);
        }
        while (jmlTiket!=0);
        System.out.println("\nPenjualan tiket harian berjumlah : " + totalTiket);
        System.out.println("Pengahasilan kotor penjualan tiket harian : Rp" + pendapatanKotorHarian);
        sc.close();


    }
}