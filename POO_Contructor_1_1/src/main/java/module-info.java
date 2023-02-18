module com.example.poo_contructor_1_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poo_contructor_1_1 to javafx.fxml;
    exports com.example.poo_contructor_1_1;
}