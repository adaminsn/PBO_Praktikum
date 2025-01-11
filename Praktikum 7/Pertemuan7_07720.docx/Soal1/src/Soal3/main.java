package Soal3;

abstract class Kendaraan {
    protected String jenis;
    protected double hargaPerHari;
    protected int durasiSewa;

    public Kendaraan(String jenis, double hargaPerHari, int durasiSewa) {
        this.jenis = jenis;
        this.hargaPerHari = hargaPerHari;
        this.durasiSewa = durasiSewa;
    }

    public abstract double hitungHargaSewa();
}

interface Diskon {
    double hitungDiskon(double harga);
}

class KendaraanListrik extends Kendaraan implements Diskon {
    private double konsumsiDaya;

    public KendaraanListrik(double hargaPerHari, int durasiSewa, double konsumsiDaya) {
        super("Listrik", hargaPerHari, durasiSewa);
        this.konsumsiDaya = konsumsiDaya;
    }

    @Override
    public double hitungHargaSewa() {
        double harga = hargaPerHari * durasiSewa;
        return harga - hitungDiskon(harga);
    }

    @Override
    public double hitungDiskon(double harga) {
        return harga * 0.1;
    }
}

class KendaraanBensin extends Kendaraan {
    private double jumlahBahanBakar;

    public KendaraanBensin(double hargaPerHari, int durasiSewa, double jumlahBahanBakar) {
        super("Bensin", hargaPerHari, durasiSewa);
        this.jumlahBahanBakar = jumlahBahanBakar;
    }

    @Override
    public double hitungHargaSewa() {
        double harga = hargaPerHari * durasiSewa;
        double biayaBahanBakar = jumlahBahanBakar * 1.5;
        return harga + biayaBahanBakar;
    }
}

public class main {
    public static void main(String[] args) {
        Kendaraan kendaraanListrik = new KendaraanListrik(200000, 5, 20);
        System.out.println("Harga sewa kendaraan listrik: Rp " + kendaraanListrik.hitungHargaSewa());

        Kendaraan kendaraanBensin = new KendaraanBensin(150000, 5, 50);
        System.out.println("Harga sewa kendaraan bensin: Rp " + kendaraanBensin.hitungHargaSewa());
    }
}
