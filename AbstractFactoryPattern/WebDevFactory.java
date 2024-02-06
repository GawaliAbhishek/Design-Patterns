package AbstractFactoryPattern;

public class WebDevFactory extends EmpAbstractFactory {

  @Override
  public Employee createEmployee() {
    return new WebDevloper();
  }
}
