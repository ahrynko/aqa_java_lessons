package fourth_lesson.oop;

public class Acura {

  private  String color;

  public Acura (String color){
    this.color = color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    return color;
  }

  public Acura(){
    color = "white";
  }

@Override
  public String toString(){
    return String.format("Acura: [color = %s]",color) ;
  }
}
