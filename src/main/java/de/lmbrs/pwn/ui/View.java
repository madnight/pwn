package de.lmbrs.pwn.ui;

import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

public class View extends Region {

  private static final String HTML = getResourcePath("/ui/index.html");
  private static final String CSS = getResourcePath("/ui/style.css");

  private final WebView webView = new WebView();
  private final WebEngine webEngine = webView.getEngine();

  /**
   * Here be fire dragons.
   */
  public View() {
    webEngine.getLoadWorker().stateProperty().addListener(this::onLoadingComplete);
    webEngine.setUserStyleSheetLocation(CSS);
    webEngine.load(HTML);

    webView.setContextMenuEnabled(false);
    getChildren().add(webView);
  }

  private void onLoadingComplete(ObservableValue<?> value, State oldState, State newState) {
    if (newState == State.SUCCEEDED) {
      final JSObject window = (JSObject) webEngine.executeScript("window");
      window.setMember("app", new Controller());
    }
  }

  @Override
  protected void layoutChildren() {
    layoutInArea(webView, 0, 0, getWidth(), getHeight(), 0, HPos.CENTER, VPos.CENTER);
  }

  @Override
  protected double computePrefWidth(double height) {
    return 750;
  }

  @Override
  protected double computePrefHeight(double width) {
    return 600;
  }

  private static String getResourcePath(String name) {
    return View.class.getResource(name).toExternalForm();
  }

}
