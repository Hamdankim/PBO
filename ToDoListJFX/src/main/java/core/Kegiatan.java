package core;

import java.util.Date;

public class Kegiatan
{
    private String nama;
    private Boolean status;
    private Date tenggatWaktu;

    public Kegiatan(String nama)
    {
        this.nama = nama;
        this.status = false;
        this.tenggatWaktu = null;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getTenggatWaktu() {
        return tenggatWaktu;
    }

    public java.sql.Date getTenggatWaktuSql()
    {
        if (this.tenggatWaktu == null) return null;
        return new java.sql.Date(tenggatWaktu.getTime());
    }

    public void setTenggatWaktu(Date tenggatWaktu) {
        this.tenggatWaktu = tenggatWaktu;
    }
}
