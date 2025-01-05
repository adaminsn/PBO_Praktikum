class Mesin {
    private String jenisMesin;

    public Mesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }
}

class Mobil {
    private String merek;
    private Mesin mesin;

    public Mobil(String merek) {
        this.merek = merek;
    }

    public void pasangMesin(Mesin mesin) {
        this.mesin = mesin;
        System.out.println("Mesin " + mesin.getJenisMesin() + " telah dipasang pada mobil " + merek + ".");
    }

    public void nyalakanMesin() {
        if (mesin != null) {
            System.out.println("Mesin " + mesin.getJenisMesin() + " pada mobil " + merek + " dinyalakan.");
        } else {
            System.out.println("Mesin belum dipasang.");
        }
    }
}

public class bab5no5 {
    public static void main(String[] args) {
        Mesin mesin1 = new Mesin("Mesin Bensin");
        Mesin mesin2 = new Mesin("Mesin Diesel");

        Mobil mobil1 = new Mobil("hyundai");
        Mobil mobil2 = new Mobil("BMW");

        mobil1.pasangMesin(mesin1);
        mobil1.nyalakanMesin();

        System.out.println("\n");
        mobil2.nyalakanMesin();
        mobil2.pasangMesin(mesin2);
        mobil2.nyalakanMesin();
    }
}
