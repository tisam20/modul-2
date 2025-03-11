import java.util.Scanner;

public class SistemNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + i + ":");
            
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("NIM: ");
            String nim = input.nextLine();
            
            System.out.print("Usia: ");
            int usia = input.nextInt();
            
            System.out.print("Jumlah Mata Kuliah: ");
            int jumlahMataKuliah = input.nextInt();
            input.nextLine();

            double totalNilai = 0;
            for (int j = 1; j <= jumlahMataKuliah; j++) {
                System.out.print("Masukkan nilai untuk Mata Kuliah ke-" + j + ": ");
                double nilai = input.nextDouble();
                totalNilai += nilai;
            }
            input.nextLine();

            double rataRata = totalNilai / jumlahMataKuliah;
            double ipk;
            if (rataRata >= 85) ipk = 4.0;
            else if (rataRata >= 75) ipk = 3.5;
            else if (rataRata >= 65) ipk = 3.0;
            else if (rataRata >= 50) ipk = 2.0;
            else ipk = 1.0;

            System.out.print("Masukkan nomor antrian konsultasi akademik: ");
            int nomorAntrian = input.nextInt();
            input.nextLine();

            System.out.println("LAPORAN AKADEMIK MAHASISWA");
            System.out.println("=========================================");
            System.out.println("Nama        : " + nama);
            System.out.println("NIM         : " + nim);
            System.out.println("Usia        : " + usia);
            System.out.println("IPK         : " + ipk);
            System.out.println("No. Antrian : " + nomorAntrian);
            System.out.println("\nEvaluasi Akademik:");
            if (usia > 22) System.out.println("- Mahasiswa berusia lebih dari 22 tahun");
            if (ipk >= 3.5 && jumlahMataKuliah > 4) System.out.println("- Mahasiswa berprestasi tinggi");
            if (ipk < 2.5 || jumlahMataKuliah < 4) System.out.println("- Mahasiswa perlu meningkatkan akademiknya");
        }

        input.close();
    }
}
