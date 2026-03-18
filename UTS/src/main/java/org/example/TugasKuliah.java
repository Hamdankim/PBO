package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TugasKuliah extends Kegiatan {
    private String namaMataKuliah;
    private Date deadlinePengumpulan;

    public TugasKuliah(String judul, Integer prioritas, Date deadlinePengumpulan, String namaMataKuliah) {
        super(judul, prioritas);
        this.namaMataKuliah = namaMataKuliah;
        this.deadlinePengumpulan = deadlinePengumpulan;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setDeadlinePengumpulan(Date deadlinePengumpulan) {
        this.deadlinePengumpulan = deadlinePengumpulan;
    }

    public Date getDeadlinePengumpulan() {
        return deadlinePengumpulan;
    }

    @Override
    public void tampilkanKegiatan() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String getDeadlineFormatted = sdf.format(deadlinePengumpulan);

        System.out.println((isSelesai() ? "[✓]" : "[ ]") + " " + getJudul() + " (Prioritas: " + getPrioritas() + ")"
                + "(Deadline Pengumpulan: " + getDeadlineFormatted + ")"+ " (Nama Mata Kuliah: " + this.namaMataKuliah + ")");
    }
}
