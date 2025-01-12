package Soal5.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Soal5.model.AlatCamping;
import Soal5.model.ItemSewa;
import Soal5.model.Penyewaan;
import Soal5.view.View;

public class Controller {
    private View view;
    private Penyewaan penyewaan;

    public Controller(View view) {
        this.view = view;

        view.tambahListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == view.getBtnTambah()) {
                    tambahItemSewa();
                } else if (e.getSource() == view.getBtnHitung()) {
                    hitungTotal();
                } else if (e.getSource() == view.getBtnBatal()) {
                    batal();
                }
            }
        });
    }

    private void tambahItemSewa() {
        String namaPenyewa = view.getNamaPenyewa();
        if (penyewaan == null) {
            int durasi = view.getDurasi();
            penyewaan = new Penyewaan(namaPenyewa, durasi);
        }

        String namaAlat = view.getNamaAlat();
        String jenis = view.getJenis();
        double hargaPerHari = view.getHargaPerHari();
        int jumlah = view.getJumlah();

        AlatCamping alatCamping = new AlatCamping(namaAlat, jenis, hargaPerHari);
        ItemSewa itemSewa = new ItemSewa(alatCamping, jumlah);

        penyewaan.tambahItemSewa(itemSewa);
        view.tampilkanPesan("Item berhasil ditambahkan: " + namaAlat + " x " + jumlah);
    }

    private void hitungTotal() {
        if (penyewaan != null) {
            String detailSewa = penyewaan.getDetailSewa();
            view.tampilkanPesan("Detail Penyewaan:\n" + detailSewa);
        } else {
            view.tampilkanPesan("Belum ada data penyewaan.");
        }
    }

    private void batal() {
        penyewaan = null;
        view.tampilkanPesan("Proses penyewaan dibatalkan.");
    }
}
