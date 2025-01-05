class Mahasiswa4{
    String nama;
    String namaAslab;
    int npm;

    public Mahasiswa4(String nama, String namaAslab, int npm){
        this.nama = nama;
        this.namaAslab = namaAslab;
        this.npm = npm;
    }
}

public class EvalBab1 {
    public static void main(String[] args) {
    Mahasiswa4 mahasiswa = new Mahasiswa4("Adam ", "Franky ", 7720);
    System.out.println(mahasiswa.nama);
    System.out.println(mahasiswa.namaAslab);
    System.out.println(mahasiswa.npm);
    }
}
