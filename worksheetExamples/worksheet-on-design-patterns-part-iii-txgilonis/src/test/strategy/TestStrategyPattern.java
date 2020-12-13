package test.strategy;

import strategy.CapTextFormatter;
import strategy.LowerTextFormatter;
import strategy.TextEditor;
import strategy.TextFormatter;

public class TestStrategyPattern {
  public static void main(String[] args) {
    TextFormatter formatter = new CapTextFormatter();
    TextEditor editor = new TextEditor(formatter);
    editor.publishText("Testing text in caps formatter");

    formatter = new LowerTextFormatter();
    editor = new TextEditor(formatter);
    editor.publishText("Testing text in lower formatter");
  }
}