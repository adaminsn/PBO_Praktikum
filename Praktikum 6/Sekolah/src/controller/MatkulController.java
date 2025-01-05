package controller;

import model.MatkulModel;
import SimEntity.MataKuliah;
import view.Matkulview;
import java.util.ArrayList;

public class MatkulController {
    private Matkulview view;

    public MatkulController() {
        this.view = new Matkulview();
    }

    public void addMatkul(MataKuliah matkul) {
        MatkulModel.addMatkul(matkul);
    }

    public void Display() {
        ArrayList<MataKuliah> matkulList = MatkulModel.getMatakuliahList();
        view.Display(matkulList);
    }
}