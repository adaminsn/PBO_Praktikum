package view;

import entity.BarangEntity;
import java.util.ArrayList;

public class BarangView {
    public void displayBarang(ArrayList<BarangEntity> barangList) {
        System.out.println("\n===== DAFTAR BARANG =====");
        for (BarangEntity barang : barangList) {
            System.out.println("ID: " + barang.getIdBarang() + ", Nama: " + barang.getNama() + ", Harga: " + barang.getHarga() + ", Stok: " + barang.getStock());
        }
    }

    public void barangDitambahkan() {
        System.out.println("Barang berhasil ditambahkan!");
    }
}