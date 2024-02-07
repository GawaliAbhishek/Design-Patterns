package AdaptorDesignPattern;

/*  Here the cenario is that we have to use a adaptor class
 *  to use the another class object
 *  Suppose there are 2 phones IPhone and a Andriod Phone
 *  and also we have 2 chargers for them which are interfaces
 *  2 companies which makes such Chargers so 2 company classe
 *
 *  Now we will write a Adaptor class which will use Android Charger to Charger the Iphone
 *
 *  More Details - https://www.youtube.com/watch?v=sWQOvX-kYTE&list=PL0zysOflRCek8kmc_jYl_6C7tpud7U2V_&index=12&ab_channel=LearnCodeWithDurgesh
 */
public class Main {

  public static void main(String[] args) {
    AppleCharger charger = new AdapterCharger(new DKChargers());
    Iphone13 iphone13 = new Iphone13(charger);
    iphone13.chargeIphone();
  }
}
