package io;
import core.Pinjaman;

public class PembacaInput {
    private String[] args;
    private Pinjaman pinjaman;

    public PembacaInput(String[] args) {
        this.args = args;
    }

    public void baca() {
        double hutang = Double.parseDouble(args[0]);
        float bunga = Float.parseFloat(this.args[1]);
        int jumlahCicilan = Integer.parseInt(this.args[2]);

        this.pinjaman = new Pinjaman(hutang, bunga, jumlahCicilan);
    }

    public Pinjaman getPinjaman() {
        return this.pinjaman;
    }
}
