package seventh_lesson.exception;

public class UserNotFoundException extends RuntimeException {  // создали свой Exception

  public UserNotFoundException(String message){
    super(message);
  }

  public UserNotFoundException(String message, Throwable throwable){  // object Throwable
    super(message, throwable);  // протащить в супер класс
  }



}
