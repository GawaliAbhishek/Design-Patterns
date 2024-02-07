package AdaptorDesignPattern;

public class AdapterCharger implements AppleCharger {

 private  AndriodCharger charger;


  public AdapterCharger(AndriodCharger charger) {
    this.charger = charger;
}


@Override
  public void chargeIPhone() {
    charger.chargeAndroidPhone();
    System.out.println(" Iphone is charging by android charger");
  }
}
