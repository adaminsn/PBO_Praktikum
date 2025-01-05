package view;

import entity.PenjualanEntity;
import java.util.ArrayList;

public class PenjualanView {
    public void displayPenjualan(ArrayList<PenjualanEntity> penjualanList) {
        System.out.println("\n===== DAFTAR PENJUALAN =====");
        for (PenjualanEntity penjualan : penjualanList) {
            System.out.println("ID Penjualan: " + penjualan.getIdPenjualan() + ", ID Barang: " + penjualan.getIdBarang() + ", Kuantitas: " + penjualan.getQuantitas() + ", Tanggal: " + penjualan.getTanggal() + ", Total Harga: " + penjualan.getTotalHarga());
        }
    }

    public void penjualanDicatat() {
        System.out.println("Penjualan berhasil dicatat!");
    }
}
