import java.util.Scanner;

class Character {
    String name;
    int level;
    int agility;


    public Character(String name, int level, int agility) {
        this.name = name;
        this.level = level;
        this.agility = agility;
    }


    void walking() {
        System.out.println(name + " is Walking with " + agility + " speed...");
    }


    static Character createCharacter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Level: ");
        int level = input.nextInt();
        System.out.print("Enter Agility: ");
        int agility = input.nextInt();
        return new Character(name, level, agility);
    }
}

public class Main {
    public static void main(String[] args) {
        Character character1 = Character.createCharacter();

        character1.walking();
    }
}
