module com.armaged {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.city to javafx.fxml;
    exports com.city;
}
