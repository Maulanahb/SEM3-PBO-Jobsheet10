// Abstract class utama yang menjadi dasar semua karakter dalam game
public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int power;

    public GameCharacter(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    // Method umum untuk menyerang karakter lain
    public void attack(GameCharacter target) {
        System.out.println(name + " menyerang " + target.name + "!");
        target.health -= power;
    }

    // Method untuk menampilkan info karakter
    public String getInfo() {
        return "Nama: " + name + ", Health: " + health + ", Power: " + power;
    }
}
