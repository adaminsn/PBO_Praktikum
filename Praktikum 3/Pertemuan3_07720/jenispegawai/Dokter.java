package jenispegawai;

import rumahSakit.TenagaMedis;

public class Dokter extends TenagaMedis {
    private String spesialisasi;
    private int tahunPengalaman;

    public Dokter(String nama, int umur, String id, String spesialisasi, int tahunPengalaman) {
        super(nama, umur, id);
        this.spesialisasi = spesialisasi;
        this.tahunPengalaman = tahunPengalaman;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Tahun Pengalaman: " + tahunPengalaman);
    }
}