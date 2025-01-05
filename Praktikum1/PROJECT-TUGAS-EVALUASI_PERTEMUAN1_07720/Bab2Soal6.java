class Mahasiswa{
    String namalengkap;
    int npm;
    String jenisKelamin;

    Mahasiswa(){
        namalengkap = "Adam Fadhila Insaan";
        npm = 7720;
        jenisKelamin = "Laki - Laki" + "\n";
    }
    Mahasiswa(String namalengkap, int npm, String jenisKelamin){
        this.namalengkap = namalengkap;
        this.npm = npm;
        this.jenisKelamin = jenisKelamin;
    }
    public void tampilkanInfo(){
        System.out.println(namalengkap);
        System.out.println(npm);
        System.out.println(jenisKelamin);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa("Subandi Lateru Kuningan", 23423, "Laki - Laki" + "\n");
        Mahasiswa mahasiswa3 = new Mahasiswa("Leona lyda", 4323, "Perempuan" + "\n");
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
        mahasiswa3.tampilkanInfo();
    }
}



