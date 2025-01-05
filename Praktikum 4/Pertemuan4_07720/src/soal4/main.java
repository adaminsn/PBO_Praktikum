package soal4;

import java.util.Scanner;

class user {
    String nama;
    int no_id;

    user(String nama, int no_id) {
        this.nama = nama;
        this.no_id = no_id;
    }

    public void tampilan() {
        System.out.println("Nama : " + nama + "\nID : " + no_id);
    }
}

class customer extends user {
    String email;

    customer(String nama, int no_id, String email) {
        super(nama, no_id);
        this.email = email;
    }

    @Override
    public void tampilan() {
        System.out.println("Customer: ");
        super.tampilan();
        System.out.println("Email : " + email);
    }

    public void bayar(Pembayaran pembayaran, double jumlah) {
        System.out.println(nama + " sedang melakukan pembayaran");
        pembayaran.prosesPembayaran(jumlah);
    }
}

interface Pembayaran {
    void prosesPembayaran(double jumlah);
}

class PembayaranTunai implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran sebesar Rp" + jumlah + " dilakukan menggunakan tunai.");
    }
}

class PembayaranKartu implements Pembayaran {
    String nomorKartu;
    String namaPemilik;

    PembayaranKartu(String nomorKartu, String namaPemilik) {
        this.nomorKartu = nomorKartu;
        this.namaPemilik = namaPemilik;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran sebesar Rp" + jumlah + " dilakukan menggunakan kartu.");
        System.out.println("Nomor Kartu : " + nomorKartu + ", Nama Pemilik : " + namaPemilik);
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        customer cs = new customer("Adam", 1231, "Adaminsaan24@gmail.com");


        cs.tampilan();
        System.out.println();


        System.out.print("Masukkan jumlah pembayaran: ");
        double jumlah = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        Pembayaran pembayaran = null;

        if (pilihan == 1) {
            pembayaran = new PembayaranTunai();
        } else if (pilihan == 2) {

            System.out.print("Masukkan nomor kartu: ");
            String nomorKartu = scanner.nextLine();
            System.out.print("Masukkan nama pemilik kartu: ");
            String namaPemilik = scanner.nextLine();
            pembayaran = new PembayaranKartu(nomorKartu, namaPemilik);
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }


        cs.bayar(pembayaran, jumlah);
    }
}
