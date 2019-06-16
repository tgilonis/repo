package dependencyinjection.src.decoupledinterface;

public interface MessageRenderer {

  void render();

  void setMessageProvider(MessageProvider provider);
}
