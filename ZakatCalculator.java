import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZakatCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        double kekayaan;
        double zakat = 0;  // Inisialisasi zakat dengan 0
        double totalZakat = 0;
        int jenisZakat;
        int pilihan;

        System.out.println("Selamat Datang di Kalkulator Zakat!");
        System.out.println("-------------------------------");

        while (true) {
            System.out.println("Pilih jenis zakat:");
            System.out.println("1. Zakat Fitrah");
            System.out.println("2. Zakat Mall");
            System.out.println("3. Keluar");

            try {
                jenisZakat = scanner.nextInt();

                if (jenisZakat == 3) {
                    break;
                } else if (jenisZakat < 1 || jenisZakat > 3) {
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
                }

                if (jenisZakat == 1) {
                    System.out.println("Pilih jenis zakat fitrah:");
                    System.out.println("1. Beras");
                    System.out.println("2. Uang");
                    pilihan = scanner.nextInt();

                    if (pilihan == 1) {
                        System.out.print("Masukkan jumlah beras (kg): ");
                        kekayaan = scanner.nextDouble();
                        // Misalkan zakat fitrah beras adalah Rp 30.000 per kg
                        zakat = kekayaan * 30000;
                    } else {
                        System.out.print("Masukkan jumlah uang: ");
                        kekayaan = scanner.nextDouble();
                        zakat = kekayaan; // Zakat fitrah uang sama dengan jumlah uang
                    }
                    System.out.println("Anda membayar zakat fitrah sebesar: Rp" + decimalFormat.format(zakat));
                } else if (jenisZakat == 2) {
                    System.out.println("Pilih jenis zakat mall:");
                    System.out.println("1. Emas");
                    System.out.println("2. Pertanian");
                    System.out.println("3. Peternakan");
                    System.out.println("4. Pendapatan");
                    pilihan = scanner.nextInt();

                    System.out.print("Masukkan jumlah kekayaan: ");
                    kekayaan = scanner.nextDouble();

                    switch (pilihan) {
                        case 1:
                            zakat = kekayaan * 0.025; // Zakat emas
                            break;
                        case 2:
                            zakat = kekayaan * 0.1; // Zakat pertanian
                            break;
                        case 3:
                            zakat = kekayaan * 0.1; // Zakat peternakan
                            break;
                        case 4:
                            zakat = kekayaan * 0.025; // Zakat pendapatan
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            continue;
                    }
                    System.out.println("Anda membayar zakat mall sebesar: Rp" + decimalFormat.format(zakat));
                }

                totalZakat += zakat; // Menambahkan zakat yang dihitung ke total zakat

                System.out.print("Apakah Anda ingin menghitung zakat lagi? (1 = Ya, 2 = Tidak): ");
                int lanjut = scanner.nextInt();

                if (lanjut == 2) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Masukkan angka yang valid.");
                scanner.next(); // Clear invalid input
            }
        }

        System.out.println("Total zakat yang harus dibayar: Rp" + decimalFormat.format(totalZakat));

        scanner.close();
    }
}
