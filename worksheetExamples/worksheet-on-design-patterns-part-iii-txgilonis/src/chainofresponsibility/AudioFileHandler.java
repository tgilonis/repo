package chainofresponsibility;

public class AudioFileHandler extends BlankHandler {

  public AudioFileHandler(String audio_handler) {
    this.name = audio_handler;
    this.typeSupported = "audio";
  }
}
