module com.example.pasoporvalor_1_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pasoporvalor_1_1 to javafx.fxml;
    exports com.example.pasoporvalor_1_1;
}