import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int usia;
        double tinggiBadan;
        String nama, nim;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nama: ");
        nama = input.nextLine();
        
        System.out.println("Masukkan NIM: ");
        nim = input.nextLine();
        
        System.out.println("Masukkan Usia: ");
        usia = input.nextInt();
        
        System.out.println("Masukkan Tinggi Badan (cm): ");
        tinggiBadan = input.nextDouble();
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        
        int hasilUsia = (usia * 2) + 10 / 5 - 3;
        System.out.println("\nHasil perhitungan usia: " + hasilUsia);
        
        boolean lebihDari18 = usia > 18;
        System.out.println("Usia lebih dari 18: " + lebihDari18);
        
        boolean cekKondisi = (usia > 18) && (tinggiBadan > 160);
        System.out.println("Usia lebih dari 18 dan tinggi badan lebih dari 160 cm: " + cekKondisi);
        
        double usiaDouble = (double) usia;
        int tinggiInt = (int) tinggiBadan;
        
        System.out.println("\nKonversi Tipe Data:");
        System.out.println("Usia: " + usiaDouble);
        System.out.println("Tinggi Badan: " + tinggiInt);
        
        input.close();
    }
}
