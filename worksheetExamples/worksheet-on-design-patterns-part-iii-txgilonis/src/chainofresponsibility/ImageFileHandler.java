package chainofresponsibility;

public class ImageFileHandler extends BlankHandler {

  public ImageFileHandler(String image_handler) {
    this.name = image_handler;
  }

  @Override
  public void process(File file) {
    if (file.getFileType() == "image") {
      System.out.printf("Processing and saving %s file... By %s\n", file.getFileType(), getHandlerName());
    } else {
      System.out.println("File not supported");
    }
  }
}
