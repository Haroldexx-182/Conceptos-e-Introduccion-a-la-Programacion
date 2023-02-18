module com.example.poo_laencapsulacion_1_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poo_laencapsulacion_1_2 to javafx.fxml;
    exports com.example.poo_laencapsulacion_1_2;
}