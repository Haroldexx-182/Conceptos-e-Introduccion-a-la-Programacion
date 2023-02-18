module com.example.lascondicionales {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lascondicionales to javafx.fxml;
    exports com.example.lascondicionales;
}