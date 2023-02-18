module com.example.sumadosnumeros {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sumadosnumeros to javafx.fxml;
    exports com.example.sumadosnumeros;
}