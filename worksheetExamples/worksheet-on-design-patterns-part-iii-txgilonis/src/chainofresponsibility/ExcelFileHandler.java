package chainofresponsibility;

public class ExcelFileHandler extends BlankHandler {

  public ExcelFileHandler(String excel_handler) {
    this.name = excel_handler;
    this.typeSupported = "excel";
  }
}
