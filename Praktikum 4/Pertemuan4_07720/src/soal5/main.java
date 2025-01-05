package soal5;

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
        System.out.println(nama + " sedang melakukan pembayaran...");
        pembayaran.prosesPembayaran(jumlah);
    }

    public void validasiPembayaran(ValidasiPembayaran validasi, double jumlah) {
        if (validasi.validasi(jumlah)) {
            System.out.println("Validasi berhasil, pembayaran dapat dilakukan.");
        } else {
            System.out.println("Validasi gagal, pembayaran tidak dapat dilakukan.");
        }
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

interface ValidasiPembayaran {
    boolean validasi(double jumlah);
}

class ValidasiSaldo implements ValidasiPembayaran {
    double saldo;

    ValidasiSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean validasi(double jumlah) {
        if (jumlah <= saldo) {
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi. Saldo saat ini: Rp" + saldo);
            return false;
        }
    }
}

class ValidasiKartu implements ValidasiPembayaran {
    String nomorKartu;

    ValidasiKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    @Override
    public boolean validasi(double jumlah) {
        if (nomorKartu.matches("\\d{4}-\\d{4}")) {
            return true;
        } else {
            System.out.println("Nomor kartu tidak valid: " + nomorKartu);
            return false;
        }
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
        ValidasiPembayaran validasi = null;

        if (pilihan == 1) {
            pembayaran = new PembayaranTunai();

            System.out.print("Masukkan saldo Anda: ");
            double saldo = scanner.nextDouble();
            validasi = new ValidasiSaldo(saldo);

        } else if (pilihan == 2) {
            System.out.print("Masukkan nomor kartu, contoh: xxxx-xxxx : ");
            String nomorKartu = scanner.nextLine();
            System.out.print("Masukkan nama pemilik kartu: ");
            String namaPemilik = scanner.nextLine();
            pembayaran = new PembayaranKartu(nomorKartu, namaPemilik);

            validasi = new ValidasiKartu(nomorKartu);

        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        cs.validasiPembayaran(validasi, jumlah);

        if (validasi.validasi(jumlah)) {
            cs.bayar(pembayaran, jumlah);
        }
    }
}
