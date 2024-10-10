module com.example.shopapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
 requires mysql.connector.j;


    opens com.example.shopapp to javafx.fxml;
    exports com.example.shopapp;
}