package SimEntity;

public class MataKuliah {
    private int id;
    private String nama;
    private int sks;

    public MataKuliah(int id, String nama, int sks) {
        this.id = id;
        this.nama = nama;
        this.sks = sks;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }


}
