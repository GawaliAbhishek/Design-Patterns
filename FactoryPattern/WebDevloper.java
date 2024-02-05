package FactoryPattern;

public class WebDevloper  implements Employee{

    @Override
    public int getSalary() {
        System.out.println("getting the web devloper salary");
        return 100000;
    }
    
}
