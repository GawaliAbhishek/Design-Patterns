package AbstractFactoryPattern;
/*  For Abstract Factory pattern we have to add a another abstract layer in normal Factory class
     here we have normal Factory Structure which is a interface and 2 classes implementing them

     now the EmployeeFactory class it self does not know that which object is going to create 
     it just calling the Abstract class EmpAbstractFactory's createEmployee method 

     now this EmpAbstractFactory is parent of the AndroidDevFactory(for creating the Android Devloper)and
     WebDevFactory (for creating a web devloper) so we pass the object of Android Dev Factory to create that object
     and WebDevFactory to create Web object 

     Simply a new Abstract layer is added in the pattern

     video - https://www.youtube.com/watch?v=D0d2TsfGY2E&list=PL0zysOflRCek8kmc_jYl_6C7tpud7U2V_&index=5&ab_channel=LearnCodeWithDurgesh
 * 
 */

public class Client {

  public static void main(String[] args) {
    
    // I want a Android Devloper
    Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
    e1.getName();

    // I want a Web Devloper
    Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
    e2.getName();
  }
}
