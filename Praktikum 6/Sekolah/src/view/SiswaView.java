package view;

import SimEntity.Siswa;

import java.util.ArrayList;

public class SiswaView {
    public void DisplaySiswa(ArrayList<Siswa> siswaList) {
        System.out.println("\n==== DAFTAR SISWA =====");
        for (Siswa siswa : siswaList) {
            System.out.println("ID : " + siswa.getId() + ", Nama : " + siswa.getNama() + ", Kelas : " + siswa.getKelas());
        }
    }
}
