module com.example.poo_propiedadprivada_1_0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poo_propiedadprivada_1_0 to javafx.fxml;
    exports com.example.poo_propiedadprivada_1_0;
}