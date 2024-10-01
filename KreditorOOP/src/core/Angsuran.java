package core;

public class Angsuran {
    private int angsuranKe;
    private double jumlahBayar;
    private double sisaPinjaman;

    public Angsuran(int angsuranKe, double jumlahBayar, double sisaPinjaman) {
        this.angsuranKe = angsuranKe;
        this.jumlahBayar = jumlahBayar;
        this.sisaPinjaman = sisaPinjaman;
    }

    public String getAngsuranKe() {
        return String.valueOf(this.angsuranKe);
    }

    public String getJumlahBayar() {
        return String.valueOf(this.jumlahBayar);
    }

    public String getSisaPinjaman() {
        return String.valueOf(this.sisaPinjaman);
    }
}
