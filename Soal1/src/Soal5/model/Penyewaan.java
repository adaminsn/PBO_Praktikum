package Soal5.model;

public class Penyewaan {
    private ItemSewa itemSewa;
    private int durasiSewa;

    public Penyewaan(ItemSewa itemSewa, int durasiSewa) {
        this.itemSewa = itemSewa;
        this.durasiSewa = durasiSewa;
    }

    public double getTotalHarga() {
        return itemSewa.hitungTotalHarga(durasiSewa);
    }

    public String getDetailSewa() {
        StringBuilder detail = new StringBuilder();
        for (AlatCamping alat : itemSewa.getDaftarAlat()) {
            detail.append(alat.getNamaAlat())
                    .append(" (Jenis: ").append(alat.getJenis())
                    .append(", Harga: ").append(alat.getHargaPerHari()).append(" per hari)\n");
        }
        return detail.toString();
    }
}
