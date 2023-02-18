module com.example.ejercicioreferenciamicoche {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicioreferenciamicoche to javafx.fxml;
    exports com.example.ejercicioreferenciamicoche;
}