module com.example.switchcase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.switchcase to javafx.fxml;
    exports com.example.switchcase;
}