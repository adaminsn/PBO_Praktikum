import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Transaksi {
    String tanggal;
   float nominal;

    public Transaksi(String tanggal, float nominal) {
        this.tanggal = tanggal;
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Transaksi Tanggal: " + tanggal + ", Nominal: " + nominal ;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Transaksi> transaksiList = new ArrayList<>();


        transaksiList.add(new Transaksi("2024-12-01", 15000));
        transaksiList.add(new Transaksi("2024-12-02", 20000));
        transaksiList.add(new Transaksi("2024-12-03", 30000));
        transaksiList.add(new Transaksi("2024-12-04", 40000));
        transaksiList.add(new Transaksi("2024-12-05", 50000));


        for (Transaksi transaksi : transaksiList) {
            System.out.println(transaksi);
        }
        ExportToTxt(transaksiList);

    }
    public static void ExportToTxt(ArrayList<Transaksi> daftarTransaksi) {
        String fileName = "Data Transaksi";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Transaksi transaksi : daftarTransaksi) {
                writer.write(transaksi.toString());
                writer.newLine();
            }
            System.out.println("Data berhasil di ekspor file " + fileName);
        }catch (IOException e) {
            System.out.println("terjadi ksealahan " + e.getMessage());
        }
    }
}
