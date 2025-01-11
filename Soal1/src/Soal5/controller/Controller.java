package Soal5.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Soal5.model.*;
import Soal5.view.View;

public class Controller {
    private View view;
    private ItemSewa itemSewa;
    private Penyewaan penyewaan;

    public Controller(View view) {
        this.view = view;
        this.itemSewa = new ItemSewa();

        view.tambahListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == view.getBtnTambah()) {
                    tambahAlatCamping();
                } else if (e.getSource() == view.getBtnHitung()) {
                    hitungHarga();
                } else if (e.getSource() == view.getBtnBatal()) {
                    batal();
                }
            }
        });
    }

    private void tambahAlatCamping() {
        String namaAlat = view.getNamaAlat();
        String jenis = view.getJenis();
        double hargaPerHari = view.getHargaPerHari();

        AlatCamping alatCamping = new AlatCamping(namaAlat, jenis, hargaPerHari);
        itemSewa.tambahAlat(alatCamping);
        view.tampilkanPesan("Alat " + namaAlat + " berhasil ditambahkan!");
    }

    private void hitungHarga() {
        if (!itemSewa.getDaftarAlat().isEmpty()) {
            int durasiSewa = view.getDurasiSewa();
            penyewaan = new Penyewaan(itemSewa, durasiSewa);

            String detailSewa = penyewaan.getDetailSewa();
            double totalHarga = penyewaan.getTotalHarga();

            view.tampilkanPesan("Detail Sewa:\n" + detailSewa + "\nTotal Harga: Rp " + totalHarga);
        } else {
            view.tampilkanPesan("Tambahkan alat camping terlebih dahulu.");
        }
    }

    private void batal() {
        view.tampilkanPesan("Proses dibatalkan.");
        itemSewa = new ItemSewa();
    }
}
