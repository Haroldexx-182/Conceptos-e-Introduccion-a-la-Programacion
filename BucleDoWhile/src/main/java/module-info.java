module com.example.bucledowhile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bucledowhile to javafx.fxml;
    exports com.example.bucledowhile;
}