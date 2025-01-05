package SimEntity;

public class Nilai {
    private int idSiswa;
    private int idMataKuliah;
    private double nilai;

    public Nilai(int idSiswa, int idMataKuliah, double nilai) {
        this.idSiswa = idSiswa;
        this.idMataKuliah = idMataKuliah;
        this.nilai = nilai;
    }

    public int getIdSiswa() {
        return idSiswa;
    }

    public int getIdMataKuliah() {
        return idMataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

}