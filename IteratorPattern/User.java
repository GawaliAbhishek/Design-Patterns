package IteratorPattern;

public class User {

  private String name;
  private int userId;

  public User(String name, int userId) {
    this.name = name;
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "User [name=" + name + ", userId=" + userId + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
