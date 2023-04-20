module com.example.project2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project2 to javafx.fxml;
    exports com.example.project2;
    exports com.example.project2.test;
    opens com.example.project2.test to javafx.fxml;
}