package seventh_lesson;

import seventh_lesson.exception.EmptyUserNameException;
import seventh_lesson.exception.UserNotFoundException;

public class DbUser {

  public String getUserName() throws EmptyUserNameException {
    return userName;
  }

  private String userName;

  public DbUser (String userName){
    this.userName = userName;

  }
}
