// Mage dapat menyerang dan menyembuhkan karakter lain
public class Mage extends GameCharacter implements Attackable, Healable {
    private int mana;

    public Mage(String name, int health, int power, int mana) {
        super(name, health, power);
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println(name + " melemparkan bola api!");
        mana -= 10;
    }

    @Override
    public void heal(GameCharacter target) {
        System.out.println(name + " menyembuhkan " + target.name + ".");
        target.health += 20;
        mana -= 5;
    }

    public void castSpell() {
        System.out.println(name + " menggunakan sihir khusus!");
        mana -= 15;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Mana: " + mana;
    }
}

