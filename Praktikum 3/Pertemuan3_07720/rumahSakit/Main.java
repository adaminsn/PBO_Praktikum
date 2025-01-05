package rumahSakit;



public class Main {
    public static void main(String[] args) {
        jenispegawai.Dokter dokter1 = new jenispegawai.Dokter("Dr. Adam", 45, "D123", "Ortopedi", 20);
        jenispegawai.Perawat perawat1 = new jenispegawai.Perawat("Nina", 30, "P456", "Malam", "ICU");

        System.out.println("Informasi Dokter:");
        dokter1.tampilkanInfo();

        System.out.println("\nInformasi Perawat:");
        perawat1.tampilkanInfo();
    }
}
