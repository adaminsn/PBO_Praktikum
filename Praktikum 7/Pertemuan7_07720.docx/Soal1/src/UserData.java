import java.util.ArrayList;
import java.util.Scanner;


class User {
    private String nama;
    private int umur;


    public User(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }


    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }
}

public class UserData {
    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(String nama, int umur) {
        users.add(new User(nama, umur));
    }

    public static void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("Data User Tidak Ada");
            return;
        }

        System.out.println("User Data:");
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println((i + 1) + ". Nama: " + user.getNama() + ", umur: " + user.getUmur());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah User");
            System.out.println("2. Display User");
            System.out.println("3. Exit");
            System.out.print("Pilih 1-3:  ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Umur: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    addUser(name, age);
                    System.out.println("Menambah User Sukses!");
                    break;
                case 2:
                    displayUsers();
                    break;
                case 3:
                    System.out.println("Keluar");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilih yg Benar");
            }
        }
    }
}



