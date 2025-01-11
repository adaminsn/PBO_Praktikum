package Soal4;

import java.util.*;
import java.io.*;

class Mekanik {
    private String nama;

    public Mekanik(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nama;
    }
}

class Layanan {
    private String namaLayanan;
    private double harga;

    public Layanan(String namaLayanan, double harga) {
        this.namaLayanan = namaLayanan;
        this.harga = harga;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return namaLayanan + "," + harga;
    }
}

class Kendaraan {
    private String platNomor;
    private Mekanik mekanik;
    private Layanan layanan;

    public Kendaraan(String platNomor, Mekanik mekanik, Layanan layanan) {
        this.platNomor = platNomor;
        this.mekanik = mekanik;
        this.layanan = layanan;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public Mekanik getMekanik() {
        return mekanik;
    }

    public void setMekanik(Mekanik mekanik) {
        this.mekanik = mekanik;
    }

    public Layanan getLayanan() {
        return layanan;
    }

    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }

    @Override
    public String toString() {
        return platNomor + "," + mekanik.getNama() + "," + layanan.toString();
    }
}

public class main {
    private static ArrayList<Kendaraan> kendaraanList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "dataBengkel.txt";

    public static void main(String[] args) {
        loadDataFromFile();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Kendaraan");
            System.out.println("3. Hapus Kendaraan");
            System.out.println("4. Edit Kendaraan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahKendaraan();
                    break;
                case 2:
                    tampilkanKendaraan();
                    break;
                case 3:
                    hapusKendaraan();
                    break;
                case 4:
                    editKendaraan();
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    // Menyimpan data ke file saat keluar
                    saveDataToFile();
                    return;
                default:
                    System.out.println("Opsi tidak valid!");
            }
        }
    }

    private static void tambahKendaraan() {
        System.out.print("Masukkan plat nomor: ");
        String platNomor = scanner.nextLine();

        System.out.print("Masukkan nama mekanik: ");
        String namaMekanik = scanner.nextLine();
        Mekanik mekanik = new Mekanik(namaMekanik);

        System.out.print("Masukkan nama layanan: ");
        String namaLayanan = scanner.nextLine();
        System.out.print("Masukkan harga layanan: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
        Layanan layanan = new Layanan(namaLayanan, harga);

        kendaraanList.add(new Kendaraan(platNomor, mekanik, layanan));
        System.out.println("Kendaraan berhasil ditambahkan.");
    }

    private static void tampilkanKendaraan() {
        if (kendaraanList.isEmpty()) {
            System.out.println("Tidak ada data kendaraan.");
            return;
        }

        System.out.println("Daftar Kendaraan:");
        for (int i = 0; i < kendaraanList.size(); i++) {
            Kendaraan k = kendaraanList.get(i);
            System.out.println((i + 1) + ". Plat Nomor: " + k.getPlatNomor() +
                    ", Mekanik: " + k.getMekanik().getNama() +
                    ", Layanan: " + k.getLayanan().getNamaLayanan() +
                    ", Harga: " + k.getLayanan().getHarga());
        }
    }

    private static void hapusKendaraan() {
        tampilkanKendaraan();
        System.out.print("Pilih nomor kendaraan yang akan dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index > 0 && index <= kendaraanList.size()) {
            kendaraanList.remove(index - 1);
            System.out.println("Kendaraan berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    private static void editKendaraan() {
        tampilkanKendaraan();
        System.out.print("Pilih nomor kendaraan yang akan diedit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index > 0 && index <= kendaraanList.size()) {
            Kendaraan k = kendaraanList.get(index - 1);

            System.out.print("Masukkan plat nomor baru: ");
            String platNomor = scanner.nextLine();
            k.setPlatNomor(platNomor);

            System.out.print("Masukkan nama mekanik baru: ");
            String namaMekanik = scanner.nextLine();
            k.setMekanik(new Mekanik(namaMekanik));

            System.out.print("Masukkan nama layanan baru: ");
            String namaLayanan = scanner.nextLine();
            System.out.print("Masukkan harga layanan baru: ");
            double harga = scanner.nextDouble();
            scanner.nextLine();
            k.setLayanan(new Layanan(namaLayanan, harga));

            System.out.println("Data kendaraan berhasil diedit.");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    private static void loadDataFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String platNomor = data[0];
                    String namaMekanik = data[1];
                    String namaLayanan = data[2];
                    double harga = Double.parseDouble(data[3]);
                    Mekanik mekanik = new Mekanik(namaMekanik);
                    Layanan layanan = new Layanan(namaLayanan, harga);
                    kendaraanList.add(new Kendaraan(platNomor, mekanik, layanan));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan, membuat file baru...");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Format data salah, tidak bisa mengonversi harga.");
        }
    }

    private static void saveDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Kendaraan k : kendaraanList) {
                writer.write(k.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data: " + e.getMessage());
        }
    }
}

