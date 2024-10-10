package io;

import core.Angsuran;

public class Penampil {
    private Angsuran[] daftarAngsuran;

    public Penampil(Angsuran[] daftarAngsuran) {
        this.daftarAngsuran = daftarAngsuran;
    }

    public void gambarHeaderTabel() {
        System.out.println("------------------+------------------+-----------------+");
        System.out.println("|   Angsuran Ke   |   Jumlah Bayar   |  Sisa Pinjaman  |");
        System.out.println("------------------+------------------+-----------------+");
    }

    public void gambarBodyTabel() {
        for (Angsuran a : this.daftarAngsuran) {
            String strAngsuran = a.getAngsuranKe();
            String strJumlahBayar = a.getJumlahBayar();
            String strSisaPinjaman = a.getSisaPinjaman();

            strAngsuran = this.rataKanan(strAngsuran, 17);
            strJumlahBayar = this.rataKanan(strJumlahBayar, 18);
            strSisaPinjaman = this.rataKanan(strSisaPinjaman, 17);

            System.out.println("|" + strAngsuran + "|" + strJumlahBayar + "|" + strSisaPinjaman + "|");
            System.out.println("------------------+------------------+-----------------+");
        }
    }

    private String rataKanan(String nilai, int panjangMaksKolom) {
        return String.format("%" + panjangMaksKolom + "s", nilai+ " ");
    }
}
