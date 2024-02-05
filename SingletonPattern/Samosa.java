package SingletonPattern;

/*
 *  1. Make a constructor private 
 *  2. Make a static method which will return the instance of the class
 *  3. Make a private variable also it must be static so it can be used in static method mention above
 *     and use it to return instance
 *  4. Apply a if condition such that if that variable is null then only create a object 
 * 
 * This is  Lazy way of creatinga singleton object ( When client needs obj for first time then instance will create)
 */

public class Samosa {

    // made constructor private
     private Samosa(){
        if(object!=null){
            throw new RuntimeException("You are trying to break singleton pattern");
        }
     }

     // private static variable to return a object
     private static Samosa object;

    // public method to access the instance but instance must be created only once
     public static Samosa getInstanceSamosa(){

        if(object == null){
            object=new Samosa();
        }

        return object;
     }


}
