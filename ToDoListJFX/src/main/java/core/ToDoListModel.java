package core;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ToDoListModel
{
    private final String DB_URL = "jdbc:mysql://localhost:3306/todo_list_2g";
    private final String DB_USER = "root";
    private final String DB_PASS = "";

    private Connection connection;

    public ToDoListModel()
    {
        try {
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Berhasil terhubung ke database.");
        }
        catch (Exception e) {
            System.out.println("Gagal terhubung ke database. Deatails: "+ e.getMessage());
        }
    }

    public void tambahKegiatan(Kegiatan kegiatan)
    {
        String sql = "INSERT INTO kegiatan (nama, status, tenggatWaktu) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(1, kegiatan.getNama());
            ps.setBoolean(2, kegiatan.isStatus());
            ps.setDate(3, kegiatan.getTenggatWaktuSql());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Gagal menambahkan kegiatan. Details: "+ e.getMessage());
        }
    }

}
