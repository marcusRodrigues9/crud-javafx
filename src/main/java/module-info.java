module com.example.primeirocrud {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeirocrud to javafx.fxml;
    exports com.example.primeirocrud;
}