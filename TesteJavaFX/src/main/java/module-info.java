module com.devsanttos.testejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.devsanttos.testejavafx.controller to javafx.fxml;
//    opens com.devsanttos.testejavafx to javafx.fxml;
    exports com.devsanttos.testejavafx;
}