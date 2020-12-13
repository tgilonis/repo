package command;

public class SmsJob implements Job {
  private Sms sms;
  @Override
  public void run() {
    System.out.println("JobID: " + Thread.currentThread().getId() + " executing sms jobs.");
    if (sms != null) sms.sendSms();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  public void setSms(Sms sms) {
    this.sms = sms;
  }
}
