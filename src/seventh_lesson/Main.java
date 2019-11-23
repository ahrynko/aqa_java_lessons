package seventh_lesson;

import seventh_lesson.exception.EmptyUserNameException;
import seventh_lesson.exception.UserNotFoundException;

public class Main {
  public static void main(String[] args){

//    Integer [] array = {10,20,null,30,40,50,60};

    DbHelper dbHelper = new DbHelper();
    DbUser[] dbUsers = new DbUser[4];  // создали массив юзеров, без выделения памяти

    String[]users = dbHelper.getDbData("users");
    for ( int i = 0; i < dbUsers.length; i++){       //for (String user : users)
      String uniqueUserName = String.format("User_%d", i);

      dbUsers[i] = new DbUser("");
      try {
         if (dbUsers[i].getUserName().equals("")){   //выброс Exception условием, нужна проверка!!!
           throw new EmptyUserNameException("empty username");
         }
      } catch (EmptyUserNameException e) {
        e.printStackTrace();
      }

      /* каждый dbUsers получает массив из списка String[]users
      нужно для каждого объекта в массиве выделять память
      чтобы создать конкретного юзера  */
//      System.out.println(dbUsers[i] = new DbUser(uniqueUserName));

      /* try {
        dbUsers[i].getUserName();      // генерация случайного юзера   getUserName()
      } catch (Exception e){  // e instance (экземпляр)
        throw new UserNotFoundException("User is null");  //my Exception, обертка над try-catch  */
//        System.out.println("User is null!!!");
//        break;
      }

//      if (dbUsers[i] == null) {  // хоть один user = null
//        throw new UserNotFoundException("User is null");  // my create Exception
//
//      }

    }
  }

