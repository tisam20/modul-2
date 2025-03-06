import java.util.Scanner;

public class ManajemenKeuangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();
        double usiaDouble = (double) usia;
        
        System.out.print("Masukkan jumlah uang yang dimiliki: ");
        double uangDouble = scanner.nextDouble();
        int uang = (int) uangDouble;
        
        System.out.print("Masukkan rata-rata pengeluaran harian: ");
        double pengeluaranHarian = scanner.nextDouble();
        
        double sisaUang = uang - (pengeluaranHarian * 30);
        double estimasi = uang / (pengeluaranHarian * 30);
        String statusKeuangan = estimasi < 1 ? "PERINGATAN: Keuangan Anda kurang stabil!" :
                                 (estimasi > 6 ? "Keuangan Anda dalam kondisi aman." : "Keuangan Anda cukup stabil.");
        
        boolean lebihDari30 = usia > 30;
        boolean lebihDanBanyak = usia > 30 && uang > 10_000_000;
        boolean kurangAtauCukup = usia < 30 || uang > 5_000_000;
        
        System.out.print("Masukkan jumlah hutang: ");
        int hutang = scanner.nextInt();
        int hutangAbsolut = Math.abs(hutang);
        int pengeluaranBulat = (int) Math.ceil(pengeluaranHarian);
        
        int bonusTakTerduga = (int) Math.ceil(100_000 + (900_000 * Math.random()));
        
        int totalUangSetelah = uang - (int) (pengeluaranHarian * 30) + bonusTakTerduga;
        
        System.out.println("\n=== LAPORAN KEUANGAN PRIBADI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Uang yang dimiliki: Rp" + uang);
        System.out.println("Pengeluaran harian rata-rata: Rp" + (int) pengeluaranHarian);
        System.out.println("Sisa uang dalam 30 hari: Rp" + (int) sisaUang);
        System.out.println("Estimasi bulan bertahan: " + estimasi + " bulan");
        System.out.println("Status Keuangan: " + statusKeuangan);
        
        System.out.println("Nilai absolut dari hutang: Rp" + hutangAbsolut);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + pengeluaranBulat);
        System.out.println("Bonus tak terduga: Rp" + bonusTakTerduga);
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: Rp" + totalUangSetelah);
        
        scanner.close();
    }
}
