package model;

import SimEntity.MataKuliah;
import java.util.ArrayList;

public class MatkulModel {
    private static ArrayList<MataKuliah> matakuliahList = new ArrayList<>();

    public static void addMatkul(MataKuliah matkul) {
        matakuliahList.add(matkul);
    }

    public static ArrayList<MataKuliah> getMatakuliahList() {
        return matakuliahList;
    }
}