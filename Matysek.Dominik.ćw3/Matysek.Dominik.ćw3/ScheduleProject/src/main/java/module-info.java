module pl.polsl.scheduleproject{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens pl.polsl.scheduleproject to javafx.fxml;
    exports pl.polsl.scheduleproject;
}