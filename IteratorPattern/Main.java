package IteratorPattern;

/* If we want to travese some data structure we have to use diffrent methods for diffrent data stuctures
 *  Iterator Design Pattern helps us to traverse the data structure in only way
 *  That is it is a comman way to which can be used to traverse any of the Data Stucture
 *
 *  A Iterator interface has 2 methods
 *      1. hasNext() -> which returns true or false if we have reach the last element or not
 *      2.next() -> gives pointer to next element
 *
 *  # The iterator pattern provides a way to access the elements of an object without exposing its underlying
 *    implemention
 */
public class Main {

  public static void main(String[] args) {
    UserManagement management = new UserManagement();
    management.addUser(new User("Abhishek", 101));
    management.addUser(new User("Mayur", 121));
    management.addUser(new User("Chandu", 201));
    management.addUser(new User("Nikhil", 131));
    management.addUser(new User("Yash", 107));
    management.addUser(new User("Saurabh", 501));

    MyIterator it = management.getIterator();
    while (it.hasNext()) {
      System.out.println((User) it.next());
    }
  }
}
