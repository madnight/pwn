package de.lmbrs.pwn.ui;

import de.lmbrs.pwn.reason.ChessRuleReasoner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
    stage.getIcons().add(new Image(Main.class.getResourceAsStream("/ui/icon.png")));
    stage.show();

    ChessRuleReasoner reasoner = new ChessRuleReasoner();
    reasoner.reason();
  }

}
