module com.example.programacion_orientada_objetos_1_0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programacion_orientada_objetos_1_0 to javafx.fxml;
    exports com.example.programacion_orientada_objetos_1_0;
}