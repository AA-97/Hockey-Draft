module com.example.hockeydraft {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hockeydraft to javafx.fxml;
    exports com.example.hockeydraft;
}