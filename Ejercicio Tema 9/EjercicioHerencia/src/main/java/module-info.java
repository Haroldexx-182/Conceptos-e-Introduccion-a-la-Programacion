module com.example.ejercicioherencia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicioherencia to javafx.fxml;
    exports com.example.ejercicioherencia;
}