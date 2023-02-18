module com.example.sumafuncionclass05_02_23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sumafuncionclass05_02_23 to javafx.fxml;
    exports com.example.sumafuncionclass05_02_23;
}