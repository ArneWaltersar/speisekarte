/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speisekarte;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Fenster extends Application {

    private StackPane root;
    private GridPane grid;
    private GridPane grid1;
    private GridPane grid2;
    private GridPane grid3;
    private GridPane grid4;
    private GridPane grid5;
    private GridPane grid6;
    private GridPane grid7;
    private Label label1;
    private Label label2;
    private Label label3;
    private Label label4;
    private Label label5;
    private Label label6;
    private Label label7;
    private Label label8;
    private Label label9;
    private Label label10;
    private Label label11;
    private Label label12;
    private Label label13;
    private TextField spnr1;
    private TextField bezeich;
    private TextField kategorie;
    private TextField preis;
    private TextField spnr2;
    private TextField spnr3;
    private TextField neuerPreis;
    private Button hinzufuegen;
    private Button loeschen;
    private Button aendern;
    private Button anzeigen;
    private Button start1;
    private Button start2;
    private Button start3;
    private TextArea ausgabe;
    private ComboBox<String> combo;
    private RadioButton fuenf;
    private RadioButton zehn;
    private RadioButton fuenfzehn;
    private ToggleGroup group;
    private CheckBox ohnemwst;

    @Override
    public void start(Stage primaryStage) {

        root = new StackPane();
        primaryStage.setScene(new Scene(root, 400, 900));
        primaryStage.setTitle("Speisekarte");

        grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setPadding(new Insets(12));

        grid1 = new GridPane();
        grid1.setVgap(5);
        grid1.setHgap(5);
        grid1.setPadding(new Insets(12));

        label1 = new Label("Datensatz hinzufügen");
        label2 = new Label("Speisen-Nr:");
        label3 = new Label("Bezeichnung:");
        label4 = new Label("Kategorie:");
        label5 = new Label("Preis:");
        spnr1 = new TextField();
        bezeich = new TextField();
        kategorie = new TextField();
        preis = new TextField();
        hinzufuegen = new Button("hinzufügen");

        grid2 = new GridPane();
        grid2.setVgap(5);
        grid2.setHgap(5);
        grid2.setPadding(new Insets(12));

        label6 = new Label("Datensatz löschen");
        label7 = new Label("Speisen-Nr:");
        spnr2 = new TextField();
        loeschen = new Button("löschen");

        grid3 = new GridPane();
        grid3.setVgap(5);
        grid3.setHgap(5);
        grid3.setPadding(new Insets(12));

        label8 = new Label("Preisänderung");
        label9 = new Label("Speisen-Nr:");
        label10 = new Label("neuer Preis");
        spnr3 = new TextField();
        neuerPreis = new TextField();
        aendern = new Button("ändern");

        grid4 = new GridPane();
        grid4.setVgap(5);
        grid4.setHgap(5);
        grid4.setPadding(new Insets(12));

        anzeigen = new Button("Datensätze anzeigen");
        ausgabe = new TextArea();

        grid5 = new GridPane();
        grid5.setVgap(5);
        grid5.setHgap(5);
        grid5.setPadding(new Insets(12));

        label11 = new Label("Kategorie löschen");
        combo = new ComboBox<String>();
        getCombo().getItems().addAll("Fleisch", "Vegetarisch", "Appetizer", "Eis", "Kuchen", "Salat", "Suppe");
        getCombo().setValue("Fleisch");
        start1 = new Button("Start");

        grid6 = new GridPane();
        grid6.setVgap(5);
        grid6.setHgap(5);
        grid6.setPadding(new Insets(12));

        label12 = new Label("Preiserhöhung");
        fuenf = new RadioButton("5 %");
        zehn = new RadioButton("10 %");
        fuenfzehn = new RadioButton("15 %");
        start2 = new Button("Start");
        group = new ToggleGroup();
        getFuenf().setToggleGroup(group);
        getZehn().setToggleGroup(group);
        getFuenfzehn().setToggleGroup(group);
        
        grid7 = new GridPane();
        grid7.setVgap(5);
        grid7.setHgap(5);
        grid7.setPadding(new Insets(12));
        
        label13 = new Label("Preisliste ausgeben");
        ohnemwst = new CheckBox("ohne Mehrwertsteuer");
        start3 = new Button("Start");

        grid.add(grid1, 0, 1);
        grid.add(grid2, 0, 2);
        grid.add(grid3, 0, 3);
        grid.add(grid4, 0, 4);
        grid.add(grid5, 0, 5);
        grid.add(grid6, 0, 6);
        grid.add(grid7, 0, 7);
        grid1.add(label1, 0, 0);
        grid1.add(label2, 0, 1);
        grid1.add(label3, 0, 2);
        grid1.add(label4, 0, 3);
        grid1.add(label5, 0, 4);
        grid1.add(getSpnr1(), 1, 1);
        grid1.add(getBezeich(), 1, 2);
        grid1.add(getKategorie(), 1, 3);
        grid1.add(getPreis(), 1, 4);
        grid1.add(getHinzufuegen(), 2, 4);
        grid2.add(label6, 0, 0);
        grid2.add(label7, 0, 1);
        grid2.add(getSpnr2(), 1, 1);
        grid2.add(getLoeschen(), 2, 1);
        grid3.add(label8, 0, 0);
        grid3.add(label9, 0, 1);
        grid3.add(label10, 0, 2);
        grid3.add(getSpnr3(), 1, 1);
        grid3.add(getNeuerPreis(), 1, 2);
        grid3.add(getAendern(), 2, 2);
        grid4.add(getAnzeigen(), 0, 0);
        grid4.add(ausgabe, 0, 1);
        grid5.add(label11, 0, 0);
        grid5.add(getCombo(), 0, 1);
        grid5.add(getStart1(), 2, 1);
        grid6.add(label12, 0, 0);
        grid6.add(getFuenf(), 0, 1);
        grid6.add(getZehn(), 0, 2);
        grid6.add(getFuenfzehn(), 0, 3);
        grid6.add(getStart2(), 2, 3);
        grid7.add(label13, 0, 0);
        grid7.add(getOhnemwst(), 0, 1);
        grid7.add(getStart3(), 2, 1);

        root.getChildren().add(grid);
        primaryStage.show();
        Presenter.start(this);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public Button getHinzufuegen() {
        return hinzufuegen;
    }

    public Button getLoeschen() {
        return loeschen;
    }

    public Button getAendern() {
        return aendern;
    }

    public Button getAnzeigen() {
        return anzeigen;
    }

    public Button getStart1() {
        return start1;
    }

    public Button getStart2() {
        return start2;
    }

    public Button getStart3() {
        return start3;
    }

    public void setAusgabe(String ausgabe) {
        this.ausgabe.setText(ausgabe);
    }

    public ComboBox<String> getCombo() {
        return combo;
    }

    public RadioButton getFuenf() {
        return fuenf;
    }

    public RadioButton getZehn() {
        return zehn;
    }

    public RadioButton getFuenfzehn() {
        return fuenfzehn;
    }

    public CheckBox getOhnemwst() {
        return ohnemwst;
    }

    public TextField getSpnr1() {
        return spnr1;
    }

    public TextField getBezeich() {
        return bezeich;
    }

    public TextField getKategorie() {
        return kategorie;
    }

    public TextField getPreis() {
        return preis;
    }

    public TextField getSpnr2() {
        return spnr2;
    }

    public TextField getSpnr3() {
        return spnr3;
    }

    public TextField getNeuerPreis() {
        return neuerPreis;
    }
}
