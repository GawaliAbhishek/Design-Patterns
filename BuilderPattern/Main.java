package BuilderPattern;
/* 
        There are some problems in Factory Design pattern 
        while creating the object when object contains mant attributes there are many problems exists
        1. Have to pass many arguments to create a object
        2. some params may be optional
        3. factory class takes the all responsibililty of creating a object 
           if the object is heavy then all the complexity is the part of factory class
        
        So to over come this in builder pattern we create a object step by step and finally return a 
        final object with desired values of attributes

        # it helps us to create Immutable objects

     You have to write getters only in the User class and make the field and constructor private
     so it can not be acces from outside . also make the fields final to achive immutability if not wanted dont make
      now make a inner class UserBuilder which has the same fields which are there in user class
      and now write only setters of those fields. return this from each setter such that after setting the field 
      it must return the object of the builder class every time
      finally write a build method which returns the User Object create a user Object by using the constructor 
      also pass this in that constructor. Here in User class we have private constructor which takes a Builder class
      object as parameter and uses it to set the fileds.

      Here we create a builder pattern which is help full when we have to many arguments and wannt to set some of them 
 * 
 */

public class Main {
    public static void main(String[] args) {
        
        User u=new User.UserBuilder().setEmail("abhi@gmail.com").setUserName("Abhishek").build();
        System.out.println(u.toString());
    }
}
