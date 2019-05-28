/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 15: Problem 2                                            *****
 *****___________________________________________________________________________________________________________*****
 ***** 2. Create a Text object, place it in a Pane, and use a RotateTransition object to "spin" the text around. *****
 *****                         Use the following to create your RotateTransition object.                         *****
 *****                         Use a value between 500 and 4000 for value (the duration).                        *****
 *****                       Making this value too small will make the rotation hard to see.                     *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                    RotateTransition rt = new RotateTransition(Duration.millis(value), object);            *****
 *****                    rt.setByAngle(360);                                                                    *****
 *****                    rt.setCycleCount(Timeline.INDEFINITE);                                                 *****
 *****                    rt.setAutoReverse(false);                                                              *****
 *****                    rt.play();                                                                             *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                                Don't forget to add your text to your pane.                                *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.*;

public class Chapter15_2 extends Application {

    // CLASS VARIABLE(s) declaration(s)
    private Timeline animation;

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage primaryStage){

        // Creating the Pane and the Text object
        Pane pane = new Pane();
        Text text = new Text(250, 250, "Spinning Text!");

        // Adding the Text to the Pane
        pane.getChildren().add(text);

        // Setting the Scene, setting the Title of the Stage, Setting the Scene of the Stage, Showing the Stage
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Chapter 15, Problem 2: Spinning Text");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Animation that makes the Text spin
        RotateTransition rt = new RotateTransition(Duration.millis(4000), text);
        rt.setByAngle(360);
        rt.setCycleCount(Timeline.INDEFINITE);
        rt.setAutoReverse(false);
        rt.play();
    }

    public void play(){

        animation.play();
    }
}
