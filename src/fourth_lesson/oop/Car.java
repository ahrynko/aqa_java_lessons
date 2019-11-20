package fourth_lesson.oop;

public class Car {

  private String carModel;

  public Car(String carModel){
    this.carModel = carModel;
  }

  public String getCarModel(){
    return carModel;
  }
  public  void print(){
    System.out.println("Inside class Car!");

  }

}

