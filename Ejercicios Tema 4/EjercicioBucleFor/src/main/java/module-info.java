module com.example.ejerciciobuclefor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciobuclefor to javafx.fxml;
    exports com.example.ejerciciobuclefor;
}