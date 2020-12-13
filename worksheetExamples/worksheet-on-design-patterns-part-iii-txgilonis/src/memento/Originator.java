package memento;

public class Originator {
  private double x;
  private double y;

  private String lastUndoSavepoint;
  CareTaker careTaker;

  public Originator(double x, double y, CareTaker careTaker) {
    this.careTaker = careTaker;
    setX(x);
    setY(y);
    createSavepoint("INITIAL");
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public void createSavepoint(String savepointName) {
    Memento memento = new Memento(getX(), getY());
    careTaker.saveMemento(memento, savepointName);
    lastUndoSavepoint = savepointName;
  }

  public void undo() {
    setOriginatorState(lastUndoSavepoint);
  }

  public void undo(String savepointName) {
    Memento memento = careTaker.getMemento(savepointName);
    setX(memento.getX());
    setY(memento.getY());
  }

  public void undoAll() {
    setOriginatorState("INITIAL");
    careTaker.clearSavepoints();
  }

  private void setOriginatorState(String savepointName) {
    Memento memento = careTaker.getMemento(savepointName);
    setX(memento.getX());
    setY(memento.getY());
  }

  @Override
  public String toString() {
    return "X: " + x + ", Y: " + y;
  }
}