package Soal5.model;

import java.util.ArrayList;

public class ItemSewa {
    private ArrayList<AlatCamping> daftarAlat;

    public ItemSewa() {
        this.daftarAlat = new ArrayList<>();
    }

    public void tambahAlat(AlatCamping alat) {
        daftarAlat.add(alat);
    }

    public ArrayList<AlatCamping> getDaftarAlat() {
        return daftarAlat;
    }

    public double hitungTotalHarga(int durasiSewa) {
        double totalHarga = 0;
        for (AlatCamping alat : daftarAlat) {
            totalHarga += alat.getHargaPerHari() * durasiSewa;
        }
        return totalHarga;
    }
}
