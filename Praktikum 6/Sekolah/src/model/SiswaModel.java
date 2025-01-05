package model;

import SimEntity.Siswa;
import java.util.ArrayList;

public class SiswaModel {
    private static ArrayList<Siswa> siswaList = new ArrayList<>();

    public static void addSiswa(Siswa siswa) {
        siswaList.add(siswa);
    }

    public static ArrayList<Siswa> getSiswaList() {
        return siswaList;
    }
}
