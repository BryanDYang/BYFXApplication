module com.example.byfxapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens BY.byfxmlapplication to javafx.fxml;
    opens controller to javafx.fxml;
}