package model;

import SimEntity.Nilai;
import java.util.ArrayList;

public class NilaiModel {
    private static ArrayList<Nilai> nilaiList = new ArrayList<>();

    public static void addNilai(Nilai nilai) {
        nilaiList.add(nilai);
    }

    public static ArrayList<Nilai> getNilaiList() {
        return nilaiList;
    }
}