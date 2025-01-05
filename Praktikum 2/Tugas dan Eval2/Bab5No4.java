import java.util.ArrayList;
import java.util.List;

class Mahasiswa {
    private String nama;
    private List<MataKuliah> mataKuliahList;

    public Mahasiswa(String nama) {
        this.nama = nama;
        this.mataKuliahList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void daftarMataKuliah(MataKuliah mataKuliah) {
        if (!mataKuliahList.contains(mataKuliah)) {
            mataKuliahList.add(mataKuliah);
            mataKuliah.tambahMahasiswa(this);
        }
    }

    public List<MataKuliah> getMataKuliahList() {
        return mataKuliahList;
    }
}

class MataKuliah {
    private String namaMataKuliah;
    private List<Mahasiswa> mahasiswaList;

    public MataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
        this.mahasiswaList = new ArrayList<>();
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        if (!mahasiswaList.contains(mahasiswa)) {
            mahasiswaList.add(mahasiswa);
        }
    }
    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }
}
public class Bab5No4 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Adam");
        Mahasiswa mahasiswa2 = new Mahasiswa("Luthfi");

        MataKuliah mataKuliah1 = new MataKuliah("Jaringan Komputer");
        MataKuliah mataKuliah2 = new MataKuliah("Basis Data");

        mahasiswa1.daftarMataKuliah(mataKuliah1);
        mahasiswa2.daftarMataKuliah(mataKuliah1);
        mahasiswa1.daftarMataKuliah(mataKuliah2);
        mahasiswa2.daftarMataKuliah(mataKuliah1);

        System.out.println("Mata Kuliah yang diambil oleh " + mahasiswa1.getNama() + ":");
        for (MataKuliah mk : mahasiswa1.getMataKuliahList()) {
            System.out.println(mk.getNamaMataKuliah());
        }

        System.out.println("Mata Kuliah yang diambil oleh " + mahasiswa2.getNama() + ":");
        for (MataKuliah mk : mahasiswa2.getMataKuliahList()) {
            System.out.println(mk.getNamaMataKuliah());
        }

        System.out.println("Mahasiswa yang terdaftar di " + mataKuliah1.getNamaMataKuliah() + ":");
        for (Mahasiswa mhs : mataKuliah1.getMahasiswaList()) {
            System.out.println(mhs.getNama());
        }
    }
}
