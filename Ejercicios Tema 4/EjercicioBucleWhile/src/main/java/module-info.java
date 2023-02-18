module com.example.ejerciciobuclewhile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciobuclewhile to javafx.fxml;
    exports com.example.ejerciciobuclewhile;
}