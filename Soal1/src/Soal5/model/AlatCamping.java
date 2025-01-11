package Soal5.model;

public class AlatCamping {
    private String namaAlat;
    private String jenis;
    private double hargaPerHari;

    public AlatCamping(String namaAlat, String jenis, double hargaPerHari) {
        this.namaAlat = namaAlat;
        this.jenis = jenis;
        this.hargaPerHari = hargaPerHari;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHargaPerHari() {
        return hargaPerHari;
    }
}
