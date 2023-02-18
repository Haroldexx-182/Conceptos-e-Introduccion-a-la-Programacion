module com.example.poo_laherencia_1_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poo_laherencia_1_3 to javafx.fxml;
    exports com.example.poo_laherencia_1_3;
}