class Buku{
    String judul;
    String penulis;
    int tahunTerbit;

    public Buku(String judul, String penulis, int tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    public static String tampilkanData(Buku buku){
        return "judul : " + buku.judul  + "\n" + "Penulis : " + buku.penulis  + "\n" + "TahunTerbit : " + buku.tahunTerbit + "\n";
    }
}




public class Bab2Soal3 {
    public static void main(String[] args) {
        Buku buku = new Buku("Buaya Dari Goa Hantu", "Adaminsn", 2003);
        System.out.println(Buku.tampilkanData(buku));
    }
}
