package BuilderPattern;

public class User {

  private final String userName;
  private final int userId;
  private final String email;

  private User(UserBuilder builder) {
    this.userName = builder.userName;
    this.userId = builder.userId;
    this.email = builder.email;
  }

  public String getUserName() {
    return userName;
  }

  public int getUserId() {
    return userId;
  }

  public String getEmail() {
    return email;
  }

  

  // Inner Builder Class to build the objct

  @Override
public String toString() {
    return "User [userName=" + userName + ", userId=" + userId + ", email=" + email + "]";
}



static class UserBuilder {

    private String userName;
    private int userId;
    private String email;

    public UserBuilder setUserName(String userName) {
      this.userName = userName;
      return this;
    }

    public UserBuilder setUserId(int userId) {
      this.userId = userId;
      return this;
    }

    public UserBuilder setEmail(String email) {
      this.email = email;
      return this;
    }

    public User build() {
      User user = new User(this);
      return user;
    }
  }
}
