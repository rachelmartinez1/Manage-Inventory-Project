/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Rachel
 */
public class categoriesStage extends Stage {
    
    public categoriesStage() {
    //Just create a dummy window to display
        
        //Create a Label
        Label secondLabel = new Label("I'm a Label on new Window");
        //Create a StackPane to hold the Label
        StackPane secondaryLayout = new StackPane();
        //Add the Label to the StackPane
        secondaryLayout.getChildren().add(secondLabel);
        //Create a scene by seting the root of the Scene to the StackPane
        Scene secondScene = new Scene(secondaryLayout, 230, 100);
        //Setup the Stage, use "this" because we inherited from the Stage class
        this.setTitle("Second Window/Stage");
        this.setScene(secondScene);
        this.setX(500);
        this.setY(500);
    }
    
}
