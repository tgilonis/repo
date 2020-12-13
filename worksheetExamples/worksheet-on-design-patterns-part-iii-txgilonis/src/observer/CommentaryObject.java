package observer;

import java.util.List;
//subject - updates observers
public class CommentaryObject implements Subject, Commentary {

  private List<Observer> observerList;
  private String description;
  private String match;

  public CommentaryObject(List<Observer> observers, String s) {
    this.observerList = observers;
    this.match = s;
  }

  @Override
  public void setDesc(String desc) {
    this.description = desc;
    notifyObservers();
  }

  @Override
  public void subscribeObserver(Observer observer) {
    observerList.add(observer);
    System.out.println("Subscribed successfully.");
  }

  @Override
  public void unSubscribeObserver(Observer observer) {
    observerList.remove(observer);
    System.out.println("Unsubscribed successfully.");
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observerList) {
      observer.update(description);
    }
  }

  @Override
  public String subjectDetails() {
    return match;
  }
}
