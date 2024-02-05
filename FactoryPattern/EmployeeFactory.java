package FactoryPattern;

public class EmployeeFactory {

  public static Employee getEmployee(String empType) {
    if (
      empType.trim().equalsIgnoreCase("ANDROID DEVLOPER")
    ) return new AndriodDevloper(); else if (
      empType.trim().equalsIgnoreCase("WEB DEVLOPER")
    ) return new WebDevloper(); else return null;
  }
}
