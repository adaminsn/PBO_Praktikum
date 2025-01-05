import controller.*;
import SimEntity.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MatkulController matkulController = new MatkulController();
        SiswaController siswaController = new SiswaController();
        NilaiController nilaiController = new NilaiController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tampilkan Mata Kuliah");
            System.out.println("2. Tambah Mata Kuliah");
            System.out.println("3. Tampilkan Siswa");
            System.out.println("4. Tambah Siswa");
            System.out.println("5. Tampilkan Nilai");
            System.out.println("6. Tambah Nilai");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matkulController.Display();
                    break;
                case 2:
                    System.out.print("Masukkan ID Mata Kuliah: ");
                    int idMatkul = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Mata Kuliah: ");
                    String namaMatkul = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sks = scanner.nextInt();

                    MataKuliah matkul = new MataKuliah(idMatkul, namaMatkul, sks);
                    matkulController.addMatkul(matkul);
                    System.out.println("Mata Kuliah berhasil ditambahkan!");
                    break;
                case 3:
                    siswaController.displaySiswa();
                    break;
                case 4:
                    System.out.print("Masukkan ID Siswa: ");
                    int idSiswa = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Siswa: ");
                    String namaSiswa = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.nextLine();

                    Siswa siswa = new Siswa(idSiswa, namaSiswa, kelas);
                    siswaController.addSiswa(siswa);
                    System.out.println("Siswa berhasil ditambahkan!");
                    break;
                case 5:
                    nilaiController.DisplayNilai();
                    break;
                case 6:
                    System.out.print("Masukkan ID Siswa: ");
                    int idNilaiSiswa = scanner.nextInt();
                    System.out.print("Masukkan ID Mata Kuliah: ");
                    int idNilaiMatkul = scanner.nextInt();
                    System.out.print("Masukkan Nilai: ");
                    int nilaiAngka = scanner.nextInt();

                    Nilai nilai = new Nilai(idNilaiSiswa, idNilaiMatkul, nilaiAngka);
                    nilaiController.addNilai(nilai);
                    System.out.println("Nilai berhasil ditambahkan!");
                    break;
                case 7:
                    System.out.println("Keluar");
                    return;
                default:
                    System.out.println("Pilihan tidak valid! ");
            }
        }
    }
}
