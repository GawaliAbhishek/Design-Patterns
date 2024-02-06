package AbstractFactoryPattern;

public class EmployeeFactory {

  public static Employee getEmployee(EmpAbstractFactory factory) {
    return factory.createEmployee();
  }
}
