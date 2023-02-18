module com.example.repercusiondeloserrores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repercusiondeloserrores to javafx.fxml;
    exports com.example.repercusiondeloserrores;
}