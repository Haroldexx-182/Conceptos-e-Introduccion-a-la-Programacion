module com.example.holamundo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.holamundo to javafx.fxml;
    exports com.example.holamundo;
}