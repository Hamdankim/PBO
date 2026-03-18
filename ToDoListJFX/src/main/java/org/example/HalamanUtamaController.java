package org.example;

import core.Kegiatan;
import core.ToDoListModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class HalamanUtamaController {
    @FXML
    private TextField txtKegiatan;
    @FXML
    private Button btnTambah;
    @FXML
    private ListView<String> lstDaftarKegiatan;
    private int count;
    private ToDoListModel model;

    @FXML
    public void initialize() {
        this.model = new ToDoListModel();
    }

    public void btnTambah_Action(ActionEvent actionEvent) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String strKegiatan = this.txtKegiatan.getText();
        Kegiatan k = new Kegiatan(strKegiatan);
        this.model.tambahKegiatan(k);

        this.lstDaftarKegiatan.getItems().add(strKegiatan);
        this.txtKegiatan.clear();
    }

    public void btnTandaiSelesai_Action(ActionEvent actionEvent) {

    }

    public void btnHapus_Action(ActionEvent actionEvent) {

    }

}
