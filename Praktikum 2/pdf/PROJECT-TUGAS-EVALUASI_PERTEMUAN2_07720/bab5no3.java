

class AkunBank{
   private String namaNasabah;
    private String Norek;
    private double saldo;

    public AkunBank(String namaNasabah, String Norek, double saldo){
        this.namaNasabah = namaNasabah;
        this.Norek = Norek;
        this.saldo = saldo;
    }
    public String getNamaNasabah(){
        return namaNasabah;
    }
    public void setNamaNasabah(String namaNasabah){
        this.namaNasabah = namaNasabah;
    }
    public String getNorek(){
        return Norek;
    }
    public void setNorek(String Norek){
        this.Norek = Norek;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}

public class bab5no3 {
    public static void main(String[] args) {
        AkunBank bank = new AkunBank("Nama","4235923",100000);
        bank.setNamaNasabah("Adam");
        bank.setNorek("092324");
        bank.setSaldo(2350000);

        System.out.println("Nama Nasabah : " + bank.getNamaNasabah());
        System.out.println("Norek : " + bank.getNorek());
        System.out.println("Saldo : " + bank.getSaldo());
    }
}
