import java.util.ArrayList;

class Mahasiswa4 {
    private String nama;

    public Mahasiswa4(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}


class Jurusan4 {
    public String namaJurusan;
    public ArrayList<Mahasiswa4> daftarMahasiswa;

    public Jurusan4(String namaJurusan) {
        this.namaJurusan = namaJurusan;
        this.daftarMahasiswa = new ArrayList<>(); // Inisialisasi ArrayList
    }

    public void tambahMahasiswa4(Mahasiswa4 mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tampilkanMahasiswa() {
        System.out.println("Daftar Mahasiswa di Jurusan " + namaJurusan + ":");
        for (Mahasiswa4 mhs : daftarMahasiswa) {
            System.out.println("- " + mhs.getNama());
        }
    }
}

public class soalNo4 {
    public static void main(String[] args) {
        Jurusan4 jurusan = new Jurusan4("Teknik Informatika");

        Mahasiswa4 mhs1 = new Mahasiswa4("Luffy");
        Mahasiswa4 mhs2 = new Mahasiswa4("Zoro");
        Mahasiswa4 mhs3 = new Mahasiswa4("Nami");
        Mahasiswa4 mhs4 = new Mahasiswa4("Usopp");
        Mahasiswa4 mhs5 = new Mahasiswa4("Sanji");
        Mahasiswa4 mhs6 = new Mahasiswa4("....");
        mhs6.setNama("Adam");

        jurusan.tambahMahasiswa4(mhs1);
        jurusan.tambahMahasiswa4(mhs2);
        jurusan.tambahMahasiswa4(mhs3);
        jurusan.tambahMahasiswa4(mhs4);
        jurusan.tambahMahasiswa4(mhs5);
        jurusan.tambahMahasiswa4(mhs6);

        jurusan.tampilkanMahasiswa();
    }
}
