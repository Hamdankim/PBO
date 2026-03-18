package JenisKegiatan;

public class KegiatanKerja extends Kegiatan{
    private String namaPemberiTugas;

    public KegiatanKerja(String judul, Integer prioritas, String namaPemberiTugas) {
        super(judul, prioritas);
        this.namaPemberiTugas = namaPemberiTugas;
    }

    public String getNamaPemberiTugas() {
        return namaPemberiTugas;
    }

    @Override
    public void tampilkanKegiatan() {
        System.out.println((isSelesai() ? "[✓]" : "[ ]") + " " + getJudul() + " (Prioritas: " + getPrioritas() + ") " + "(Nama Pemberi Tugas: " + this.namaPemberiTugas + ") ");
    }
}
