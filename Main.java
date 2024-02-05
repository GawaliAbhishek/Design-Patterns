
import java.lang.reflect.Constructor;

import SingletonPattern.Samosa;


public class Main {
    public static void main(String[] args) throws Exception{

       Samosa s1= Samosa.getInstanceSamosa();
       //System.out.println(s1.hashCode());

       Samosa s2= Samosa.getInstanceSamosa();
      // System.out.println(s2.hashCode());

       // How to break a singleton pattern 
       /* 1. Reflection API can be used to break a Singleton Pattern
                 Solution -> 1 Through a exception from constructor while creating object 2nd time (check if object has some value the through exception)
        *                    2 Use ENUM not Class so we will not have construtor not any thing 
          2. Deserialze Method -> make the object Deserialize and then again make it serialize so we can create 2 diff object
                 Solution -> Implement readResolve method from serilizable interface in Samosa class and return same instance from that method
          3. Cloning of the object
                solution -> override the Clone() method from cloneable interface and return again the same object from that       
        */ 

        // using reflection Api

        Samosa s3 =Samosa.getInstanceSamosa();
        // access the constructor of the class
        Constructor <Samosa> constructor = Samosa.class.getDeclaredConstructor();

        // change the accessiblity of the constructor to public
        constructor.setAccessible(true);
    
        // make a new instance by using that constructor
        Samosa s4= constructor.newInstance();
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
