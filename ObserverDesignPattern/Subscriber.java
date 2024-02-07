package ObserverDesignPattern;

public class Subscriber implements Observer {

  String name;

  Subscriber(String name) {
    this.name = name;
  }

  @Override
  public void getNotified() {
    System.out.println("Hey " + this.name + " New Video Uploded");
  }
}
