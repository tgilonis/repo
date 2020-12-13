package observer;

//observer - should notify users
public class SMSUsers implements Observer {

  private Subject subject;
  private String description;

  public SMSUsers(Subject subject, String s) {
    this.subject = subject;
    this.description = s;
  }

  @Override
  public void update(String desc) {

    System.out.printf("%s: %s\n", description, desc);

  }

  @Override
  public void subscribe() {
    System.out.printf("Subscribing %s to %s ...\n",description, subject.subjectDetails());
    subject.subscribeObserver(this);

  }

  @Override
  public void unSubscribe() {
    System.out.printf("Unsubscribing %s to %s ...\n",description, subject.subjectDetails());
    subject.unSubscribeObserver(this);

  }
}
