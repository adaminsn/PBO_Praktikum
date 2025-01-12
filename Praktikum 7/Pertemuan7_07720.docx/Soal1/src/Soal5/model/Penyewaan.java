package Soal5.model;

import java.util.ArrayList;

public class Penyewaan {
    private String namaPenyewa;
    private ArrayList<ItemSewa> daftarItemSewa;
    private int durasi;

    public Penyewaan(String namaPenyewa, int durasi) {
        this.namaPenyewa = namaPenyewa;
        this.durasi = durasi;
        this.daftarItemSewa = new ArrayList<>();
    }

    public void tambahItemSewa(ItemSewa itemSewa) {
        daftarItemSewa.add(itemSewa);
    }

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (ItemSewa item : daftarItemSewa) {
            totalHarga += item.hitungSubtotal(durasi);
        }
        return totalHarga;
    }

    public String getDetailSewa() {
        StringBuilder detail = new StringBuilder();
        detail.append("Nama Penyewa: ").append(namaPenyewa).append("\n")
                .append("Durasi: ").append(durasi).append(" hari\n")
                .append("Daftar Alat yang Disewa:\n");

        for (ItemSewa item : daftarItemSewa) {
            detail.append("- ").append(item.getAlatSewa().getNama())
                    .append(" (").append(item.getAlatSewa().getJenis()).append(")")
                    .append(" x ").append(item.getJumlah())
                    .append(" = Rp ").append(item.hitungSubtotal(durasi)).append("\n");
        }

        detail.append("Total Harga: Rp ").append(hitungTotalHarga()).append("\n");
        return detail.toString();
    }
}
