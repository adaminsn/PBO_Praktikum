package model;

import entity.PenjualanEntity;
import java.util.ArrayList;

public class PenjualanModel {
    private static ArrayList<PenjualanEntity> penjualanList = new ArrayList<>();

    public static void tambahPenjualan(PenjualanEntity penjualan) {
        penjualanList.add(penjualan);
    }

    public static ArrayList<PenjualanEntity> getPenjualanList() {
        return penjualanList;
    }
}