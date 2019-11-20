package sixth_lesson;

public interface SoftInstaller {

  static final String field = ""; //будет лоступно всем нашим классам

  void installSoft(String softName);  // только сигнатура, а реализация в каждом классе своя!!!(до 1.8 java)

  public default void installSomeOtherSoft(){         //можно  переопределить дефолтный метод в классе
    System.out.println("Installing some other soft...");   // общая реализация для всех

  }

}
