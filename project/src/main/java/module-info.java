module org.example.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens org.example.view to javafx.fxml;
    exports org.example;
    exports org.example.controller to javafx.fxml;
    opens org.example to javafx.fxml;
    opens org.example.controller;
     opens org.example.entity to javafx.base;
}