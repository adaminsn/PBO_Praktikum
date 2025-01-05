package bab8No4;

import java.util.Scanner;

interface Transportasi {
    void bergerak();
    double hitungTarif(int jarak);
}

interface Pembayaran {
    void bayar();
}

class Taksi implements Transportasi, Pembayaran {
    String nama;
    int kapasitas;
    double tarifPerKm;

    public Taksi(String nama, int kapasitas, double tarifPerKm) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.tarifPerKm = tarifPerKm;
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak menuju tujuan.");
    }

    @Override
    public double hitungTarif(int jarak) {
        return tarifPerKm * jarak;
    }

    @Override
    public void bayar() {
        System.out.println("Pembayaran taksi telah berhasil.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama Taksi : " + nama);
        System.out.println("Kapasitas  : " + kapasitas + " orang");
    }
}

class Bus implements Transportasi, Pembayaran {
    String nama;
    int kapasitas;
    double tarifFlat;

    public Bus(String nama, int kapasitas, double tarifFlat) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.tarifFlat = tarifFlat;
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dari terminal.");
    }

    @Override
    public double hitungTarif(int jarak) {
        return tarifFlat;
    }

    @Override
    public void bayar() {
        System.out.println("Pembayaran bus telah berhasil.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama Bus   : " + nama);
        System.out.println("Kapasitas  : " + kapasitas + " orang");
    }
}

class KeretaApi implements Transportasi, Pembayaran {
    String nama;
    int kapasitas;
    double tarifPerKm;

    public KeretaApi(String nama, int kapasitas, double tarifPerKm) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.tarifPerKm = tarifPerKm;
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " sedang berjalan menuju stasiun tujuan.");
    }

    @Override
    public double hitungTarif(int jarak) {
        return tarifPerKm * jarak;
    }

    @Override
    public void bayar() {
        System.out.println("Pembayaran kereta api telah berhasil.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kereta : " + nama);
        System.out.println("Kapasitas   : " + kapasitas + " orang");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Taksi taksi = new Taksi("Taksi Kota", 4, 5000);
        Bus bus = new Bus("Bus Trans", 35, 12000);
        KeretaApi kereta = new KeretaApi("Kereta Luxury", 210, 20000);

        System.out.println("=== PILIH TRANSPORTASI ===");
        System.out.println("1. Taksi");
        System.out.println("2. Bus");
        System.out.println("3. Kereta Api");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan jarak perjalanan (dalam km): ");
        int jarak = scanner.nextInt();

        System.out.println();

        switch (pilihan) {
            case 1:
                taksi.tampilkanInfo();
                taksi.bergerak();
                System.out.println("Tarif untuk " + jarak + " km: Rp" + taksi.hitungTarif(jarak));
                taksi.bayar();
                break;
            case 2:
                bus.tampilkanInfo();
                bus.bergerak();
                System.out.println("Tarif untuk " + jarak + " km: Rp" + bus.hitungTarif(jarak));
                bus.bayar();
                break;
            case 3:
                kereta.tampilkanInfo();
                kereta.bergerak();
                System.out.println("Tarif untuk " + jarak + " km: Rp" + kereta.hitungTarif(jarak));
                kereta.bayar();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}

