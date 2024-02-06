package AbstractFactoryPattern;

public class AndroidDevFactory extends EmpAbstractFactory {

  @Override
  public Employee createEmployee() {
    return new AndroidDevloper();
  }
}
