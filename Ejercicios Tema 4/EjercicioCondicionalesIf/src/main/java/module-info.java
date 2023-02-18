module com.example.ejerciciocondicionalesif {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciocondicionalesif to javafx.fxml;
    exports com.example.ejerciciocondicionalesif;
}