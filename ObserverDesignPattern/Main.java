package ObserverDesignPattern;

/* 1. It is Behavioural Design Pattern
 * 2. In this when subject changes the state all its dependent objects are notified the change
 * 3. It is like One to Many relation
 * 
 *  So here we have a example of youtube channel and subscriber 
 *  as Subscribers are notified in same way every object will be notified 
 *  So Here our Observer is the subscriber and the Subject is the Youtube Channel
 */
public class Main {

  public static void main(String[] args) {
    YoutubeChannel channel = new YoutubeChannel();
    Subscriber aman = new Subscriber("Aman");
    channel.subscribe(aman);
    Subscriber chaman = new Subscriber("Chaman");
    channel.subscribe(chaman);

    channel.notifyChanges();
  }
}
