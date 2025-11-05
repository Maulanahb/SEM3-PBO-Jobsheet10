// Warrior adalah subclass yang dapat bergerak dan menyerang
public class Warrior extends GameCharacter implements Movable, Attackable {
    private String weapon;

    public Warrior(String name, int health, int power, String weapon) {
        super(name, health, power);
        this.weapon = weapon;
    }

    // Implementasi dari interface Movable
    @Override
    public void move(String direction) {
        System.out.println(name + " bergerak ke " + direction + ".");
    }

    // Implementasi dari interface Attackable
    @Override
    public void attack() {
        System.out.println(name + " menyerang dengan " + weapon + "!");
    }

    // Method khusus Warrior
    public void defend() {
        System.out.println(name + " bertahan dengan perisai!");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Weapon: " + weapon;
    }
}

