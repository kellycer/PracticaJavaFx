module com.example.javafxexamen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxexamen to javafx.fxml;
    exports com.example.javafxexamen;
}