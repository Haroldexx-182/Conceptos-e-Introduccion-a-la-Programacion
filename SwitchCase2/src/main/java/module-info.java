module com.example.switchcase2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.switchcase2 to javafx.fxml;
    exports com.example.switchcase2;
}