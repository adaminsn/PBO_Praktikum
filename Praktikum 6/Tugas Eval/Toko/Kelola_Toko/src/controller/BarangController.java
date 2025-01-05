package controller;

import entity.BarangEntity;
import model.BarangModel;
import view.BarangView;

public class BarangController {
    private BarangView view;

    public BarangController() {
        this.view = new BarangView();
    }

    public void tambahBarang(int id, String nama, double harga, int stock) {
        BarangEntity barang = new BarangEntity(id, nama, harga, stock);
        BarangModel.tambahBarang(barang);
        view.barangDitambahkan();
    }

    public void tampilkanBarang() {
        view.displayBarang(BarangModel.getBarangList());
    }
}