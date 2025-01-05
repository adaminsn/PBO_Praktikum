package view;

import SimEntity.MataKuliah;
import java.util.ArrayList;

public class Matkulview {
    public void Display(ArrayList<MataKuliah> matkulList) {
        System.out.println("\n===== DAFTAR MATA KULIAH ======");
        for (MataKuliah matkul : matkulList) {
            System.out.println("ID : " + matkul.getId() + ", Nama : " + matkul.getNama() + ", SKS : " + matkul.getSks());
        }
    }
}
