package sixth_lesson;

public class Main {
  public static void main(String[] args) {

//    int[]array ={ 2,76,0,-6,66};
//    ArraySorter.sortArray(array);

    /* SoftInstaller LinuxInstaller = new Linux();
    LinuxInstaller.installSoft("7z");

    SoftInstaller WindowsInstaller = new Windows();
    WindowsInstaller.installSoft("Call of Duty ");

    SoftInstaller MacOsInstaller = new MacOS();
    MacOsInstaller.installSoft("Git");  */

    Calculator mobileCalculator = new MobileCalculator();  //abstract class calc - my  MobileCalc
    int result = mobileCalculator.sum(20,40);
    System.out.println("Mobile  calculator result " + result);

    Calculator consoleCalculator = new ConsoleCalculator();
    int minusResult = consoleCalculator.minus(27,7);
    System.out.println("Console calculator result " + minusResult);


  }
}
