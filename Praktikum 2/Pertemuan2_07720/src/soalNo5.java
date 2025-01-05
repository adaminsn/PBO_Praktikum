
class Hardware{
    String Type;
    String Hardware;

    public Hardware(String Type, String Hardware){
        this.Type = Type;
        this.Hardware = Hardware;
    }

    public String getType(){
        return Type;
    }
    public String getHardware(){
        return Hardware;
    }
}

class Laptop{
    String merek;
    String spekLptp;
    Hardware Hardware;
    public Laptop(String merek, String spekLptp, String Hardware, String Type){
        this.merek = merek;
        this.spekLptp = spekLptp;
        this.Hardware = new Hardware(Type, Hardware);
    }

    public String getMerek(){

        return merek;
    }
    public String getSpekLptp(){
        return spekLptp;
    }
    public Hardware getHardware(){
        return Hardware;
    }

}

public class soalNo5 {
    public static void main(String[] args) {
        Laptop lptp = new Laptop("Acer", "16GB RAM, 512GB SSD, icore - i5", "Mainboard, Ram, Prosesor", "Aspire E 14");
        System.out.println("Merek : " + lptp.getMerek());
        System.out.println("Spek : " + lptp.getSpekLptp());
        System.out.println("Hardware : " + lptp.getHardware().getHardware());
        System.out.println("Type : " + lptp.getHardware().getType());

    }
}
