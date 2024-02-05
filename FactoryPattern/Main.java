package FactoryPattern;

/*
 * when there is super class and multiple subclass and we want to get the object of subclasses based on the 
 * input and requirement then we create factory class which takes the responsiblity of creating objects based on
 * input 
 * 
 *  Advantages : Lose Coupling and Not runtime crashes
 */
public class Main {
    public static void main(String[] args) {
         
        Employee emp =EmployeeFactory.getEmployee("WEB DEVLOPER");
        System.out.println(emp.getSalary());

        Employee emp2=EmployeeFactory.getEmployee("ANDROID DEVLOPER");
        System.out.println(emp2.getSalary());

    }

    /*
     *  Here we have a interface which helps to create diff kinds of employees 
     *  but for lose coupling and client depent we use Employee Factory class
     *  to create the employee objects on basis of some input 
     *  so in this way we made a lose coupling of the objects 
     */
}
