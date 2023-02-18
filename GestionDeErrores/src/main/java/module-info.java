module com.example.gestiondeerrores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestiondeerrores to javafx.fxml;
    exports com.example.gestiondeerrores;
}