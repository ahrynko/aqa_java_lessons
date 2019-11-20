package sixth_lesson;

public abstract class  Calculator {

  private String calcType;

  public Calculator(){  // конструктор - инициализация объекта
     calcType = getCalcType();
    System.out.println("Using "+ calcType);
  }

  public abstract String getCalcType(); //абстрактный метод. только сигнатура.  Разные калькуляторы

  public int sum(int a, int b ){
    return  a + b;
  }
  public int minus (int a, int b ){
    return  a - b;
  }
  public int div(int a, int b ){
    return  a / b;
  }
  public int mult (int a, int b ){
    return  a * b;
  }

}
