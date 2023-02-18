module com.example.callstack_piladellamadas_1_0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.callstack_piladellamadas_1_0 to javafx.fxml;
    exports com.example.callstack_piladellamadas_1_0;
}