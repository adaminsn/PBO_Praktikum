package model;

import entity.BarangEntity;
import java.util.ArrayList;

public class BarangModel {
    private static ArrayList<BarangEntity> barangList = new ArrayList<>();

    public static void tambahBarang(BarangEntity barang) {
        barangList.add(barang);
    }

    public static ArrayList<BarangEntity> getBarangList() {
        return barangList;
    }

    public static BarangEntity cariBarangById(int idBarang) {
        return barangList.stream()
                //stream itu mengubah baranglist menjadi stream, supaya datanya bisa diproses
                .filter(barang -> barang.getIdBarang() == idBarang)
                .findFirst()
                .orElse(null);
    }
}