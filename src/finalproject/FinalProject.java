/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Rachel
 */
public class FinalProject extends Application {
    
        
    @Override
    public void start(Stage primaryStage) {
        
        //Create FlowPane layout
        BorderPane BorderPaneRoot = new BorderPane();
        BorderPaneRoot.setPadding(new Insets(10, 10, 10, 10));    //Top, Right, Bottom, Left
        
        Label mainLabel = new Label("Inventory Management");
        BorderPaneRoot.getChildren().add(mainLabel);
        
        //TOP
        //////////////////////////////////////////
        VBox VBoxTop = new VBox();
        VBoxTop.setAlignment(Pos.CENTER);
        VBoxTop.getChildren().add(mainLabel);
        BorderPaneRoot.setTop(VBoxTop);
        /////////////////////////////////////////
        
        // LEFT
        ///////////////////////////////////////////////////////////////////
        Button prodsBtn = new Button("Manage Products");
        prodsBtn.setPadding(new Insets(5, 5, 5, 5));
        prodsBtn.setPrefHeight(30);
        prodsBtn.setPrefWidth(150);
        BorderPaneRoot.setLeft(prodsBtn);
        BorderPane.setMargin(prodsBtn, new Insets(10, 10, 10, 10));
        prodsBtn.setOnAction((ActionEvent e) -> prodsBtn_OnAction(e));
        ///////////////////////////////////////////////////////////////////
        
        // RIGHT
        ///////////////////////////////////////////////////////////////////
        Button catBtn = new Button("Manage Categories");
        catBtn.setPadding(new Insets(5, 5, 5, 5));
        catBtn.setPrefHeight(30);
        catBtn.setPrefWidth(150);
        BorderPaneRoot.setRight(catBtn);
        BorderPane.setMargin(catBtn, new Insets(10, 10, 10, 10));
        catBtn.setOnAction((ActionEvent e) -> catBtn_OnAction(e));
        ///////////////////////////////////////////////////////////////////
        
        
        //Create a scene and set the root node to the BorderPane
        Scene scene = new Scene(BorderPaneRoot, 350, 100);
        //Setup the Stage
        primaryStage.setTitle("Menu");
        primaryStage.setScene(scene);
        primaryStage.show();   
        
    }
    
    private void catBtn_OnAction(ActionEvent e)
        {
            //Create the new window which inherits from Stage
            categoriesStage clsCategoriesStage = new categoriesStage();
            //Make it so the new window has to be closed before the main window may be interacted with
            clsCategoriesStage.initModality(Modality.APPLICATION_MODAL);
            //Show new window
            clsCategoriesStage.show();
            System.out.println("I am category");
        }
    
    private void prodsBtn_OnAction(ActionEvent e)
        {
            //Create the new window which inherits from Stage
            productsStage clsProductsStage = new productsStage();
            //Make it so the new window has to be closed before the main window may be interacted with
            clsProductsStage.initModality(Modality.APPLICATION_MODAL);
            //Show new window
            clsProductsStage.show();
            System.out.println("I am product");
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
