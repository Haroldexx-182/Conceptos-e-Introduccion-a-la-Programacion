module com.example.buclewhile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buclewhile to javafx.fxml;
    exports com.example.buclewhile;
}