

class User {
    String username;
    String email;
    int saldo;

    public User(String username, String email, int saldo) {
        this.username = username;
        this.email = email;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Saldo: " + saldo);
    }
}

class Driver extends User {
    String kendaraan;
    int nopol;

    public Driver(String username, String email, int saldo, String kendaraan, int nopol) {
        super(username, email, saldo);
        this.kendaraan = kendaraan;
        this.nopol = nopol;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kendaraan: " + kendaraan);
        System.out.println("Nopol: " + nopol);
    }
}

class Customer extends User {
    boolean bergabung;

    public Customer(String username, String email, int saldo, boolean bergabung) {
        super(username, email, saldo);
        this.bergabung = bergabung;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        String status = bergabung ? "Pelanggan Baru" : "Pelanggan Lama";
        System.out.println("Status: " + status);
    }

    // Menghitung tarif berdasarkan jarak dan tarif per kilometer
    public int hitungTarif(int jarak, int tarifPerKm) {
        return jarak * tarifPerKm;
    }

    // Menghitung tarif dengan tambahan parameter potongan harga
    public int hitungTarif(int jarak, int tarifPerKm, int potongan) {
        int total = jarak * tarifPerKm;
        return total - potongan;
    }

    // Menghitung tarif dengan tambahan parameter jumlah penumpang
    public int hitungTarif(int jarak, int tarifPerKm, int potongan, int jumlahPenumpang) {
        int total = jarak * tarifPerKm;
        int tarifDenganPenumpang = total * jumlahPenumpang;
        return tarifDenganPenumpang - potongan;
    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Adam", "Adaminsaan24@gmail.com", 20000);
        Driver user2 = new Driver("Rafi", "Rafilalala@gmail.com", 20000, "Avanza", 23741);
        Customer user3 = new Customer(user1.username, user1.email, 10000, true);
        Customer user4 = new Customer("Nina", "ninaCantik@gmail.com", 230000, false);

//        user1.tampilkanInfo();
//        user2.tampilkanInfo();
//        user3.tampilkanInfo();
//        user4.tampilkanInfo();


        int tarif1 = user3.hitungTarif(10, 2000);
        int tarif2 = user3.hitungTarif(10, 2000, 5000);
        int tarif3 = user3.hitungTarif(10, 2000, 5000, 3);

        System.out.println(" ");

        System.out.println("Tarif (jarak dan tarif per km): " + tarif1);
        System.out.println("Tarif (dengan potongan): " + tarif2);
        System.out.println("Tarif (dengan potongan dan jumlah penumpang): " + tarif3);

    }
}
