import java.util.ArrayList;
import java.util.List;

class bank {
    List<String> antrian;

    public bank() {
        antrian = new ArrayList<>();
    }

    public void tambahAntrian(String nama) {
        antrian.add(nama);
        System.out.println("Antrian Atas Nama " + nama + " telah di tambahkan");
    }

    public void antrianVIP(String nama, int nomor) {
        if (nomor < 0 || nomor > antrian.size() + 1) {
            System.out.println("Antrian Tidak valid");
        }else {
            nomor = nomor -1;
            antrian.add(nomor, nama);
            System.out.println("Antrian VIP Atas Nama " + nama + " telah di tambahkan" + ".");
        }
    }

    public void tampilanAntrian() {
        System.out.println("Antrian saat ini : ");
        for (String nama : antrian) {
            System.out.println(antrian.indexOf(nama) + 1 + "."+ nama);
        }
    }
}



public class bab4no5 {
    public static void main(String[] args) {
        bank bank = new bank();
        bank.tambahAntrian("Adam");
        bank.antrianVIP("luthfi",2 );
        bank.tampilanAntrian();
    }
}
