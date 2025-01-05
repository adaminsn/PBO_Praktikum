package controller;

import model.SiswaModel;
import SimEntity.Siswa;
import view.SiswaView;

import java.util.ArrayList;

public class SiswaController {
    private SiswaView view;

    public SiswaController() {
        this.view = new SiswaView();
    }

    public void addSiswa(Siswa siswa) {
        SiswaModel.addSiswa(siswa);
    }

    public void displaySiswa() {
        ArrayList<Siswa> siswaList = SiswaModel.getSiswaList();
        view.DisplaySiswa(siswaList);
    }

    public Siswa getSiswa(int id) {
        for (Siswa siswa : SiswaModel.getSiswaList()) {
            if (siswa.getId() == id) {
                return siswa;
            }
        }
        return null;
    }
}