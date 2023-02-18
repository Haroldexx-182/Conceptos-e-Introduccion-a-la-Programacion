module com.example.depuraciondecodigo1_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.depuraciondecodigo1_1 to javafx.fxml;
    exports com.example.depuraciondecodigo1_1;
}