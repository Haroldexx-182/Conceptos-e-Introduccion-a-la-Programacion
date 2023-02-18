module com.example.ejerciciobucledowhile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciobucledowhile to javafx.fxml;
    exports com.example.ejerciciobucledowhile;
}