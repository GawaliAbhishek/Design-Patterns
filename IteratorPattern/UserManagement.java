package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

  private List<User> users = new ArrayList<>();

  public void addUser(User user) {
    users.add(user);
  }

  public User getUser(int index) {
    return users.get(index);
  }

  public MyIterator getIterator() {
    return new IteratorImpl(users);
  }
}
