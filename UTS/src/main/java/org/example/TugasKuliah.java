package JenisKegiatan;

import org.example.Alat;

import java.util.Date;

public class TugasKuliah extends Kegiatan {
    private String namaMataKuliah;
    private Date deadlinePengumpulan;

    public TugasKuliah(String judul, Integer prioritas, String namaMataKuliah, String deadlinePengumpulan) {
        super(judul, prioritas);
        this.namaMataKuliah = namaMataKuliah;
        this.deadlinePengumpulan = Alat.konversiKeTanggal(deadlinePengumpulan);
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public Date getDeadlinePengumpulan() {
        return deadlinePengumpulan;
    }

    @Override
    public void tampilkanKegiatan() {
        System.out.println((isSelesai() ? "[✓]" : "[ ]") + " " + getJudul() + " (Prioritas: " + getPrioritas() + ")" + "(Nama Mata Kuliah: "+ this.namaMataKuliah + ")" + "(Deadline Pengumpulan: " + this.deadlinePengumpulan+") ");
    }
}
