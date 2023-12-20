module com.example.ballgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ballgame to javafx.fxml;
    exports com.example.ballgame;
}