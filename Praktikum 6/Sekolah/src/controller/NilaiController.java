package controller;

import SimEntity.MataKuliah;
import SimEntity.Nilai;
import SimEntity.Siswa;
import model.MatkulModel;
import model.NilaiModel;
import model.SiswaModel;
import view.NilaiView;

import java.util.ArrayList;

public class NilaiController {
    private NilaiView view;

    public NilaiController() {
        this.view = new NilaiView();
    }

    public void addNilai(Nilai nilai) {
        NilaiModel.addNilai(nilai);
    }

    public void DisplayNilai() {
        ArrayList<Nilai> nilaiList = NilaiModel.getNilaiList();
        ArrayList<Siswa> siswaList = SiswaModel.getSiswaList();
        ArrayList<MataKuliah> matkulList = MatkulModel.getMatakuliahList();

        ArrayList<String> formattedNilaiList = new ArrayList<>();
        for (Nilai nilai : nilaiList) {
            String namaSiswa = siswaList.stream()
                    .filter(s -> s.getId() == nilai.getIdSiswa())
                    .findFirst()
                    .map(Siswa::getNama)
                    .orElse("Tidak Diketahui");

            String namaMatkul = matkulList.stream()
                    .filter(m -> m.getId() == nilai.getIdMataKuliah())
                    .findFirst()
                    .map(MataKuliah::getNama)
                    .orElse("Tidak Diketahui");

            formattedNilaiList.add(
                    "ID: " + nilai.getIdSiswa() +
                            ", Nama Siswa: " + namaSiswa +
                            ", Mata Kuliah: " + namaMatkul +
                            ", Nilai: " + nilai.getNilai()
            );
        }
        view.NilaiDisplay(formattedNilaiList);
    }
}