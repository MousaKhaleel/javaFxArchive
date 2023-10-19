module com.study3fx.study3fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.study3fx.study3fx to javafx.fxml;
    exports com.study3fx.study3fx;
}