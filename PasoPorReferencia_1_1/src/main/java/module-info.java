module com.example.pasoporreferencia_1_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pasoporreferencia_1_1 to javafx.fxml;
    exports com.example.pasoporreferencia_1_1;
}