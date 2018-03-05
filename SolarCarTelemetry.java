package solarcartelemetry;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.text.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
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
        DataPane.setStyle("-fx-background-color: linear-gradient(to bottom, #924444, #E87373);"
                + "-fx-background-radius: 0px 0px 6px 6px;" 
                ); //use this to determine the size of your pane and other things
        DataPane.setPrefHeight(60);
        DataPane.setHgap(130);
        
        //Text objects in DataPane
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
        
        //Centers all the text objects
        speed.setTextAlignment(TextAlignment.CENTER);
        RPM.setTextAlignment(TextAlignment.CENTER);
        PConsume.setTextAlignment(TextAlignment.CENTER);
        CVoltage.setTextAlignment(TextAlignment.CENTER);
        RunTime.setTextAlignment(TextAlignment.CENTER);
        Status.setTextAlignment(TextAlignment.CENTER);
        
        //Add data to pane
        DataPane.getChildren().addAll(speed,RPM,PConsume,CVoltage,RunTime,Status);
        
        //Map Pane
        StackPane MapPane=new StackPane();
        MapPane.setStyle("-fx-background-color: #CBCBCB;");
        Rectangle demo = new Rectangle(420, 300);
        Text demoText = new Text("MAP GOES HERE");
        demoText.setFill(Color.WHITE); 
        demo.setFill(Color.BLACK); 
        demoText.setTranslateY(demo.getY() - demo.getHeight()/2);
        MapPane.getChildren().addAll(demo, demoText);
        MapPane.setAlignment(Pos.BOTTOM_CENTER);
        //Graphs Pane
        StackPane GraphPane=new StackPane();
        
        //Add all the panes to the MainPane
        //Set the scene as the mainpane and show it on the stage(Frame)
        MainPane.setTop(DataPane);
        MainPane.setRight(GraphPane);
        MainPane.setLeft(MapPane);
        Scene Main=new Scene(MainPane,1280,720);
        window.setScene(Main);
        window.show();
        primaryStage.setFullScreen(true);   //Automatically launches in fullscreen
    }
      
    public static void main(String[] args) {
        launch(args);
    }
    
}
