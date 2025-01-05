import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Buku {
    String judul;
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

class Anggota {
    String nama;
    String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }
}

class Perpustakaan {
    private List<Buku> daftarBuku;
    private Map<String, Anggota> daftarAnggota;
    private List<String> antrianPeminjaman;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new HashMap<>();
        antrianPeminjaman = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println(" Buku " + buku.judul + " telah ditambahkan.");
    }


    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.put(anggota.idAnggota, anggota);
        System.out.println(" Anggota " + anggota.nama + " telah ditambahkan.");
    }

    public void pinjamBuku(String nama, String judulBuku) {
        for (Buku buku : daftarBuku) {
            if (buku.judul.equalsIgnoreCase(judulBuku)) {
                antrianPeminjaman.add(nama);
                System.out.println(" Anggota " + nama + " telah meminjam buku " + judulBuku + ".");
                return;
            }
        }
        System.out.println(" ");
    }

    public void tampilkanDaftarBuku() {
        System.out.println("\n Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(" - " + buku.judul + " Ditulis oleh " + buku.penulis);
        }
        System.out.println(" ");
    }
}

public class bab4no6 {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku(new Buku("War Machine", "Sulistiawan"));
        perpustakaan.tambahBuku(new Buku("Magic Of Snake", "Tolkien"));
        perpustakaan.tambahBuku(new Buku("Transformer", "nicckies"));


        perpustakaan.tambahAnggota(new Anggota("Adam", "1"));
        perpustakaan.tambahAnggota(new Anggota("Nana", "2"));

        perpustakaan.pinjamBuku("Adam", "War Machine");
        perpustakaan.pinjamBuku("Nana", "Magic Of Snake");

        perpustakaan.tampilkanDaftarBuku();
    }
}
