package ru.ivanovds.pspu;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        init();
        drawArc();

        stage.setTitle("PSPU");
        stage.setScene(scene);
        stage.show();
    }

    public void drawArc() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            gridPane.add(new Group(new MyArc(true), new MyArc(false)), i, i);
            gridPane.add(new Group(new MyArc(true), new MyArc(false)), (size - 1) - i, i);
        }

        scene = new Scene(gridPane, 800, 600);
    }

    public void init() {
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
    }

    public static void main(String[] args) {
        launch();
    }

    GridPane gridPane;
    Scene scene;
}

class MyArc extends Arc {
    public MyArc(boolean fullCircle) {
        if (fullCircle) {
            setStartAngle(0.0f);
            setLength(360.0f);
            setStroke(Color.BLACK);
        } else {
            setStartAngle(360.0f);
            setLength(90.0f);
            setStroke(Color.RED);
        }

        setRadiusX(100.0f);
        setRadiusY(100.0f);

        setType(ArcType.ROUND);
        setFill(null);
        setStrokeWidth(5);
    }
}