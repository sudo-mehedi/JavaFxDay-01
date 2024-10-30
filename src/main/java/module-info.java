module com.winrysoft.demo {
    requires javafx.controls;
    requires javafx.fxml;
    // requires javafx.web;

    opens com.winrysoft.demo to javafx.fxml;
    exports com.winrysoft.demo;
}
