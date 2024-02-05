package SingletonPattern;

/*
 *  If we are working under thread safty so we cannot use egar or lazy singleton pattern
 *  so have to use some synchronized way such that one thread only at a time can create a object
 *  if we dont do so we will be have 2 objects created by 2 diff threads
 *  so to make it sync we use keyword synchronized in java
 *  we can make method syncronized by using this keyword
 *  or we can use syncronized block
 *
 *  so here as we need only object creation line to be synchronized not the whole method
 *  we will use Syncronized blocks
 */
public class SyncSamosa {

  private SyncSamosa() {}

  private static SyncSamosa object;

  public static SyncSamosa getInstanceSyncSamosa() {
    if (object == null) {
        
      // Synchronized block (which can be executed by one thread at a time)
      synchronized (SyncSamosa.class) {

        // if object is still null then create a new object
        if (object == null) object = new SyncSamosa();
      }
    }

    return object;
  }
}
