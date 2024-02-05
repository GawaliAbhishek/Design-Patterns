package SingletonPattern;

/*Egar way of creating the singleton object ( Object will be already created before anyone ask for it) */
public class Jalebi {

  // made constructor private
  private Jalebi() {}

  // made a private object and inirilized it here only
  private static Jalebi object = new Jalebi();

  // static method returns instance
  public static Jalebi getInstanceJalebi() {
    return object;
  }
}
