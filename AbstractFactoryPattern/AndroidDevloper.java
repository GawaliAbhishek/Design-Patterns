package AbstractFactoryPattern;

public class AndroidDevloper  implements Employee{

    @Override
    public int getSalary() {
       return 200000;
    }

    @Override
    public String getName() {
        System.out.println("Hey Here is Android Devloper");
       return "ANDROID DEVLOPER";
    }
    
}
