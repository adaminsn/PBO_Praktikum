import controller.BarangController;
import controller.PenjualanController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BarangController barangController = new BarangController();
        PenjualanController penjualanController = new PenjualanController();

        Scanner scanner = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== SISTEM INVENTARIS TOKO ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Catat Penjualan");
            System.out.println("4. Tampilkan Penjualan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan ID Barang: ");
                    int idBarang = scanner.nextInt();
                    System.out.print("Masukkan Nama Barang: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Harga Barang: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Masukkan Stok Barang: ");
                    int stock = scanner.nextInt();
                    barangController.tambahBarang(idBarang, nama, harga, stock);
                    break;
                case 2:
                    barangController.tampilkanBarang();
                    break;
                case 3:
                    System.out.print("Masukkan ID Penjualan: ");
                    int idPenjualan = scanner.nextInt();
                    System.out.print("Masukkan ID Barang: ");
                    int idBarangPenjualan = scanner.nextInt();
                    System.out.print("Masukkan Kuantitas: ");
                    int kuantitas = scanner.nextInt();
                    penjualanController.catatPenjualan(idPenjualan, idBarangPenjualan, kuantitas);
                    break;
                case 4:
                    penjualanController.tampilkanPenjualan();
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 5);
    }
}
