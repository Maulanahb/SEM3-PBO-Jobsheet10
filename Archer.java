// Archer dapat bergerak dan menyerang menggunakan panah
public class Archer extends GameCharacter implements Movable, Attackable {
    private int arrow;

    public Archer(String name, int health, int power, int arrow) {
        super(name, health, power);
        this.arrow = arrow;
    }

    @Override
    public void move(String direction) {
        System.out.println(name + " bergerak cepat ke " + direction + ".");
    }

    @Override
    public void attack() {
        if (arrow > 0) {
            System.out.println(name + " menembakkan panah!");
            arrow--;
        } else {
            System.out.println(name + " kehabisan panah!");
        }
    }

    public void aim() {
        System.out.println(name + " membidik target dengan fokus tinggi.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Arrow: " + arrow;
    }
}
