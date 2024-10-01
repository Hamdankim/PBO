import core.Pinjaman;
import io.PembacaInput;

public class Main {
    public static void main(String[] args) {
        PembacaInput pi = new PembacaInput(args);
        pi.baca();
        Pinjaman p = pi.getPinjaman();
        System.out.println("Okeee..");
    }
}