class Laptop1{
    String merek;
    String prosesor;
    int ram;

    public Laptop1(String merek, String prosesor, int ram){
        this.merek = merek;
        this.prosesor = prosesor;
        this.ram = ram;
    }
    public void upgradeRam(int UPram){
        this.ram += UPram;
        System.out.println("Ram berhasil di upgrade, Kapasitas ram sekarang : " + this.ram);
    }

    public void tampilkanInfo() {
        System.out.println("Merek : " + this.merek);
        System.out.println("Prosesor : " + this.prosesor);
        System.out.println("Ram : " + this.ram);
    }
}

public class bab2Soal5 {
    public static void main(String[] args) {
    Laptop1 laptop1 = new Laptop1("ASUS", "Intel", 254);
    laptop1.upgradeRam(254);
    laptop1.tampilkanInfo();
    }
}
