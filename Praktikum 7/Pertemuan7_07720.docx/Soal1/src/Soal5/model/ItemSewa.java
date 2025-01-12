package Soal5.model;

public class ItemSewa {
    private AlatCamping alatSewa;
    private int jumlah;

    public ItemSewa(AlatCamping alatSewa, int jumlah) {
        this.alatSewa = alatSewa;
        this.jumlah = jumlah;
    }

    public AlatCamping getAlatSewa() {
        return alatSewa;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double hitungSubtotal(int durasi) {
        return alatSewa.getHargaPerHari() * jumlah * durasi;
    }
}
