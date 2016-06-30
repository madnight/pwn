package de.lmbrs.pwn.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

  // TODO glossary:
  // - https://en.wikipedia.org/wiki/Glossary_of_board_games
  // - https://en.wikipedia.org/wiki/Glossary_of_chess

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    stage.setTitle("PWN");
    stage.setScene(new Scene(new View(), Color.web("#1a1a1a")));
    stage.show();
  }

}
