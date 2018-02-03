/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarcartelemetry;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.text.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.*;


public class SolarCarTelemetry extends Application{
    Stage window;
    
    
    @Override
    public void start(Stage primaryStage) {
        window=primaryStage;
        Label Speed =new Label("Speed:");
        
        window.setTitle("SolarCar Telemetry"); //Title of Frame
        //Gonna add panes to this pane
        BorderPane MainPane=new BorderPane();
        MainPane.setPadding(new Insets(5,5,5,5));
        
        //Data Pane
        TilePane DataPane=new TilePane();
        DataPane.setStyle("-fx-background-color: #CD5C5C;"); //use this to determine the size of your pane
        Text speed = new Text("Speed:");
        Text RPM= new Text("RPM:");
        Text PConsume= new Text("P.Consumption:");
        Text CVoltage= new Text("C.Voltage:");
        Text RunTime= new Text("RunTime:");
        Text Status= new Text("Status:");
        speed.setFont(Font.font("Arial",14));
        RPM.setFont(Font.font("Arial",14));
        PConsume.setFont(Font.font("Arial",14));
        CVoltage.setFont(Font.font("Arial",14));
        RunTime.setFont(Font.font("Arial",14));
        Status.setFont(Font.font("Arial",14));
        /* May need to use this not sure yet
        speed.setTextAlignment(TextAlignment.JUSTIFY);
        RPM.setTextAlignment(TextAlignment.JUSTIFY);
        PConsume.setTextAlignment(TextAlignment.JUSTIFY);
        CVoltage.setTextAlignment(TextAlignment.JUSTIFY);
        RunTime.setTextAlignment(TextAlignment.JUSTIFY);
        Status.setTextAlignment(TextAlignment.JUSTIFY);
        */
        //Add data to pane
        DataPane.getChildren().addAll(speed,RPM,PConsume,CVoltage,RunTime,Status);
        
        //Map Pane
        StackPane MapPane=new StackPane();
        
        //Graphs Pane
        StackPane GraphPane=new StackPane();
        
        //Add all the panes to the MainPane
        //Set the scene as the mainpane and show it on the stage(Frame)
        MainPane.setTop(DataPane);
        MainPane.setRight(MapPane);
        MainPane.setLeft(GraphPane);
        Scene Main=new Scene(MainPane,1280,720);
        window.setScene(Main);
        window.show();
    }
      
    public static void main(String[] args) {
        launch(args);
    }
    
}
