module ru.ivanovds.pspu {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ivanovds.pspu to javafx.fxml;
    exports ru.ivanovds.pspu;
}