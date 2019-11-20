package sixth_lesson;

public class Linux implements SoftInstaller {

  @Override
  public void installSoft(String softName) {
    for (int i  = 0; i <= 10; i ++ ) {
      System.out.println("Installing Linux soft " + softName + "..."); //инсталировать софт и паузить поток
      try {
        Thread.sleep(2000);        // паузить текущий поток
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Done!");
  }
}
