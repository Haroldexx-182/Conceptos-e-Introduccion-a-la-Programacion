module com.example.pasoporreferenciaobjeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pasoporreferenciaobjeto to javafx.fxml;
    exports com.example.pasoporreferenciaobjeto;
}