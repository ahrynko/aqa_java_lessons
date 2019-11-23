package seventh_lesson;

import seventh_lesson.exception.EmptyUserNameException;

public class UserPrinter {

  public void printUserName() throws EmptyUserNameException {
    DbUser dbUser = new DbUser("");
    dbUser.getUserName();
  }
}
