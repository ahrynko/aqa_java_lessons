package seventh_lesson;

public class DbHelper {

    public String[] getDbData (String tableName){

      System.out.println("Retrieving data from following table: " + tableName);
      return new String[]{ "User_1","USer_2",null,"User_4" };

  }
}
