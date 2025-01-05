package jenispegawai;

import rumahSakit.TenagaMedis;

public class Perawat extends TenagaMedis {
    private String shift;
    private String unitKerja;

    public Perawat(String nama, int umur, String id, String shift, String unitKerja) {
        super(nama, umur, id);
        this.shift = shift;
        this.unitKerja = unitKerja;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Shift: " + shift);
        System.out.println("Unit Kerja: " + unitKerja);
    }
}
