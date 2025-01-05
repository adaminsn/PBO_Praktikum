
import java.util.Scanner;

class Transaksi{
    String tanggal;
    float nominal;

    public Transaksi(String tanggal, Float nominal){
        this.tanggal = tanggal;
        this.nominal = nominal;
    }
  public void tampilan(){
        System.out.println("Tanggal Transaksi : " + this.tanggal + ", Nominal Transaksi : " + this.nominal);
  }

}


public class Bab3Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaksi[] transaksiArray = new Transaksi[3];
        for(int i = 0; i<3; i++){
            System.out.print("Masukkan Tanggal Transaksi ke-" + (i + 1) + " : ");
            String tanggal = scanner.nextLine();


            while(true){
                System.out.print("Masukkan Nominal Transaksi ke-" + (i + 1) + " : ");
                float nominal = scanner.nextFloat();
                scanner.nextLine();
                if(nominal % 50000 == 0){
                    transaksiArray[i] = new Transaksi(tanggal, nominal);
                    break;
                }else{
                    System.out.print("Nominal harus kelipatan 50.000 !" + "\n");
                }
            }
        }
        System.out.println("\n");
        System.out.print("Output semua objek Transaksi : " + "\n");
        for(Transaksi transaksi : transaksiArray){
            transaksi.tampilan();
        }
    }

}


