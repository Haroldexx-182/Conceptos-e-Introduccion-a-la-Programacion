module com.example.buclefor1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buclefor1 to javafx.fxml;
    exports com.example.buclefor1;
}