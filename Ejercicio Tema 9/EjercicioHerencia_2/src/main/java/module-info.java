module com.example.ejercicioherencia_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicioherencia_2 to javafx.fxml;
    exports com.example.ejercicioherencia_2;
}