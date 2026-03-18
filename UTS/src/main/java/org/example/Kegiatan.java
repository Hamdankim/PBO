package org.example;

public class Kegiatan
{
    private String judul;
    private Boolean selesai;
    private Integer prioritas; // 1 = Tinggi, 2 = Sedang, 3 = Rendah

    public Kegiatan(String judul, Integer prioritas) {
        this.judul = judul;
        this.selesai = false;
        this.prioritas = prioritas;
    }

    public void tandaiSelesai() {
        selesai = true;
    }

    public Boolean isSelesai() {
        return selesai;
    }

    public Integer getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(Integer prioritas)
    {
        this.prioritas = prioritas;
    }

    public String getJudul() {
        return judul;
    }

    public void tampilkanKegiatan() {
        System.out.println((selesai ? "[✓]" : "[ ]") + " " + judul + " (Prioritas: " + prioritas + ")");
    }
}