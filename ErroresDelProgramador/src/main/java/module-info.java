module com.example.erroresdelprogramador {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.erroresdelprogramador to javafx.fxml;
    exports com.example.erroresdelprogramador;
}