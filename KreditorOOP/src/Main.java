import core.Angsuran;
import core.Pinjaman;
import io.PembacaInput;
import io.Penampil;

public class Main {
    public static void main(String[] args) {
        PembacaInput pi = new PembacaInput(args);
        pi.baca();
        Pinjaman p = pi.getPinjaman();
        System.out.println("Sampai disini dapat Pinjaman");
        p.hitung();
        Angsuran[] daftarAngsuran = p.getDaftarAngsuran();
        System.out.println("Sampai disini dapat daftar angsuran");
        Penampil penampil = new Penampil(daftarAngsuran);
        penampil.gambarHeaderTabel();
        penampil.gambarBodyTabel();
    }
}