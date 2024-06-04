module com.example.handoutletters {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.handoutletters to javafx.fxml;
    exports com.example.handoutletters;
}