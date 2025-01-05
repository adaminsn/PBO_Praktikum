package bab8No3;

import java.util.Scanner;

abstract class Transportasi {
    String nama;
    int kapasitas;

    public Transportasi(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }

    abstract void caraMemesan();
    abstract double hitungTarif(int jarak);

    public void tampilkanInfo() {
        System.out.println("Nama Transportasi : " + nama);
        System.out.println("Kapasitas         : " + kapasitas + " orang");
    }
}

class Taksi extends Transportasi {
    double tarifPerKm;

    public Taksi(String nama, int kapasitas, double tarifPerKm) {
        super(nama, kapasitas);
        this.tarifPerKm = tarifPerKm;
    }

    @Override
    void caraMemesan() {
        System.out.println("Cara Memesan: Hubungi melalui aplikasi BlueBird atau panggil dari pinggir jalan.");
    }

    @Override
    double hitungTarif(int jarak) {
        return tarifPerKm * jarak;
    }
}

class Bus extends Transportasi {
    double tarifFlat;

    public Bus(String nama, int kapasitas, double tarifFlat) {
        super(nama, kapasitas);
        this.tarifFlat = tarifFlat;
    }

    @Override
    void caraMemesan() {
        System.out.println("Cara Memesan: Datang ke terminal atau naik di halte bus.");
    }

    @Override
    double hitungTarif(int jarak) {
        return tarifFlat;
    }
}

class KeretaApi extends Transportasi {
    double tarifPerKm;

    public KeretaApi(String nama, int kapasitas, double tarifPerKm) {
        super(nama, kapasitas);
        this.tarifPerKm = tarifPerKm;
    }

    @Override
    void caraMemesan() {
        System.out.println("Cara Memesan: Beli tiket secara online atau di stasiun.");
    }

    @Override
    double hitungTarif(int jarak) {
        return tarifPerKm * jarak;
    }
}


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Taksi taksi = new Taksi("Taksi Kota", 4, 5000);
        Bus bus = new Bus("Bus Trans", 40, 12000);
        KeretaApi kereta = new KeretaApi("Kereta Luxury", 200, 20000);

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
                taksi.caraMemesan();
                System.out.println("Tarif untuk " + jarak + " km: Rp" + taksi.hitungTarif(jarak));
                break;
            case 2:
                bus.tampilkanInfo();
                bus.caraMemesan();
                System.out.println("Tarif untuk " + jarak + " km: Rp" + bus.hitungTarif(jarak));
                break;
            case 3:
                kereta.tampilkanInfo();
                kereta.caraMemesan();
                System.out.println("Tarif untuk " + jarak + " km: Rp" + kereta.hitungTarif(jarak));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}

