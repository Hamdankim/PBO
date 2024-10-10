package core;

public class Pinjaman {
    private double hutang;
    private float bunga;
    private int jumlahCicilan;
    private Angsuran[] daftarAngsuran;

    public Pinjaman(double hutang, float bunga, int jumlahCicilan) {
        this.hutang = hutang;
        this.bunga = bunga;
        this.jumlahCicilan = jumlahCicilan;
        this.daftarAngsuran = new Angsuran[(this.jumlahCicilan)];
    }

    public void hitung()
    {
        double totalPinjaman = this.hutang + (this.hutang * this.bunga / 100);
        double angsuran = totalPinjaman / this.jumlahCicilan;


        for (int i = 0; i < this.jumlahCicilan; i++)
        {
            int angsuranKe = (i+1);
            double jumlahBayar = angsuran;
            double sisaPinjaman = totalPinjaman - (angsuran * angsuranKe);

            Angsuran a = new Angsuran(angsuranKe, jumlahBayar, sisaPinjaman);
            this.daftarAngsuran[i] = a;
        }
    }

    public Angsuran[] getDaftarAngsuran() {
        return this.daftarAngsuran;
    }
}
