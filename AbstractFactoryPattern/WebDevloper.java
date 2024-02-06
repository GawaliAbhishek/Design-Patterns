package AbstractFactoryPattern;

public class WebDevloper implements Employee {

    @Override
    public int getSalary() {
        return 900000;
    }

    @Override
    public String getName() {
       System.out.println("Hey here is Web devloper");
       return "WEB DEVLOPER";
    }
    
}
