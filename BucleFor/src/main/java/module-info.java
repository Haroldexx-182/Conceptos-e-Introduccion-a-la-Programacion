module com.example.buclefor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buclefor to javafx.fxml;
    exports com.example.buclefor;
}