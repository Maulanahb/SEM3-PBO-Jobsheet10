// Kelas utama untuk menjalankan simulasi sederhana game item
public class MainGame {
    public static void main(String[] args) {
        Warrior w = new Warrior("Thorin", 120, 15, "Kapak");
        Mage m = new Mage("Gandalf", 100, 12, 80);
        Archer a = new Archer("Legolas", 90, 10, 5);

        System.out.println("=== Info Karakter ===");
        System.out.println(w.getInfo());
        System.out.println(m.getInfo());
        System.out.println(a.getInfo());
        System.out.println();

        System.out.println("=== Aksi ===");
        w.move("depan");
        w.attack();
        m.attack();
        m.heal(w);
        a.move("kanan");
        a.attack();
        a.aim();
    }
}
