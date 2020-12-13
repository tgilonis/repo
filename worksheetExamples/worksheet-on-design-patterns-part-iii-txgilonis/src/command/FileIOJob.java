package command;

public class FileIOJob implements Job {

  private FileIO fileIO;

  @Override
  public void run() {
    System.out.println("Job ID: " + Thread.currentThread().getId() + " executing FileIO jobs");
    if (fileIO != null) {
      fileIO.executeFile();
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }


  }

  public void setFileIO(FileIO fileIO) {
    this.fileIO = fileIO;
  }
}
