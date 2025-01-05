package controller;

import entity.BarangEntity;
import entity.PenjualanEntity;
import model.BarangModel;
import model.PenjualanModel;
import view.PenjualanView;
import java.util.Date;

public class PenjualanController {
    private PenjualanView view;

    public PenjualanController() {
        this.view = new PenjualanView();
    }

    public void catatPenjualan(int idPenjualan, int idBarang, int kuantitas) {
        BarangEntity barang = BarangModel.cariBarangById(idBarang);
        if (barang != null && barang.getStock() >= kuantitas) {
            double totalHarga = barang.getHarga() * kuantitas;
            PenjualanEntity penjualan = new PenjualanEntity(idPenjualan, idBarang, kuantitas, new Date(), totalHarga);
            PenjualanModel.tambahPenjualan(penjualan);
            barang.setStock(barang.getStock() - kuantitas);
            view.penjualanDicatat();
        } else {
            System.out.println("Stok barang tidak mencukupi!");
        }
    }

    public void tampilkanPenjualan() {
        view.displayPenjualan(PenjualanModel.getPenjualanList());
    }
}
