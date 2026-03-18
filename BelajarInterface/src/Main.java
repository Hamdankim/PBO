

public class Main {
    public static void main(String[] args)
    {
        Superman clark = new Superman("Clark Kent");
        clark.berjalan();
        clark.terbang();

        Manusia suparman = new Manusia("Suparman");
        suparman.berjalan();

        Manusia clarkMenyamar = clark;
        clarkMenyamar.berjalan();

        EntitasTerbang clarkTerbang = clark;
        clarkTerbang.terbang();

    }
}