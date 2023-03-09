module com.example.ticketbooking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ticketbooking to javafx.fxml;
    exports com.example.ticketbooking;
}