package strategy;

public class TextEditor {
  private final TextFormatter textFormatter;

  public TextEditor(TextFormatter textFormatter) {
    this.textFormatter = textFormatter;
  }

  public void publishText(String text) {
    //similar idea to command - publishText will use the textformatter format method
    textFormatter.format(text);
  }
}