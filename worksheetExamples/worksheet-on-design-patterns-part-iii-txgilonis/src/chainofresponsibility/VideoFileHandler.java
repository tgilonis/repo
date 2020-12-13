package chainofresponsibility;

public class VideoFileHandler extends BlankHandler {

  public VideoFileHandler(String video_handler) {
    this.name = video_handler;
    this.typeSupported = "video";
  }

}
