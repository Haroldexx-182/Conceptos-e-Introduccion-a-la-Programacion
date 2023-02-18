module com.example.ejercicio_poo_propiedadprivada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio_poo_propiedadprivada to javafx.fxml;
    exports com.example.ejercicio_poo_propiedadprivada;
}