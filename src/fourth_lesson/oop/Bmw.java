package fourth_lesson.oop;

public class Bmw extends Car{

  public Bmw(String model){
    super(model);  //вызвать конструктор супер класса
  }
@Override
  public void print(){
    System.out.println("Incide class Bmw!");
  }

}
