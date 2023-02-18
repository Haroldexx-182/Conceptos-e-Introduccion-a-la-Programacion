module com.example.depuraciondelcodigo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.depuraciondelcodigo to javafx.fxml;
    exports com.example.depuraciondelcodigo;
}