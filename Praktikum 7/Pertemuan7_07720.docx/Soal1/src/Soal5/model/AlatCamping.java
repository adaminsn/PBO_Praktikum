package Soal5.model;

public class AlatCamping {
    private String nama;
    private String jenis;
    private double hargaPerHari;

    public AlatCamping(String nama, String jenis, double hargaPerHari) {
        this.nama = nama;
        this.jenis = jenis;
        this.hargaPerHari = hargaPerHari;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHargaPerHari() {
        return hargaPerHari;
    }
}
