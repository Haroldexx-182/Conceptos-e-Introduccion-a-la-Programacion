module com.example.ejercicioswitchcase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicioswitchcase to javafx.fxml;
    exports com.example.ejercicioswitchcase;
}