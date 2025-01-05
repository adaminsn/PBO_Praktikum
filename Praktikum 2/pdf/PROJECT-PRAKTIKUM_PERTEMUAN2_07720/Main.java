
import java.util.ArrayList;


class Mahasiswa{
    String nama;


    public Mahasiswa(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}



public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Luffy");
        Mahasiswa mahasiswa1 = new Mahasiswa("Zoro");
        Mahasiswa mahasiswa2 = new Mahasiswa("Namai");
        Mahasiswa mahasiswa3 = new Mahasiswa("Usop");
        Mahasiswa mahasiswa4 = new Mahasiswa("Sanji");
        Mahasiswa mahasiswa5 = new Mahasiswa("....");
        mahasiswa5.setNama("Adam");

        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        mhs.add(mahasiswa);
        mhs.add(mahasiswa1);
        mhs.add(mahasiswa2);
        mhs.add(mahasiswa3);
        mhs.add(mahasiswa4);
        mhs.add(mahasiswa5);

      for (int i = 0; i < mhs.size(); i++){
          System.out.println(mhs.get(i).getNama());
      }


    }
}