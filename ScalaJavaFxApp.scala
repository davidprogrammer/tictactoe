package ticTacToeWithGUI

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.Button
import javafx.scene.control.ListView
import javafx.collections.FXCollections
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import javafx.scene.Group
import javafx.scene.Scene
import javafx.collections.ObservableList
import javafx.scene.control.ComboBox
import javafx.scene.layout.VBox
import javafx.scene.control.TextField
import javafx.event.EventHandler
import javafx.event.ActionEvent
 
class ScalaJavaFXApp extends Application {
  println("ScalaJavaFXApp constructor")
 
  var topLeft = "n"
  var topMiddle = "n"
  var topRight = "n"
  var middleLeft = "n"
  var middleMiddle = "n"
  var middleRight = "n"
  var bottomLeft = "n"
  var bottomMiddle = "n"
  var bottomRight = "n"
 
  def ticTacMatch(xOrO: String, myPositionString: String) = myPositionString match {
    case "top left" if (topLeft == "n")           => topLeft = xOrO
    case "top middle" if (topMiddle == "n")       => topMiddle = xOrO
    case "top right" if (topRight == "n")         => topRight = xOrO
    case "middle left" if (middleLeft == "n")     => middleLeft = xOrO
    case "middle middle" if (middleMiddle == "n") => middleMiddle = xOrO
    case "middle right" if (middleRight == "n")   => middleRight = xOrO
    case "bottom left" if (bottomLeft == "n")     => bottomLeft = xOrO
    case "bottom middle" if (bottomMiddle == "n") => bottomMiddle = xOrO
    case "bottom right" if (bottomRight == "n")   => bottomRight = xOrO
  }
 
  def start(stage: Stage): Unit = {
    println("start " + stage)
    val button = new Button("go")
    val list = new ListView[String]();
    val xOrOList = new ListView[String]();
    val items = FXCollections.observableArrayList(
      "top left", "top middle", "top right", "middle left", "middle middle", "middle right", "bottom left", "bottom middle", "bottom right");
    list.setItems(items);
    val items2 = FXCollections.observableArrayList(
      "x", "o");
    xOrOList.setItems(items2)
 
    //list.getSelectionModel().select(0)
    //xOrOList.getSelectionModel().select(0)
 
    var textField1 = new TextField();
    var textField2 = new TextField();
    var textField3 = new TextField();
    var textField4 = new TextField();
    var textField5 = new TextField();
    var textField6 = new TextField();
 
    button.setOnAction(new EventHandler[ActionEvent]() {
      override def handle(event: ActionEvent): Unit = {
 
        def bigListSelection = list.getSelectionModel().getSelectedItem()
        def smallListSelection = xOrOList.getSelectionModel().getSelectedItem()
 
        ticTacMatch(smallListSelection, bigListSelection)
 
        textField1.setText(topLeft + " | " + topMiddle + " | " + topRight)
        //textField2.setText("----------")
        textField3.setText(middleLeft + " | " + middleMiddle + " | " + middleRight)
        //textField4.setText("----------")
        textField5.setText(bottomLeft + " | " + bottomMiddle + " | " + bottomRight)
 
        //     var noOneWonYet = true
        //  while ((topLeft == "n" || topMiddle == "n" || topRight == "n" || middleLeft == "n" || middleMiddle == "n" || middleRight =="n"
        //    || bottomLeft == "n" | bottomMiddle == "n" || bottomRight == "n") && noOneWonYet) {
        //    var XorO = readLine("enter your side")
        //    var positionToBePlayed = readLine("enter your position")
        //
        //    ticTacMatch(XorO, positionToBePlayed)
        if ((topLeft == "x" && topMiddle == "x" && topRight == "x") || (middleLeft == "x" && middleMiddle == "x" && middleRight == "x") || (bottomLeft == "x"
          && bottomMiddle == "x" && bottomRight == "x") || (topLeft == "x" && middleLeft == "x" && bottomLeft == "x") || (topMiddle == "x" && middleMiddle == "x"
            && bottomMiddle == "x") || (topLeft == "x" && middleMiddle == "x" && bottomRight == "x") || (topRight == "x" && middleMiddle == "x" && bottomLeft == "x")) {
          // noOneWonYet = false
          textField6.setText("x has won")
        }
        if ((topLeft == "o" && topMiddle == "o" && topRight == "o") || (middleLeft == "o" && middleMiddle == "o" && middleRight == "o") || (bottomLeft == "o"
          && bottomMiddle == "o" && bottomRight == "o") || (topLeft == "o" && middleLeft == "o" && bottomLeft == "o") || (topMiddle == "o" && middleMiddle == "o"
            && bottomMiddle == "o") || (topLeft == "o" && middleMiddle == "o" && bottomRight == "o") || (topRight == "o" && middleMiddle == "o" && bottomLeft == "o")) {
          // noOneWonYet = false
          textField6.setText("o has won")
        }
 
      }
    })
 
    //val comboBox = new ComboBox[String]
 
    //    ObservableList[String] options =
    //    FXCollections.observableArrayList(
    //        "Option 1",
    //        "Option 2",
    //        "Option 3"
    //    );
    list.setPrefWidth(100)
    list.setPrefHeight(300)
    xOrOList.setPrefWidth(100);
    xOrOList.setPrefHeight(300);
 
    val vbox = new VBox(8); // spacing = 8
    vbox.getChildren().addAll(list, xOrOList, textField1, textField3, textField5, textField6);
 
    val root = new StackPane();
    root.getChildren().add(vbox);
    // root.getChildren().add(xOrOList)
    root.getChildren().add(button);
    stage.setScene(new Scene(root, 800, 800));
    stage.show();
 
    //primaryStage
  }
}
 
object ScalaJavaFXApp {
  def main(args: Array[String]): Unit = {
    println("Launching ScalaJavaFXApp")
    Application.launch(classOf[ScalaJavaFXApp], args: _*)
  }
}