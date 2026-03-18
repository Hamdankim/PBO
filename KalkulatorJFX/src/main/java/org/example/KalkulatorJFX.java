package org.example;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class KalkulatorJFX extends Application implements EventHandler
{
    private TextField txtInput1;
    private TextField txtInput2;
    private TextField txtHasil;
    private Button btnTambah;
    private Button btnKurang;
    private Button btnKali;
    private Button btnBagi;
    // Scene
    private Scene scene;
    // Root Layout
    private VBox verticalLayout;
    private HBox horizontalLayout;

    @Override
    public void start(Stage stage) throws Exception
    {
        this.txtInput1 = new TextField();
        this.txtInput1.setPromptText("Masukkan Bilangan-1");
        this.txtInput2 = new TextField();
        this.txtInput2.setPromptText("Masukkan Bilangan-2");
        this.txtHasil = new TextField();
        this.txtHasil.getStyleClass().add("button");

        // Buttons
        this.btnTambah = new Button("Tambah [ + ]");
        this.btnKurang = new Button("Kurang [ - ]");
        this.btnKali = new Button("Kali [ x ]");
        this.btnBagi = new Button("Bagi [ / ]");

        // Styling buttons
        this.btnTambah.getStyleClass().add("button");
        this.btnKurang.getStyleClass().add("button");
        this.btnKali.getStyleClass().add("button");
        this.btnBagi.getStyleClass().add("button");
        this.txtInput1.getStyleClass().add("input");
        this.txtInput2.getStyleClass().add("input");
        this.txtHasil.getStyleClass().add("hasil");

        // Layout horizontal untuk buttons
        this.horizontalLayout = new HBox();
        this.horizontalLayout.getChildren().add(this.btnTambah);
        this.horizontalLayout.getChildren().add(this.btnKurang);
        this.horizontalLayout.getChildren().add(this.btnKali);
        this.horizontalLayout.getChildren().add(this.btnBagi);
        this.horizontalLayout.setSpacing(10);


        // Letakkan komponen ke layout
        this.verticalLayout = new VBox();
        this.verticalLayout.getChildren().add(this.txtInput1);
        this.verticalLayout.getChildren().add(this.txtInput2);
        this.verticalLayout.getChildren().add(this.horizontalLayout);
        this.verticalLayout.getChildren().add(this.txtHasil);
        this.verticalLayout.setMargin(txtInput1, new Insets(0, 0, 10, 0));
        this.verticalLayout.setMargin(txtInput2, new Insets(0, 0, 10, 0));
        this.verticalLayout.setMargin(this.horizontalLayout, new Insets(0, 0, 10, 0));

        // Masukkan layout ke dalam scene
        this.scene = new Scene(this.verticalLayout, 420, 400);

        // Menambahkan CSS ke scene
        this.scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        // Masukkan scene ke stage
        stage.setScene(this.scene);

        // Tampilkan stage
        stage.setTitle("KalkulatorJFX");
        stage.show();

        // Handle click event dari setiap button
        this.btnTambah.setOnAction(this);
        this.btnKurang.setOnAction(this);
        this.btnKali.setOnAction(this);
        this.btnBagi.setOnAction(this);

    }

    @Override
    public void handle(Event event)
    {
        if (event.getSource() == this.btnTambah)
        {
            this.tampilkanHasilPenjumlahan();
        } else if (event.getSource() == this.btnKurang){
            this.tampilkanHasilPengurangan();
        } else if (event.getSource() == this.btnKali){
            this.tampilkanHasilPerkalian();
        } else if (event.getSource() == this.btnBagi){
            this.tampilkanHasilPembagian();
        }

    }

    private void tampilkanHasilPenjumlahan()
    {
        // Ambil input dari txtInput 1 dan 2
        String strB1 = this.txtInput1.getText();
        String strB2 = this.txtInput2.getText();

        // Konversi string input tadi ke double
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);
        double hasil = b1 + b2;

        // Tampilkan hasil ke txtHasil
        this.txtHasil.setText(String.valueOf(hasil));
    }

    private void tampilkanHasilPengurangan()
    {
        // Ambil input dari txtInput 1 dan 2
        String strB1 = this.txtInput1.getText();
        String strB2 = this.txtInput2.getText();

        // Konversi string input tadi ke double
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);
        double hasil = b1 - b2;

        // Tampilkan hasil ke txtHasil
        this.txtHasil.setText(String.valueOf(hasil));
    }
    private void tampilkanHasilPerkalian()
    {
        // Ambil input dari txtInput 1 dan 2
        String strB1 = this.txtInput1.getText();
        String strB2 = this.txtInput2.getText();

        // Konversi string input tadi ke double
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);
        double hasil = b1 * b2;

        // Tampilkan hasil ke txtHasil
        this.txtHasil.setText(String.valueOf(hasil));
    }
    private void tampilkanHasilPembagian()
    {
        // Ambil input dari txtInput 1 dan 2
        String strB1 = this.txtInput1.getText();
        String strB2 = this.txtInput2.getText();

        // Konversi string input tadi ke double
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);
        double hasil = b1 / b2;

        // Tampilkan hasil ke txtHasil
        this.txtHasil.setText(String.valueOf(hasil));
    }
}
