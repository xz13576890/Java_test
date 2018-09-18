package Test_BasicJava_Concept;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Test_JavaFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Square");
        Group root = new Group();
        Scene scene = new Scene(root,500,500);
        primaryStage.setScene(scene);

        Rectangle r = new Rectangle(100,100,100,100);
        r.setFill(Color.RED);

        Text hi = new Text("Hello world!");
        hi.setFont(Font.font("Terr",40));


        root.getChildren().add(r);

        primaryStage.show();


    }
}
