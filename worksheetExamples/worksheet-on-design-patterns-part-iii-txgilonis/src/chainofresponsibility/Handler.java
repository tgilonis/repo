package chainofresponsibility;

public interface Handler {

  String getTypeSupported();

  void setHandler(Handler handler);

  void process(File file);

  String getHandlerName();

  void forwarding();
}